import java.util.Scanner;

public class ex_2float {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float num1, num2;

        System.out.println("Digite um numero");
        num1 = scanner.nextFloat();

        System.out.println("Digite outro numero");
        num2 = scanner.nextFloat();

        if (num1 == num2) {

            System.out.println("Numeros iguais.");

        } else if (num1 > num2) {

            System.out.println(">");
            System.out.println(num1);
            System.out.println(num2);   
            
        } else{

            System.out.println("<");
            System.out.println(num2);
            System.out.println(num1);

        }

        scanner.close();
    }
    
}
