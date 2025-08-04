import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Dados fictícios para simulação        
        String numeroConta = "1021";
        String agenciaUsuario = "067-8";
        String nomeCliente = "Mario Andrade";
        String saldo1 = "237,48";
     
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                        + "sua agência é " + agenciaUsuario + ", conta " + numeroConta
                        + " e seu saldo R$ " + saldo1 + " já está disponível para saque.";

        System.out.println("\n" + mensagem);

        scanner.close();
    }
}
