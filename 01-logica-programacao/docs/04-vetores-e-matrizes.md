# 4. Vetores e matrizes

## O que você vai aprender

Guardar e processar vários valores do mesmo tipo.

## Vetores

Um vetor possui tamanho fixo e seus elementos são acessados por índices. O primeiro índice é sempre zero.

```java
double[] notas = {8.0, 7.5, 9.0};

System.out.println(notas[0]); // 8.0
System.out.println(notas[2]); // 9.0
```

Para percorrer todos os elementos:

```java
double soma = 0;

for (double nota : notas) {
    soma += nota;
}
```

`notas.length` informa a quantidade de posições do vetor.

## Matriz

Uma matriz pode representar dados em linhas e colunas.

```java
int[][] numeros = {
    {1, 2, 3},
    {4, 5, 6}
};
```

Para percorrer uma matriz, normalmente usamos um laço dentro de outro:

```java
for (int[] linha : numeros) {
    for (int valor : linha) {
        System.out.println(valor);
    }
}
```

## Cuidado com índices

Em um vetor com três elementos, os índices válidos são `0`, `1` e `2`. Acessar `notas[3]` causa `ArrayIndexOutOfBoundsException`.

Execute a opção **5** do menu principal e observe como a média é calculada.

## Na prática

Arrays são úteis quando a quantidade de posições é conhecida, como as notas de quatro bimestres ou os dias de uma semana. Mais adiante, coleções como `ArrayList` permitem tamanhos variáveis.

## Desafio

Dado o vetor `{12, 7, 19, 4, 15}`, encontre o maior número sem utilizar métodos prontos da linguagem.

## Resumo

Um array reúne valores do mesmo tipo e usa índices iniciados em zero. Matrizes organizam valores em linhas e colunas e normalmente exigem laços aninhados.

[Anterior: repetições](03-repeticoes.md) · [Voltar à trilha](../README.md) · [Próximo: métodos](05-metodos.md)
