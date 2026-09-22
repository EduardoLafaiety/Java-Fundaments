# 3. Abstração e herança

## O que você vai aprender

Como representar apenas o que importa, reaproveitar uma base comum e especializar comportamentos.

## Abstração

Abstrair é representar somente as características importantes para o problema atual. Para uma loja, interessa que todo produto tenha nome, preço e cálculo de preço final; cor da embalagem pode nem fazer parte do domínio.

`Produto` reúne esse núcleo comum, mas foi declarado como `abstract` porque o sistema não vende um “produto genérico”:

```java
public abstract class Produto {
    // estado e comportamentos comuns
    public abstract BigDecimal calcularPrecoFinal();
}
```

Uma classe abstrata pode ter atributos, construtor e métodos concretos. O que ela não permite é a criação direta com `new Produto(...)`.

## Herança

Herança modela uma relação **é um**:

- `ProdutoFisico` é um `Produto`;
- `CursoOnline` é um `Produto`.

As subclasses reaproveitam o estado comum e implementam as regras que variam. O produto físico soma imposto e frete; o curso aplica um desconto.

## O papel de `super`

No construtor da subclasse, `super(...)` envia os dados comuns para o construtor da classe mãe:

```java
public CursoOnline(String nome, BigDecimal precoBase, BigDecimal percentualDesconto) {
    super(nome, precoBase);
    this.percentualDesconto = percentualDesconto;
}
```

`super(...)` inicializa a parte `Produto`. `this.percentualDesconto` inicializa a parte específica de `CursoOnline`.

## Cuidado importante

Use herança quando existir uma relação conceitual clara e quando a subclasse puder ser usada onde a classe mãe é esperada. Reutilizar algumas linhas de código, sozinho, não é motivo suficiente.

## Entendendo o código

1. Por que `Produto` é abstrato?
2. Quem inicializa `nome` e `precoBase` ao criar um curso?
3. “Pedido é um Produto” faria sentido como herança?

## Na prática

Uma instituição pode ter uma classe abstrata `ContaBancaria` e subclasses `ContaCorrente` e `ContaPoupanca`, cada uma com regra própria de rendimento ou tarifa.

## Desafio

Crie `Assinatura`, outro tipo de `Produto`. Ela deve calcular o preço final multiplicando o valor mensal pela quantidade de meses contratados.

## Resumo

Abstração seleciona o que importa; herança modela uma relação “é um”; `extends` declara essa relação; e `super(...)` inicializa a parte herdada do objeto.

[Anterior](02-encapsulamento.md) · [Voltar ao README](../README.md) · [Próximo: Polimorfismo](04-polimorfismo.md)
