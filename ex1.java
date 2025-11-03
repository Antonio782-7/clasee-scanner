import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite seu nome completo:");
        
        // Usa nextLine() para ler a linha inteira (incluindo espaços)
        String nomeUsuario = scanner.nextLine(); 
        
        // Exibe a mensagem de boas-vindas com o nome lido
        System.out.println("Olá, " + nomeUsuario + "! Seja bem-vindo(a) ao laboratório de programação!");
        
        // Fecha o objeto Scanner
        scanner.close(); 
    }
}