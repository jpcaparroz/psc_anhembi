import java.util.Scanner;

public class ex_ifcomposto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 18) {

            System.out.println("PARABENS!!!");
            System.out.println("Voce e maior de idade :)");   
        } else {
            System.out.println("=( =( = (");
            System.out.println("Voce nao e maior de idade");
        }
        
        scanner.close();
    }
    
}
