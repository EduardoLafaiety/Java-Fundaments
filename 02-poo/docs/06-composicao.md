# 6. Composição

## O que você vai aprender

Como construir objetos maiores pela colaboração entre objetos menores.

## Conceito

Composição constrói objetos mais complexos a partir da colaboração entre objetos menores. Normalmente representa uma relação **possui**.

No projeto:

- `Pedido` possui um `Cliente`;
- `Pedido` possui vários `ItemPedido`;
- cada `ItemPedido` referencia um `Produto`.

```java
private final Cliente cliente;
private final List<ItemPedido> itens = new ArrayList<>();
```

## Por que existe `ItemPedido`?

Uma lista simples de produtos não guardaria a quantidade comprada. `ItemPedido` conecta um produto à quantidade e sabe calcular o próprio subtotal.

Essa divisão mantém responsabilidades claras:

| Objeto | Responsabilidade principal |
|---|---|
| `Produto` | Calcular seu preço final unitário |
| `ItemPedido` | Calcular quantidade × preço final |
| `Pedido` | Coordenar itens, estado e total |
| `Cliente` | Representar quem fez a compra |

## Composição × herança

Pergunte qual frase descreve a relação:

- “é um” geralmente aponta para herança;
- “possui/usa” geralmente aponta para composição.

`Pedido extends Cliente` seria incorreto: um pedido não é um cliente. `Pedido` **possui** um cliente.

## Entendendo o código

1. Por que a quantidade pertence ao item, e não ao produto?
2. Quem deve calcular o subtotal?
3. Qual objeto deve impedir itens em um pedido finalizado?

## Na prática

Um pedido possui cliente e itens; um carro possui motor e rodas; uma turma possui estudantes. Essas relações não formam uma família de herança.

## Desafio

Crie `EnderecoEntrega` e associe-o somente aos pedidos que possuem produto físico. Pense antes de codificar: quem deve descobrir se o pedido precisa de entrega?

## Resumo

Composição representa relações “possui” e distribui responsabilidades entre objetos. Ela costuma ser mais flexível do que herança quando não existe uma relação “é um”.

[Anterior](05-interfaces.md) · [Voltar ao README](../README.md) · [Praticar](../../03-exercicios/README.md)
