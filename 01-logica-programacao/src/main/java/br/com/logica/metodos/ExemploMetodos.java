package br.com.logica.metodos;

public final class ExemploMetodos {

    private ExemploMetodos() {
    }

    public static void executar() {
        int primeiroNumero = 12;
        int segundoNumero = 8;

        System.out.println("\n--- Métodos ---");
        System.out.printf("%d + %d = %d%n",
                primeiroNumero,
                segundoNumero,
                somar(primeiroNumero, segundoNumero));

        System.out.println(criarSaudacao("Maria"));
        System.out.println("10 é par? " + ehPar(10));
    }

    public static int somar(int numeroA, int numeroB) {
        // Os parâmetros recebem os valores; return devolve o resultado a quem chamou.
        return numeroA + numeroB;
    }

    public static String criarSaudacao(String nome) {
        return "Olá, " + nome + "! Bem-vinda aos estudos de Java.";
    }

    public static boolean ehPar(int numero) {
        // Todo número par deixa resto zero quando dividido por 2.
        return numero % 2 == 0;
    }
}
