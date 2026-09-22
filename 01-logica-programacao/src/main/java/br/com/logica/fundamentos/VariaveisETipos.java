package br.com.logica.fundamentos;

public final class VariaveisETipos {

    private VariaveisETipos() {
    }

    public static void executar() {
        // Cada tipo representa uma categoria de informação diferente.
        String nome = "Ana";
        int idade = 22;
        double altura = 1.67;
        boolean estudaJava = true;
        char nivel = 'I';

        System.out.println("\n--- Variáveis e tipos ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Estuda Java? " + estudaJava);
        System.out.println("Nível atual: " + nivel);

        // Uma variável também pode guardar o resultado de um processamento.
        int proximaIdade = idade + 1;
        System.out.println(nome + " fará " + proximaIdade + " anos no próximo aniversário.");
    }
}
