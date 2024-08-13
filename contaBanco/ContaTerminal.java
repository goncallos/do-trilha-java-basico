package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para capturar dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação e captura das informações do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final com os dados inseridos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                        + "sua agência é " + agencia + ", conta " + numero 
                        + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);

        // Fechamento do scanner
        scanner.close();
    }
}
