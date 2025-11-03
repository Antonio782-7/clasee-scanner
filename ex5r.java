import java.util.Scanner;

public class ex5r {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Avaliação Escolar ---");
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble(); 
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble(); 
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble(); 
        
        // Calcula a média das três notas
        double media = (nota1 + nota2 + nota3) / 3.0;
        
        // Exibe a média com uma casa decimal
        System.out.println("Média: " + String.format("%.1f", media));
        
        String situacao;
        
        // Aplica as decisões lógicas
        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 5.0) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }
        
        System.out.println("Situação: " + situacao);
        
        scanner.close();
    }
}