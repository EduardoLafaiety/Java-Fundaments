package br.com.logica.projeto;

import java.util.Scanner;

public final class AnalisadorDeNotas {

    private AnalisadorDeNotas() {
    }

    public static void executar(Scanner scanner) {
        System.out.println("\n--- Projeto: analisador de notas ---");
        System.out.print("Nome do estudante: ");
        String nome = scanner.nextLine();

        int quantidade = lerQuantidadeDeNotas(scanner);
        // O tamanho informado define quantas posições o array terá.
        double[] notas = new double[quantidade];

        // indice começa em zero, mas mostramos indice + 1 para a leitura ficar natural.
        for (int indice = 0; indice < notas.length; indice++) {
            notas[indice] = lerNota(scanner, indice + 1);
        }

        double media = calcularMedia(notas);

        System.out.println("\nResultado de " + nome);
        System.out.printf("Média: %.2f%n", media);
        System.out.printf("Maior nota: %.2f%n", encontrarMaiorNota(notas));
        System.out.printf("Menor nota: %.2f%n", encontrarMenorNota(notas));
        System.out.println("Situação: " + definirSituacao(media));
    }

    public static double calcularMedia(double[] notas) {
        validarNotas(notas);

        double soma = 0;
        // O for-each é suficiente porque precisamos dos valores, não dos índices.
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static double encontrarMaiorNota(double[] notas) {
        validarNotas(notas);

        double maiorNota = notas[0];
        for (double nota : notas) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }
        return maiorNota;
    }

    public static double encontrarMenorNota(double[] notas) {
        validarNotas(notas);

        double menorNota = notas[0];
        for (double nota : notas) {
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        return menorNota;
    }

    public static String definirSituacao(double media) {
        // A ordem preserva as faixas: primeiro aprovação, depois recuperação.
        if (media >= 7.0) {
            return "APROVADO";
        }
        if (media >= 5.0) {
            return "RECUPERAÇÃO";
        }
        return "REPROVADO";
    }

    private static int lerQuantidadeDeNotas(Scanner scanner) {
        // O laço só termina quando encontramos uma quantidade válida.
        while (true) {
            System.out.print("Quantidade de notas: ");
            if (scanner.hasNextInt()) {
                int quantidade = scanner.nextInt();
                scanner.nextLine();
                if (quantidade > 0) {
                    return quantidade;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Informe um número inteiro maior que zero.");
        }
    }

    private static double lerNota(Scanner scanner, int numeroDaNota) {
        while (true) {
            System.out.printf("Nota %d (0 a 10): ", numeroDaNota);
            if (scanner.hasNextDouble()) {
                double nota = scanner.nextDouble();
                scanner.nextLine();
                if (nota >= 0 && nota <= 10) {
                    return nota;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Nota inválida. Use um valor entre 0 e 10.");
        }
    }

    private static void validarNotas(double[] notas) {
        // Sem valores não existe média, maior ou menor nota.
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("A lista de notas não pode estar vazia.");
        }
    }
}
