package br.com.eduardo.poo.dominio;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Especialização de Produto cuja regra aplica desconto ao preço base.
 */
public final class CursoOnline extends Produto {

    private static final BigDecimal CEM = new BigDecimal("100");
    private final BigDecimal percentualDesconto;

    public CursoOnline(String nome, BigDecimal precoBase, BigDecimal percentualDesconto) {
        // super envia os dados comuns para o construtor de Produto.
        super(nome, precoBase);
        if (percentualDesconto == null
                || percentualDesconto.signum() < 0
                || percentualDesconto.compareTo(CEM) > 0) {
            throw new IllegalArgumentException("O desconto deve estar entre 0 e 100.");
        }
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public BigDecimal calcularPrecoFinal() {
        // Esta implementação substitui a regra abstrata declarada em Produto.
        BigDecimal desconto = getPrecoBase()
                .multiply(percentualDesconto)
                .divide(CEM, 2, RoundingMode.HALF_EVEN);

        return getPrecoBase()
                .subtract(desconto)
                .setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String getTipo() {
        return "Curso online";
    }

    public BigDecimal getPercentualDesconto() {
        return percentualDesconto;
    }
}
