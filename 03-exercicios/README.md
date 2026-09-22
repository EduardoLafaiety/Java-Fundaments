# 03 — Exercícios progressivos

Tente resolver na ordem. Antes de codificar, escreva três linhas: **entrada**, **processamento** e **saída**. Não existe uma única solução correta; prefira a que você consegue explicar.

## Parte 1 — Lógica de programação

### Nível 1: fundamentos

1. Converta uma temperatura de Celsius para Fahrenheit: `F = C × 1.8 + 32`.
2. Receba base e altura e mostre a área e o perímetro de um retângulo.
3. Receba um inteiro e informe se ele é par ou ímpar.

### Nível 2: decisões

4. Classifique uma pessoa como criança, adolescente, adulta ou idosa. Documente as faixas escolhidas.
5. Receba dois números e uma operação (`+`, `-`, `*` ou `/`). Impeça divisão por zero.

### Nível 3: repetições e arrays

6. Mostre a tabuada de um número de 1 a 10.
7. Calcule o fatorial de um número.
8. Receba dez números e mostre soma, média, maior e menor valor. Crie um método para cada cálculo.

### Projeto: caixa eletrônico

Crie um menu que permita consultar saldo, depositar, sacar e sair. Rejeite valores negativos, impeça saque acima do saldo e mantenha o menu aberto com `do-while` até a opção de saída.

## Parte 2 — Programação Orientada a Objetos

### Nível 1: modelagem

1. Adicione telefone opcional ao cliente.
2. Crie um segundo pedido com produtos diferentes.
3. Mostre a quantidade total de itens comprados.

### Nível 2: objetos colaborando

4. Crie `EnderecoEntrega` e associe-o ao pedido.
5. Adicione `removerProduto(...)` apenas para pedidos ainda abertos.
6. Implemente o cancelamento com uma transição de estado válida.

### Nível 3: polimorfismo

7. Crie `Assinatura` como novo tipo de produto.
8. Crie a interface `Descritivel` e faça dois tipos implementarem o contrato.
9. Liste descrições sem verificar o tipo com `instanceof`.

### Projeto: evolução da loja

Adicione endereço de entrega, cancelamento e um novo tipo de produto. Escreva ao menos um teste automatizado para cada regra nova.

## Checklist de qualidade

- [ ] Os nomes explicam o que cada dado representa?
- [ ] Cada método faz uma tarefa compreensível?
- [ ] Entradas inválidas são tratadas?
- [ ] Todo laço possui uma condição de parada?
- [ ] As regras do objeto passam por métodos, em vez de alterações diretas?
- [ ] Os testes continuam passando com `mvn test`?
- [ ] Você consegue explicar sua solução sem ler os comentários?

## Se travar

Reduza o problema. Faça primeiro um exemplo com valores fixos, depois transforme a parte repetida em método e só então receba dados do usuário. Use o depurador da IDE ou imprima valores intermediários para descobrir em qual passo o resultado muda.

[Voltar à página inicial](../README.md)
