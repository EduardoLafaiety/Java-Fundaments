package br.com.logica.decisoes;

public final class EstruturasCondicionais {

    private EstruturasCondicionais() {
    }

    public static void executar() {
        double media = 7.5;
        int diaDaSemana = 6;

        System.out.println("\n--- Estruturas condicionais ---");

        // Testamos da faixa mais alta para a mais baixa para não classificar 7.5 como recuperação.
        if (media >= 7.0) {
            System.out.println("Situação: aprovado");
        } else if (media >= 5.0) {
            System.out.println("Situação: recuperação");
        } else {
            System.out.println("Situação: reprovado");
        }

        // switch funciona bem quando comparamos um valor com opções específicas.
        String tipoDeDia = switch (diaDaSemana) {
            case 1, 7 -> "fim de semana";
            case 2, 3, 4, 5, 6 -> "dia útil";
            default -> "dia inválido";
        };

        System.out.println("O dia informado é: " + tipoDeDia);
    }
}
