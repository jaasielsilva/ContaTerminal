import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        
        // Exibir a mensagem conta criada
        System.out.println("Conta criada com sucesso!");
        System.out.println("Agência: " + agencia + ", Conta: " + numeroConta + ", Cliente: " + nomeCliente + ", Saldo: " + saldo);
        
        // Fechar o scanner
        scanner.close();
    }
}
