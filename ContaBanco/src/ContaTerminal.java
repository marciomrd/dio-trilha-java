import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner  = new Scanner(System.in);

        int numeroConta;
        String nomeCliente;
        String agencia;
        double saldo;

        System.out.println("Por favor, digite seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agencia:");
        agencia = scanner.next();

        System.out.println("Digite o saldo de sua conta:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agencia é " + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
