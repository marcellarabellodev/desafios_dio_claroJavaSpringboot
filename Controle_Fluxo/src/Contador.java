import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Entrada pelo console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro para o primeiro parâmetro: ");
        int parametro1 = scanner.nextInt();
        System.out.println("Digite um número inteiro para o segundo parâmetro: ");
        int parametro2 = scanner.nextInt();

        // Será testado o método ParametrosInvalidos(), se não condizer com a lógica de contagem, apresentará mensagem de erro do Exception que foi criado na classe ParametrosInvalidosException
        try {
            Contador(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            // Mensagem de erro
            System.out.println("ERRO! O segundo parâmetro deve ser maior que o primeiro!");
        }
        scanner.close();
    }

    static int  Contador(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        } else{
            int contagem = parametro2 - parametro1;
            for(int indice = 0; indice < contagem; indice++){
                System.out.println("Imprimindo o número " + (indice+1));
            }
            return contagem;
        }
    }
}


