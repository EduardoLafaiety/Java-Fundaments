# 3. Estruturas de repetição

## O que você vai aprender

Repetir uma ação sem duplicar o mesmo trecho de código.

## `for`

Use quando você sabe quantas repetições serão feitas.

```java
for (int numero = 1; numero <= 5; numero++) {
    System.out.println(numero);
}
```

O `for` possui três partes:

1. `int numero = 1`: cria o contador;
2. `numero <= 5`: define quando o laço continua;
3. `numero++`: atualiza o contador após cada volta.

## `while`

Use quando a repetição depende de uma condição e não necessariamente de uma quantidade conhecida.

```java
while (senhaIncorreta) {
    // pede a senha novamente
}
```

É essencial que algo dentro do bloco possa tornar a condição falsa. Caso contrário, o programa entra em um loop infinito.

## `do-while`

Semelhante ao `while`, mas executa o bloco pelo menos uma vez porque verifica a condição no final.

```java
do {
    exibirMenu();
} while (opcao != 0);
```

## `for-each`

Percorre todos os elementos de uma estrutura sem controlar o índice manualmente.

```java
for (String nome : nomes) {
    System.out.println(nome);
}
```

Leia assim: “para cada `nome` dentro de `nomes`, execute este bloco”.

## Entendendo o código

No código abaixo, quantas vezes o bloco executa e qual é o valor final de `soma`?

```java
int soma = 0;
for (int numero = 1; numero <= 4; numero++) {
    soma += numero;
}
```

Faça uma tabela no papel com as colunas `numero` e `soma`. Esse processo é chamado de teste de mesa.

Execute a opção **4** do menu principal para ver os laços funcionando.

## Na prática

Laços percorrem itens de um carrinho, repetem tentativas de login e mantêm menus abertos até a pessoa escolher sair.

## Desafio

Crie um programa que mostre a tabuada completa de um número, do multiplicador 1 até o 10.

## Resumo

Use `for` quando a quantidade for conhecida, `while` quando a condição deve ser verificada antes e `do-while` quando o bloco precisa executar ao menos uma vez.

[Anterior: decisões](02-decisoes.md) · [Voltar à trilha](../README.md) · [Próximo: arrays](04-vetores-e-matrizes.md)
