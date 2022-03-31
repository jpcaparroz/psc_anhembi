import java.util.Scanner;

public class ExeIfEncadeado {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite 1 numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        num2 = scanner.nextInt();

        if (num1 == num2) {

            System.out.println("Parabens =)");
            System.out.println("Os numeros sao iguais");

        } else if (num1 > num2) {

            System.out.println("A diferença entre eles e igual a " + (num1 - num2));
            
        } else {

            System.out.println("A diferença entre eles e igual a " + (num2 - num1));
        }

        scanner.close();
    }
    
}
