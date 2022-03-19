import java.util.Scanner;

public class ExercMaior3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite um numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite um numero: ");
        num2 = scanner.nextInt();

        System.out.println("Digite um numero: ");
        num3 = scanner.nextInt();

        verificar(num1, num2, num3);
        
        scanner.close();
    }

    public static void verificar(int valor1, int valor2, int valor3) {

        if (valor1 > valor2 && valor1 > valor3) {

            System.out.println("O " + valor1 + " e o maior valor digitado");
                 
        } else if (valor2 > valor1 && valor2 > valor3) {
            
            System.out.println("O " + valor2 + " e o maior valor digitado");

        } else{
            System.out.println("O " + valor3 + " e o maior valor digitado");
        }   
    }  
}
