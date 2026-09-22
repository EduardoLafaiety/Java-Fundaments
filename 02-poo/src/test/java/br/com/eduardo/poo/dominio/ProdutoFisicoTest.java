package br.com.eduardo.poo.dominio;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoFisicoTest {

    @Test
    void deveSomarImpostoEFreteAoPrecoFinal() {
        Produto produto = new ProdutoFisico(
                "Mouse",
                new BigDecimal("100.00"),
                new BigDecimal("15.00")
        );

        assertEquals(new BigDecimal("125.00"), produto.calcularPrecoFinal());
    }
}

