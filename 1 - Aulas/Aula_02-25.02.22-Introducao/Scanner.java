import java.util.Scanner;

public class Scanner {

    public static void main(String[] args) {

        //criação do Scanner
        Scanner entrada = new Scanner(System.in);

        int idade, ano;

        System.out.println("Digite o ano em que você nasceu: ");
        
        //Recebendo uma entrada com o Scanner
        ano = entrada.nextInt();

        idade = 2022 - ano;

        System.out.println("Sua idade e igual a: " + idade + " anos");

        //fechando o Scanner
        entrada.close();
    }
    
}
