import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String agencia, nomeCliente;
        int numero;
        float saldo;

        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da Conta");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo de " + saldo + " já está disponível para saque");

    }
}