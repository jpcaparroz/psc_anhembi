import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[5];

        for(int i = 0; i < 5; i++){

            System.out.println("Digite o " + (i+1) + "º numero:");
            numeros[i] = scanner.nextInt();
        }

        for(int i2 = 0; i2 < 5; i2++){

            System.out.print(numeros[i2] + " ");
        }
        
        scanner.close();
    }
    
}
