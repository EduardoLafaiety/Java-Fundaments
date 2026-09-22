package br.com.eduardo.poo.dominio;

import br.com.eduardo.poo.enums.StatusPedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Agregado que protege as regras de inclusão de itens e finalização.
 */
public final class Pedido {

    private final UUID id;
    private final Cliente cliente;
    private final List<ItemPedido> itens;
    private StatusPedido status;

    public Pedido(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente é obrigatório.");
        }
        this.id = UUID.randomUUID();
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = StatusPedido.CRIADO;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        // Toda alteração passa por este método para preservar a regra do status.
        exigirPedidoAberto();
        itens.add(new ItemPedido(produto, quantidade));
    }

    public void finalizar() {
        exigirPedidoAberto();
        if (itens.isEmpty()) {
            throw new IllegalStateException("Não é possível finalizar um pedido vazio.");
        }
        status = StatusPedido.FINALIZADO;
    }

    public BigDecimal calcularTotal() {
        return itens.stream()
                .map(ItemPedido::calcularSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private void exigirPedidoAberto() {
        if (status != StatusPedido.CRIADO) {
            throw new IllegalStateException("A operação exige um pedido com status CRIADO.");
        }
    }

    public UUID getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        // A leitura é permitida, mas a lista interna não pode ser alterada de fora.
        return Collections.unmodifiableList(itens);
    }

    public StatusPedido getStatus() {
        return status;
    }
}
