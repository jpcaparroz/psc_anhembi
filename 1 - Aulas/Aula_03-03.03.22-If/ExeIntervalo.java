import java.util.Scanner;

public class ExeIntervalo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        int num1;

        System.out.println("Digite um numero");
        num1 = scanner.nextInt();

        if (num1 <= 100 && num1 >= 50) {

            System.out.println("Pertence ao intervalor de 50 | 100 =)");

        } else {

            System.out.println("Não pertence ao intervalor de 50 | 100 =(");
        }
        
        scanner.close();
        }
    }
    