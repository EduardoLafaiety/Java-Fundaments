package br.com.eduardo.poo.dominio;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Abstração com o estado e os comportamentos comuns a todos os produtos.
 */
public abstract class Produto {

    private final UUID id;
    private final String nome;
    private final BigDecimal precoBase;

    protected Produto(String nome, BigDecimal precoBase) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do produto não pode ficar vazio.");
        }
        if (precoBase == null || precoBase.signum() < 0) {
            throw new IllegalArgumentException("O preço base não pode ser negativo.");
        }

        // O construtor da classe mãe prepara a parte comum de todo produto.
        this.id = UUID.randomUUID();
        this.nome = nome.trim();
        this.precoBase = precoBase;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPrecoBase() {
        return precoBase;
    }

    /** Cada subtipo fornece sua própria regra de preço final. */
    public abstract BigDecimal calcularPrecoFinal();

    public abstract String getTipo();
}
