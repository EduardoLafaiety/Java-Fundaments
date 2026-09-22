# 4. Polimorfismo

## O que você vai aprender

Como usar objetos diferentes por um tipo comum, sobrescrever métodos e fazer casting com segurança.

## Conceito

Polimorfismo permite tratar objetos diferentes por meio de um tipo comum, preservando o comportamento específico de cada objeto.

`ItemPedido` recebe um `Produto`:

```java
public ItemPedido(Produto produto, int quantidade) {
    this.produto = produto;
    this.quantidade = quantidade;
}
```

Esse parâmetro pode receber `ProdutoFisico`, `CursoOnline` ou qualquer futura subclasse válida.

Ao executar:

```java
produto.calcularPrecoFinal();
```

Java escolhe a implementação da **classe real do objeto**. Um produto físico soma imposto e frete; um curso aplica desconto.

## Tipo da referência × tipo do objeto

```java
Produto produto = new CursoOnline(...);
```

- tipo da referência: `Produto`;
- tipo real do objeto: `CursoOnline`;
- métodos acessíveis: os declarados pelo tipo da referência;
- implementação executada em métodos sobrescritos: a da classe real.

É isso que permite adicionar um novo tipo de produto sem criar vários `if` dentro de `Pedido`.

## Sobrescrita

`@Override` indica que a subclasse está fornecendo sua versão de um método herdado. A anotação ajuda o compilador a encontrar assinaturas incorretas.

## Casting

Casting converte uma referência geral para um tipo mais específico. Só faça isso quando precisar de um comportamento que não existe no tipo geral:

```java
if (produto instanceof ProdutoFisico produtoFisico) {
    System.out.println(produtoFisico.getFrete());
}
```

O `instanceof` confirma o tipo antes da conversão e evita `ClassCastException`. Se muitos `if` de tipo surgirem, talvez o comportamento deva ser um método polimórfico ou uma interface.

## Entendendo o código

1. Qual versão de `calcularPrecoFinal()` roda para um `CursoOnline`?
2. `Produto produto = new CursoOnline(...)` cria dois objetos?
3. Por que `Pedido` não precisa conhecer todas as subclasses?

## Na prática

Um processador de pagamentos pode trabalhar com um tipo comum `Pagamento`, enquanto Pix, cartão e boleto implementam suas próprias regras.

## Desafio

Conclua `Assinatura` do capítulo anterior e adicione-a ao pedido em `App`. Tente fazer isso sem alterar `Pedido` nem `ItemPedido`. Se funcionar, você usou o polimorfismo a seu favor.

## Resumo

Polimorfismo mantém uma interface comum e executa o comportamento do objeto real. `@Override` marca a sobrescrita; casting acessa um subtipo, mas deve ser usado com cuidado.

[Anterior](03-abstracao-e-heranca.md) · [Voltar ao README](../README.md) · [Próximo: Interfaces](05-interfaces.md)
