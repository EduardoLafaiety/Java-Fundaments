# 5. Interfaces

## O que você vai aprender

Como declarar uma capacidade que classes diferentes podem assumir.

## Conceito

Uma interface define um **contrato de comportamento**. Ela responde “o que este objeto sabe fazer?” sem obrigar uma relação de família entre classes.

```java
public interface Tributavel {
    BigDecimal calcularImposto();
}
```

`ProdutoFisico implements Tributavel` afirma que todo produto físico precisa oferecer o cálculo de imposto.

## Por que não colocar imposto em `Produto`?

Nem todo produto do domínio precisa ser tributado da mesma maneira. Neste exemplo, um curso online não implementa `Tributavel`. Colocar esse comportamento na classe mãe forçaria subclasses que não precisam dele a carregar uma responsabilidade inadequada.

## Classe abstrata × interface

| Classe abstrata | Interface |
|---|---|
| Modela uma base comum | Modela uma capacidade ou contrato |
| Pode manter estado de instância | Não mantém estado de instância mutável |
| É herdada com `extends` | É adotada com `implements` |
| Uma classe estende apenas uma classe | Uma classe implementa várias interfaces |

Uma pergunta prática:

- “o objeto **é um tipo de** produto?” → classe/herança;
- “o objeto **é capaz de** calcular imposto?” → interface.

## Entendendo o código

1. Uma interface cria automaticamente um objeto?
2. O que acontece se `ProdutoFisico` não implementar o método do contrato?
3. Uma classe pode implementar `Tributavel` sem herdar de `Produto`?

## Na prática

Interfaces aparecem em serviços de envio, meios de pagamento e relatórios: implementações diferentes respeitam o mesmo contrato.

## Desafio

Crie a interface `Descritivel` com o método `gerarDescricao()`. Faça dois tipos diferentes implementarem o contrato e percorra uma lista de `Descritivel` em `App`.

## Resumo

Uma interface diz o que um objeto sabe fazer. `implements` assume o contrato, e a classe precisa fornecer os métodos prometidos.

[Anterior](04-polimorfismo.md) · [Voltar ao README](../README.md) · [Próximo: Composição](06-composicao.md)
