# Cadastro de Compras com Cartão de Crédito

Aplicação Java simples que simula compras com cartão de crédito, permitindo que o usuário defina um limite inicial e registre diversas compras enquanto houver saldo disponível.

## Funcionalidades

- Definição do limite inicial do cartão
- Registro de compras com descrição e valor
- Validação de saldo antes da compra
- Exibição das compras realizadas em ordem crescente de valor
- Exibição do saldo restante do cartão

## Estrutura do Projeto

br.com.alura.cadastrocompras
├── Main.java
└── classes
├── Cartao.java
└── Itens.java


## Requisitos

- Java 11 ou superior

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/VitorZanela/CadastroCompras.git
   cd CadastroCompras

## Observações
- As compras são armazenadas em uma lista e ordenadas por valor antes da exibição final.

- O programa encerra automaticamente se o limite do cartão for excedido.

- Utiliza a classe Comparator para ordenação e String.format para formatação de valores.
