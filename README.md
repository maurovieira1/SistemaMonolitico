# Sistema de Vendas em Java

## Sobre o projeto

Este projeto foi feito em **Java** para mostrar a diferença entre um código **não reutilizável** e um código **reutilizável**.

O sistema calcula o valor final de uma compra com desconto.

---

## Arquivos do projeto

**SistemaVendasAntigo.java**

* Exemplo de código antigo.
* O cálculo está todo dentro do `main`.
* Não é reutilizável porque mistura dados, cálculo e exibição.

**CalculadoraFinanceira.java**

* Classe criada para fazer os cálculos.
* Possui métodos reutilizáveis.

Métodos:

* `calcularPrecoFinal()` → calcula o valor da compra com desconto
* `formatarMoeda()` → formata o valor em reais

**CheckoutLoja.java**

* Classe principal do sistema.
* Usa os métodos da `CalculadoraFinanceira`.

---

## Como executar

1. Compilar os arquivos

```
javac SistemaVendas/*.java CheckoutLoja.java
```

2. Executar o programa

```
java CheckoutLoja
```

---

## Exemplo de saída

```
--- Recibo de Venda ---
Total a pagar: R$ 1350.00
```

---

## Autor

Mauro Vieira
Projeto acadêmico em Java.
