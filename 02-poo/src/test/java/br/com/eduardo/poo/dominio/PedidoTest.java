package br.com.eduardo.poo.dominio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PedidoTest {

    private Pedido pedido;

    @BeforeEach
    void prepararPedido() {
        Cliente cliente = new Cliente("João Lima", "joao@email.com");
        pedido = new Pedido(cliente);
    }

    @Test
    void deveCalcularTotalComProdutosDiferentes() {
        pedido.adicionarProduto(
                new ProdutoFisico("Livro", new BigDecimal("100.00"), BigDecimal.ZERO),
                1
        );
        pedido.adicionarProduto(
                new CursoOnline("Java", new BigDecimal("200.00"), new BigDecimal("10")),
                2
        );

        assertEquals(new BigDecimal("470.00"), pedido.calcularTotal());
    }

    @Test
    void naoDeveFinalizarPedidoVazio() {
        assertThrows(IllegalStateException.class, pedido::finalizar);
    }

    @Test
    void naoDeveAdicionarProdutoDepoisDeFinalizar() {
        Produto produto = new CursoOnline("Java", new BigDecimal("100.00"), BigDecimal.ZERO);
        pedido.adicionarProduto(produto, 1);
        pedido.finalizar();

        assertThrows(IllegalStateException.class, () -> pedido.adicionarProduto(produto, 1));
    }
}

