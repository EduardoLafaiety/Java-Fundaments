# 2. Encapsulamento

## O que você vai aprender

Como proteger os dados de um objeto e expor apenas operações seguras.

## Conceito

Encapsular é **proteger o estado do objeto e permitir mudanças somente por caminhos controlados**. Não significa apenas escrever `private` e gerar getters e setters.

Um pedido finalizado, por exemplo, não deveria aceitar novos itens. Se qualquer classe pudesse alterar sua lista ou status diretamente, essa regra seria fácil de quebrar.

## No projeto

Em `Pedido`:

- a lista de itens é privada;
- `adicionarProduto(...)` valida o estado do pedido;
- `getItens()` devolve uma lista não modificável;
- `finalizar()` impede finalizar um pedido vazio.

O objeto é responsável por manter a própria consistência.

```java
public List<ItemPedido> getItens() {
    return Collections.unmodifiableList(itens);
}
```

Mesmo recebendo a lista, o código externo não consegue inserir itens sem passar pela regra de negócio.

## Getter não é obrigação

Um atributo privado não precisa automaticamente de getter e setter. Exponha apenas o que outros objetos realmente precisam consultar ou alterar.

Compare:

```java
pedido.setStatus(StatusPedido.FINALIZADO); // altera dado sem explicar a intenção
pedido.finalizar();                         // expressa uma ação de negócio
```

O segundo formato comunica melhor e centraliza as validações.

## Getters e setters

Um **getter** permite consultar um valor privado. Um **setter** permite alterá-lo. Eles não devem ser criados automaticamente para todos os atributos:

```java
public String getNome() {
    return nome;
}

public void alterarEmail(String novoEmail) {
    this.email = validarEmail(novoEmail);
}
```

O método `alterarEmail` comunica a intenção e valida o novo valor. No projeto, vários campos são imutáveis — não mudam depois do construtor — e por isso não possuem setter.

## Entendendo o código

1. Por que `setStatus(...)` não existe?
2. Qual regra seria quebrada se `itens` fosse público?
3. Um setter sempre representa bom encapsulamento?

## Na prática

Encapsulamento evita estados impossíveis, como saldo negativo sem autorização ou pedido finalizado sem item.

## Desafio

Crie o comportamento `cancelar()`. Um pedido entregue não pode ser cancelado. Defina primeiro os estados permitidos e só depois escreva o método.

## Resumo

Encapsular é manter regras perto dos dados que elas protegem. `private`, getters e métodos de negócio são ferramentas; o objetivo é impedir alterações inválidas.

[Anterior](01-classes-e-objetos.md) · [Voltar ao README](../README.md) · [Próximo: Abstração e herança](03-abstracao-e-heranca.md)
