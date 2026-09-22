package br.com.eduardo.poo.dominio;

import br.com.eduardo.poo.contrato.Tributavel;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Especialização de Produto que adiciona imposto e frete.
 */
public final class ProdutoFisico extends Produto implements Tributavel {

    private static final BigDecimal ALIQUOTA_IMPOSTO = new BigDecimal("0.10");
    private final BigDecimal frete;

    public ProdutoFisico(String nome, BigDecimal precoBase, BigDecimal frete) {
        super(nome, precoBase);
        if (frete == null || frete.signum() < 0) {
            throw new IllegalArgumentException("O frete não pode ser negativo.");
        }
        this.frete = frete;
    }

    @Override
    public BigDecimal calcularImposto() {
        // BigDecimal evita imprecisões comuns de double em cálculos monetários.
        return getPrecoBase()
                .multiply(ALIQUOTA_IMPOSTO)
                .setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public BigDecimal calcularPrecoFinal() {
        return getPrecoBase()
                .add(calcularImposto())
                .add(frete)
                .setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String getTipo() {
        return "Produto físico";
    }

    public BigDecimal getFrete() {
        return frete;
    }
}
