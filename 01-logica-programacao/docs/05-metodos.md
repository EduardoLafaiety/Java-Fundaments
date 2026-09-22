# 5. Métodos

## O que você vai aprender

Separar uma lógica em blocos menores, nomeados e reutilizáveis.

Compare estas duas ideias:

- repetir o cálculo de média em vários pontos do programa;
- criar `calcularMedia` uma vez e chamá-lo sempre que necessário.

A segunda opção comunica melhor a intenção e facilita manutenção e testes.

## Anatomia de um método

```java
public static int somar(int numeroA, int numeroB) {
    return numeroA + numeroB;
}
```

| Parte | Função |
| --- | --- |
| `public` | define quem pode acessar |
| `static` | permite chamar sem criar um objeto |
| `int` | tipo do valor retornado |
| `somar` | nome do método |
| `int numeroA, int numeroB` | parâmetros recebidos |
| `return` | devolve o resultado |

Um método `void` executa uma ação, mas não devolve um valor.

## Parâmetro e argumento

Em `somar(int a, int b)`, `a` e `b` são parâmetros. Em `somar(10, 5)`, `10` e `5` são argumentos.

## Uma responsabilidade

Prefira métodos que façam uma coisa clara. No projeto final, há métodos separados para:

- calcular média;
- encontrar maior nota;
- encontrar menor nota;
- definir situação.

Essa divisão permite testar cada regra isoladamente.

## Escopo

Escopo é a região em que uma variável existe e pode ser acessada:

```java
public static int dobrar(int numero) {
    int resultado = numero * 2;
    return resultado;
}
```

`numero` e `resultado` pertencem ao método `dobrar`. Outro método não consegue acessá-los diretamente. Em um bloco `if` ou `for`, uma variável declarada entre as chaves também deixa de existir ao final daquele bloco.

Execute a opção **6** do menu principal e depois leia `AnalisadorDeNotas.java`.

## Na prática

Métodos nomeiam etapas de um processo: validar uma entrada, calcular um total ou formatar uma mensagem. Isso permite ler o programa como uma sequência de intenções.

## Desafio

Crie os métodos abaixo:

```java
double converterCelsiusParaFahrenheit(double celsius)
boolean podeVotar(int idade)
int encontrarMaior(int numeroA, int numeroB)
```

Antes de programar, determine para cada método: o que ele recebe, o que processa e o que retorna.

## Resumo

Parâmetros recebem dados, `return` devolve um resultado e o escopo limita onde cada variável pode ser usada. Métodos pequenos facilitam leitura, reaproveitamento e testes.

[Anterior: arrays](04-vetores-e-matrizes.md) · [Voltar à trilha](../README.md) · [Praticar](../../03-exercicios/README.md)
