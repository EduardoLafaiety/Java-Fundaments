package br.com.logica.repeticoes;

public final class EstruturasDeRepeticao {

    private EstruturasDeRepeticao() {
    }

    public static void executar() {
        System.out.println("\n--- Estruturas de repetição ---");

        System.out.println("Contagem com for:");
        for (int numero = 1; numero <= 5; numero++) {
            System.out.print(numero + " ");
        }

        System.out.println("\nTabuada do 3 com while:");
        int multiplicador = 1;
        while (multiplicador <= 5) {
            System.out.printf("3 x %d = %d%n", multiplicador, 3 * multiplicador);
            multiplicador++;
        }

        System.out.println("Tentativa com do-while:");
        int tentativa = 1;
        do {
            // Este bloco executa antes de a condição ser verificada.
            System.out.println("Tentativa número " + tentativa);
            tentativa++;
        } while (tentativa <= 2);

        System.out.println("Percorrendo uma lista com for-each:");
        String[] tecnologias = {"Java", "Spring", "PostgreSQL"};
        for (String tecnologia : tecnologias) {
            System.out.println("- " + tecnologia);
        }
    }
}
