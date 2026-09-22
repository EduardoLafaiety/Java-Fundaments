# 2. Tomada de decisões

## O que você vai aprender

Fazer o programa escolher caminhos diferentes conforme uma condição.

## `if`, `else if` e `else`

Imagine a regra:

- média maior ou igual a 7: aprovado;
- média entre 5 e 6,99: recuperação;
- média abaixo de 5: reprovado.

Em Java:

```java
if (media >= 7.0) {
    System.out.println("Aprovado");
} else if (media >= 5.0) {
    System.out.println("Recuperação");
} else {
    System.out.println("Reprovado");
}
```

O Java testa as condições de cima para baixo e entra apenas no primeiro bloco verdadeiro.

## Como raciocinar

Antes de escrever a condição, responda:

1. Qual valor será analisado?
2. Quais são as regras?
3. A ordem das regras interfere no resultado?
4. Existe um caminho padrão?

No exemplo das notas, testar `media >= 5` antes de `media >= 7` seria um erro: uma média 8 também é maior que 5 e seria classificada como recuperação.

## `switch`

O `switch` é útil quando um único valor pode corresponder a opções bem definidas.

```java
String mensagem = switch (opcao) {
    case 1 -> "Cadastrar";
    case 2 -> "Consultar";
    case 0 -> "Sair";
    default -> "Opção inválida";
};
```

Use `if` quando as regras dependem de intervalos ou expressões complexas. Considere `switch` quando estiver comparando o mesmo valor com alternativas específicas.

## Entendendo o código

Para a regra `idade >= 18 && possuiIngresso`, preencha mentalmente:

| Idade | Possui ingresso | Pode entrar? |
| ---: | --- | --- |
| 20 | `true` | ? |
| 16 | `true` | ? |
| 25 | `false` | ? |

Execute a opção **3** do menu para acompanhar outro exemplo.

## Na prática

Condições aparecem ao validar uma senha, aprovar um pagamento, definir frete ou escolher uma opção de menu.

## Desafio

Crie uma calculadora de IMC que mostre uma classificação diferente para cada faixa. Separe primeiro as regras no papel e só depois escreva os `if`.

## Resumo

Use `if` para condições e intervalos; use `switch` quando comparar um mesmo valor com opções bem definidas. A ordem das regras pode mudar o resultado.

[Anterior: fundamentos](01-fundamentos.md) · [Voltar à trilha](../README.md) · [Próximo: repetições](03-repeticoes.md)
