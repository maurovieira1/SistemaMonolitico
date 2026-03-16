public class SistemaVendasAntigo {
    public static void main(String[] args) {
        // Dados e lógica misturados
        String produto = "Monitor Gaming";
        double preco = 1200.00;
        int quantidade = 2;
        double taxaDesconto = 0.15; // 15%

        // Lógica de negócio "presa" dentro do fluxo de exibição
        double totalBruto = preco * quantidade;
        double totalComDesconto = totalBruto - (totalBruto * taxaDesconto);

        System.out.println("Produto: " + produto);
        System.out.println("Valor Final: R$ " + totalComDesconto);
    }
}