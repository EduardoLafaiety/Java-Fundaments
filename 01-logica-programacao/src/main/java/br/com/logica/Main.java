package br.com.logica;

import br.com.logica.decisoes.EstruturasCondicionais;
import br.com.logica.estruturas.VetoresEMatrizes;
import br.com.logica.fundamentos.Operadores;
import br.com.logica.fundamentos.VariaveisETipos;
import br.com.logica.metodos.ExemploMetodos;
import br.com.logica.projeto.AnalisadorDeNotas;
import br.com.logica.repeticoes.EstruturasDeRepeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;

            // O menu precisa aparecer ao menos uma vez, por isso usamos do-while.
            do {
                exibirMenu();
                opcao = lerOpcao(scanner);

                switch (opcao) {
                    case 1 -> VariaveisETipos.executar();
                    case 2 -> Operadores.executar();
                    case 3 -> EstruturasCondicionais.executar();
                    case 4 -> EstruturasDeRepeticao.executar();
                    case 5 -> VetoresEMatrizes.executar();
                    case 6 -> ExemploMetodos.executar();
                    case 7 -> AnalisadorDeNotas.executar(scanner);
                    case 0 -> System.out.println("Até a próxima! Continue praticando.");
                    default -> System.out.println("Opção inválida. Digite um número de 0 a 7.");
                }
            } while (opcao != 0);
        }
    }

    private static void exibirMenu() {
        System.out.println("\n========================================");
        System.out.println("   LÓGICA DE PROGRAMAÇÃO COM JAVA");
        System.out.println("========================================");
        System.out.println("1 - Variáveis e tipos");
        System.out.println("2 - Operadores");
        System.out.println("3 - Estruturas condicionais");
        System.out.println("4 - Estruturas de repetição");
        System.out.println("5 - Vetores e matrizes");
        System.out.println("6 - Métodos");
        System.out.println("7 - Projeto: analisador de notas");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao(Scanner scanner) {
        // Validamos antes de ler para que uma palavra não encerre o programa com erro.
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Digite um número: ");
            scanner.nextLine();
        }

        int opcao = scanner.nextInt();
        // nextInt não consome a quebra de linha; nextLine prepara a próxima leitura.
        scanner.nextLine();
        return opcao;
    }
}
