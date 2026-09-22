package br.com.eduardo.poo.dominio;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Compõe um produto e sua quantidade dentro de um pedido.
 */
public final class ItemPedido {

    private final Produto produto;
    private final int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        if (produto == null) {
            throw new IllegalArgumentException("O produto é obrigatório.");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public BigDecimal calcularSubtotal() {
        return produto.calcularPrecoFinal()
                .multiply(BigDecimal.valueOf(quantidade))
                .setScale(2, RoundingMode.HALF_EVEN);
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

