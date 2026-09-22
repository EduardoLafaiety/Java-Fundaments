# 1. Classes e objetos

## O que você vai aprender

Como classes representam ideias do sistema e como objetos são criados por construtores.

## Conceito

Uma **classe** descreve quais dados e comportamentos um tipo de elemento terá. Um **objeto** é uma ocorrência concreta criada a partir dessa descrição.

Pense em uma planta de apartamento: a planta define quartos, portas e medidas; cada apartamento construído a partir dela existe de verdade e pode ter moradores diferentes.

## No projeto

`Cliente` é uma classe. Em `App`, `ana` é uma variável que referencia um objeto `Cliente`:

```java
Cliente ana = new Cliente("Ana Souza", "ana@email.com");
```

O objeto guarda seu próprio nome, e-mail e identificador. Outro cliente terá outro estado, mesmo tendo sido criado a partir da mesma classe.

## Construtor e `this`

O construtor tem o mesmo nome da classe e é chamado com `new`. Ele prepara o objeto para uso:

```java
public Cliente(String nome, String email) {
    this.nome = nome;
    this.email = email;
}
```

`this.nome` aponta para o atributo do objeto atual. `nome`, sem `this`, é o parâmetro recebido. A palavra `this` remove a ambiguidade entre os dois nomes.

## Leia o código procurando

- atributos: representam o **estado**;
- construtor: garante um objeto válido desde o nascimento;
- métodos: representam **comportamentos**;
- `new`: cria o objeto na memória;
- variável de referência: permite acessar esse objeto.

## Entendendo o código

1. `Cliente` é a planta ou o elemento construído?
2. Quantos objetos são criados na classe `App`?
3. Duas variáveis podem apontar para o mesmo objeto?

## Na prática

Em um sistema real, classes podem representar cliente, conta, consulta, produto ou qualquer conceito relevante para o problema.

## Desafio

Adicione um telefone opcional ao cliente. Antes de programar, decida:

- ele deve entrar no construtor?
- qual valor representa “não informado”?
- um telefone vazio deve ser aceito?

## Resumo

Classe é o modelo; objeto é a ocorrência criada com `new`; atributos guardam estado; métodos expressam comportamento; e o construtor inicia o objeto.

[Voltar ao README](../README.md) · [Próximo: Encapsulamento](02-encapsulamento.md)
