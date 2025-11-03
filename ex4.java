import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Calculadora de Desconto ---");
        
        System.out.print("Digite o preço original do produto: ");
        // Preço do produto
        double precoOriginal = scanner.nextDouble(); 
        
        System.out.print("Digite a porcentagem de desconto (%): ");
        // Porcentagem de desconto
        double descontoPorcentagem = scanner.nextDouble(); 
        
        // Calcula o valor do desconto: (preco * desconto / 100)
        double valorDoDesconto = precoOriginal * (descontoPorcentagem / 100.0);
        
        // Calcula o preço final
        double precoFinal = precoOriginal - valorDoDesconto;
        
        // Exibe o preço final.
        System.out.println("Preço final: " + String.format("%.2f", precoFinal));
        
        scanner.close();
    }
}