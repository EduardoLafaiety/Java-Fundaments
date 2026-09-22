package br.com.eduardo.poo;

import br.com.eduardo.poo.dominio.Cliente;
import br.com.eduardo.poo.dominio.CursoOnline;
import br.com.eduardo.poo.dominio.ItemPedido;
import br.com.eduardo.poo.dominio.Pedido;
import br.com.eduardo.poo.dominio.Produto;
import br.com.eduardo.poo.dominio.ProdutoFisico;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Ponto de entrada: cria objetos e demonstra a colaboração entre eles.
 */
public final class App {

    private static final NumberFormat MOEDA =
            NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

    private App() {
    }

    public static void main(String[] args) {
        // new chama o construtor e cria um objeto Cliente pronto para uso.
        Cliente ana = new Cliente("Ana Souza", "ana@email.com");

        // Mesmo tipo de referência, objetos e comportamentos diferentes.
        Produto teclado = new ProdutoFisico(
                "Teclado mecânico",
                new BigDecimal("250.00"),
                new BigDecimal("20.00")
        );

        Produto cursoJava = new CursoOnline(
                "Curso de Java",
                new BigDecimal("180.00"),
                new BigDecimal("15")
        );

        // Pedido recebe os objetos e coordena a colaboração entre eles.
        Pedido pedido = new Pedido(ana);
        pedido.adicionarProduto(teclado, 1);
        pedido.adicionarProduto(cursoJava, 2);
        pedido.finalizar();

        imprimirResumo(pedido);
    }

    private static void imprimirResumo(Pedido pedido) {
        System.out.println("PEDIDO " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Status: " + pedido.getStatus());
        System.out.println("-".repeat(40));

        for (ItemPedido item : pedido.getItens()) {
            Produto produto = item.getProduto();
            System.out.printf(
                    "%dx %s (%s) — %s%n",
                    item.getQuantidade(),
                    produto.getNome(),
                    produto.getTipo(),
                    MOEDA.format(item.calcularSubtotal())
            );
        }

        System.out.println("-".repeat(40));
        System.out.println("Total do pedido: " + MOEDA.format(pedido.calcularTotal()));
    }
}
