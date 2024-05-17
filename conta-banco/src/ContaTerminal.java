import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da sua agencia:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o numero da sua Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome:");
        String sobrenome = scanner.next();

        double saldo = 237.48;

        System.out.println("Olá!" + nome + " " + sobrenome);
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é:" + agencia);
        System.out.println("Conta:" + numeroConta);
        System.out.println("e seu saldo: R$" + saldo + " ja esta disponivel para saque.");
    }
}
