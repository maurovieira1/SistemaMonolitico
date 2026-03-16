// Arquivo: CheckoutLoja.java

public class CheckoutLoja {
    public static void main(String[] args) {
        double valorProduto = 500.00;
        int unidades = 3;

        // Reutilizando a lógica sem reescrever uma linha de cálculo
        double resultado = CalculadoraFinanceira.calcularPrecoFinal(valorProduto, unidades, 10.0);

        System.out.println("--- Recibo de Venda ---");
        System.out.println("Total a pagar: " + CalculadoraFinanceira.formatarMoeda(resultado));
    }
}