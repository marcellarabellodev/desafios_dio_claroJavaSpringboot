
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Certo. Agora me diga qual é o seu nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o seu saldo! Ex: 145,52");
        BigDecimal saldo = scanner.nextBigDecimal();
        scanner.nextLine();

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "  + agencia + " conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");

        

    }
}
