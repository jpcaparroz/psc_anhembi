import java.util.Scanner;

public class ExIfSimples {

    public static void main(String[] args) {

        //criação do Scanner
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();
        
        if (numero > 20) {

            System.out.println("A metade do numero digitado e = " + (numero / 2));
            
        }

        //fechando o Scanner
        scanner.close();
    }
    
}
