import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Calculadora de IMC ---");
        
        System.out.print("Digite seu peso (em kg, ex: 75.5): ");
        // Usa nextDouble() para ler o peso (valor decimal)
        double peso = scanner.nextDouble(); 
        
        System.out.print("Digite sua altura (em metros, ex: 1.75): ");
        // Usa nextDouble() para ler a altura (valor decimal)
        double altura = scanner.nextDouble(); 
        
        // Calcula o IMC: IMC = peso / (altura * altura)
        double imc = peso / (altura * altura);
        
        // Exibe o resultado. O String.format é usado para limitar as casas decimais.
        System.out.println("Seu IMC é: " + String.format("%.2f", imc));
        
        scanner.close();
    }
}