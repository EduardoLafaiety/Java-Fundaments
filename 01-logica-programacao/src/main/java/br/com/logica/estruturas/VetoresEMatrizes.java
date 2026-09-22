package br.com.logica.estruturas;

import java.util.Arrays;

public final class VetoresEMatrizes {

    private VetoresEMatrizes() {
    }

    public static void executar() {
        double[] notas = {8.0, 7.5, 9.0, 6.5};
        int[][] tabela = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n--- Vetores e matrizes ---");
        System.out.println("Notas: " + Arrays.toString(notas));

        double soma = 0;
        // O for-each visita cada nota sem precisar controlar o índice.
        for (double nota : notas) {
            soma += nota;
        }
        System.out.printf("Média: %.2f%n", soma / notas.length);

        System.out.println("Matriz:");
        // Uma matriz exige um laço para as linhas e outro para os valores de cada linha.
        for (int[] linha : tabela) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
