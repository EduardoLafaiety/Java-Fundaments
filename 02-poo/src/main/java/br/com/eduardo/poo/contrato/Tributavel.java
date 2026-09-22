package br.com.eduardo.poo.contrato;

import java.math.BigDecimal;

/**
 * Contrato para objetos capazes de calcular o próprio imposto.
 */
public interface Tributavel {

    BigDecimal calcularImposto();
}

