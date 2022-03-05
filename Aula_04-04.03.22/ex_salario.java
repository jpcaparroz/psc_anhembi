import java.util.Scanner;
 
public class ex_salario {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double salario;

        System.out.println("Informe seu salario: ");
        salario = scanner.nextDouble();

        if (salario <= 600) {

            System.out.println("ISENTO!");
            
        } else if (salario <= 1200) {

            System.out.println("Desconto de 20%");
            
        }else if (salario <= 2000) {

            System.out.println("Desconto de 25%");
            
        }else{
            System.out.println("Desconto de 30%");
        }

        scanner.close();
    }
}
