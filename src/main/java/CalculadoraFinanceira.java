// Arquivo: CalculadoraFinanceira.java

public class CalculadoraFinanceira {

    // Método estático: pode ser usado sem instanciar a classe
    public static double calcularPrecoFinal(double preco, int qtd, double percentualDesconto) {
        if (preco < 0 || qtd < 0) return 0; // Proteção de regra de negócio
        double bruto = preco * qtd;
        return bruto - (bruto * (percentualDesconto / 100));
    }

    public static String formatarMoeda(double valor) {
        return String.format("R$ %.2f", valor);
    }
}