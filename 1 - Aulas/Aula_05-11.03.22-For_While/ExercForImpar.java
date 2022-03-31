import java.util.Scanner;

public class ExercForImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, impar, par;

        impar = 0;
        par = 0;

        for(int count = 1; count <= 10; count++ ){

            System.out.println("Digite o " + count + "º numero:" );
            num = scanner.nextInt();

            if (num % 2 != 0) {

                impar++;                
            } else {
                par++;
            }
        }

        System.out.println("O total de numeros pares e: " + par);
        System.out.println("O total de numeros impares e: " + impar);

        scanner.close();
    }

    
}
