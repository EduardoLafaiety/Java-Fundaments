package br.com.eduardo.poo.dominio;

import java.util.Objects;
import java.util.UUID;

/**
 * Representa a pessoa que realiza um pedido.
 * O construtor protege as regras mínimas para um cliente válido.
 */
public final class Cliente {

    private final UUID id;
    private final String nome;
    private final String email;

    public Cliente(String nome, String email) {
        this.id = UUID.randomUUID();
        // this.nome é o atributo do objeto; nome é o parâmetro recebido.
        this.nome = validarTexto(nome, "nome");
        this.email = validarEmail(email);
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    private static String validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("O " + campo + " não pode ficar vazio.");
        }
        return valor.trim();
    }

    private static String validarEmail(String email) {
        String emailValidado = validarTexto(email, "e-mail");
        // Esta é uma validação intencionalmente simples para manter o foco em POO.
        if (!emailValidado.contains("@")) {
            throw new IllegalArgumentException("Informe um e-mail válido.");
        }
        return emailValidado.toLowerCase();
    }

    @Override
    public boolean equals(Object outro) {
        if (this == outro) return true;
        if (!(outro instanceof Cliente cliente)) return false;
        return id.equals(cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
