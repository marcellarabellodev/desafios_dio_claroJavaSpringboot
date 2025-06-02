
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
                                                // usado Locale.getDefault() pois o Scanner vai tentar interpretar os números com base nas configurações de localidade do seu sistema operacional.
        
        // Iniciando com as perguntas para o usuário que irá digitar no Terminal as informações solicitadas
        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt(); 
        scanner.nextLine(); 
        /* nextLine() Lê toda a linha até encontrar a quebra de linha, e consome a quebra de linha.
        Para evitar Bugs , foi inserido scanner.nextLine() para "limpar" o buffer do Scanner após cada leitura de número ou qualquer leitura que não seja nextLine()
        nextInt(), nextDouble(), nextBigDecimal(), etc Leêm o próximo número (inteiro, double, BigDecimal) do buffer. Assim como next(), eles não consomem o caractere de quebra de linha após o número.
        Já o nextLine() Lê toda a linha do buffer, incluindo qualquer caractere de espaço em branco (como espaços) e, o mais importante, consome o caractere de quebra de linha ao final da linha.
        */

        System.out.println("Digite sua Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Certo. Agora me diga qual é o seu nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o seu saldo!");
        BigDecimal saldo = scanner.nextBigDecimal();
        scanner.nextLine();

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "  + agencia + " conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");

        scanner.close();
        /*  Fechar o scanner é uma boa prática de programação em Java.
            Quando criamos um objeto Scanner (especialmente se ele estiver lendo de um arquivo ou de um InputStream como System.in), ele está interagindo com um recurso do sistema operacional.
            Esses recursos (chamados de "streams" ou "fluxos") são limitados. Se não os liberarmos explicitamente, eles podem permanecer abertos e "presos" pelo nosso programa, mesmo depois que não precisemos mais deles.
            Chamar close() libera esses recursos, indicando ao sistema operacional que o programa não precisa mais daquele fluxo de entrada.
        */
    }
}
