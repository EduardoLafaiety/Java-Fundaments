# 1. Fundamentos: variáveis, tipos e operadores

## O que você vai aprender

Como um programa guarda informações, recebe dados, realiza operações e mostra resultados.

## Variáveis

Uma variável é um espaço identificado na memória. Ela possui um nome, um tipo e um valor.

```java
String nome = "Ana";
int idade = 22;
```

Leia a primeira linha assim: “crie uma variável chamada `nome`, que guarda texto, e coloque `Ana` dentro dela”.

## Tipos mais usados no começo

| Tipo | Armazena | Exemplo |
| --- | --- | --- |
| `int` | números inteiros | `int quantidade = 10;` |
| `double` | números com casas decimais | `double preco = 19.90;` |
| `boolean` | verdadeiro ou falso | `boolean ativo = true;` |
| `char` | um único caractere | `char categoria = 'A';` |
| `String` | texto | `String cidade = "Recife";` |

`String` começa com letra maiúscula porque é uma classe. Os demais tipos da tabela são tipos primitivos.

## Entrada e saída de dados

`System.out.println(...)` envia uma mensagem para o terminal. Para receber o que a pessoa digita, podemos usar `Scanner`:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Qual é a sua idade? ");
int idade = scanner.nextInt();

System.out.println("Idade informada: " + idade);
```

`System.in` representa a entrada do teclado. O método `nextInt()` espera um número inteiro. No projeto, o menu valida a entrada antes de utilizá-la para evitar que um texto cause erro.

## Operadores aritméticos

| Operador | Operação | Exemplo |
| --- | --- | --- |
| `+` | soma | `10 + 2` |
| `-` | subtração | `10 - 2` |
| `*` | multiplicação | `10 * 2` |
| `/` | divisão | `10 / 2` |
| `%` | resto da divisão | `10 % 3` resulta em `1` |

O operador `%` é muito usado para descobrir se um número é par:

```java
boolean ehPar = numero % 2 == 0;
```

## Operadores de comparação

Uma comparação sempre produz `true` ou `false`.

| Operador | Significado |
| --- | --- |
| `==` | igual a |
| `!=` | diferente de |
| `>` | maior que |
| `<` | menor que |
| `>=` | maior ou igual a |
| `<=` | menor ou igual a |

## Operadores lógicos

- `&&`: as duas condições precisam ser verdadeiras.
- `||`: pelo menos uma condição precisa ser verdadeira.
- `!`: inverte o resultado lógico.

```java
boolean podeEntrar = idade >= 18 && possuiIngresso;
```

## Entendendo o código

Qual será o valor de cada variável?

```java
int a = 8;
int b = 3;
int soma = a + b;
int resto = a % b;
boolean comparacao = a > b;
```

Execute as opções **1** e **2** do menu principal e confira seu raciocínio.

## Na prática

Cadastros, calculadoras e sistemas de pedidos recebem dados, guardam cada informação no tipo adequado e produzem uma saída para a pessoa usuária.

## Desafio

Crie um programa que receba o preço de um produto e a porcentagem de desconto. Ao final, mostre o valor do desconto e o preço final.

## Resumo

Variáveis têm nome, tipo e valor. Operadores transformam ou comparam esses valores, enquanto entrada e saída permitem que o programa converse com quem o utiliza.

[Voltar à trilha](../README.md) · [Próximo: decisões](02-decisoes.md)
