import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, digite o número da sua Conta: ");
            int numeroConta = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Por favor, digite o número da sua Agência: ");
            String numeroAgencia = scanner.nextLine();

            System.out.println("Por favor, digite o seu nome: ");
            String nomeUsuario = scanner.nextLine();

            System.out.println("Por favor, digite o seu saldo: ");
            Float saldoConta = scanner.nextFloat();

            System.out.printf(
                    "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.%n",
                    nomeUsuario, numeroAgencia, numeroConta, saldoConta);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao processar a entrada do usuário!");
        }

    }
}