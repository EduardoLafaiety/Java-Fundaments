package br.com.logica.fundamentos;

public final class Operadores {

    private Operadores() {
    }

    public static void executar() {
        int numeroA = 10;
        int numeroB = 3;
        int idade = 20;
        boolean possuiIngresso = true;

        System.out.println("\n--- Operadores ---");
        System.out.println("Soma: " + (numeroA + numeroB));
        System.out.println("Subtração: " + (numeroA - numeroB));
        System.out.println("Multiplicação: " + (numeroA * numeroB));
        // Como os dois valores são int, a parte decimal da divisão não é guardada.
        System.out.println("Divisão inteira: " + (numeroA / numeroB));
        System.out.println("Resto da divisão: " + (numeroA % numeroB));

        boolean maiorDeIdade = idade >= 18;
        // && exige que as duas condições sejam verdadeiras ao mesmo tempo.
        boolean podeEntrar = maiorDeIdade && possuiIngresso;

        System.out.println("É maior de idade? " + maiorDeIdade);
        System.out.println("Pode entrar no evento? " + podeEntrar);
    }
}
