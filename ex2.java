import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Calculadora de Soma ---");
        
        System.out.print("Digite o primeiro número inteiro: ");
        // Usa nextInt() para ler o primeiro inteiro
        int numero1 = scanner.nextInt(); 
        
        System.out.print("Digite o segundo número inteiro: ");
        // Usa nextInt() para ler o segundo inteiro
        int numero2 = scanner.nextInt(); 
        
        // Realiza o cálculo da soma
        int resultadoSoma = numero1 + numero2;
        
        // Exibe o resultado
        System.out.println("Resultado: " + resultadoSoma);
        
        scanner.close();
    }
}