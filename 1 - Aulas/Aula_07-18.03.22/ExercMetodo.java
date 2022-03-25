import java.util.Scanner;

public class ExercMetodo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero inteiro: ");
        num = scanner.nextInt();

        verificar(num);

        scanner.close();
    }

    public static void verificar(int valor) {

        if (valor <= 0) {

            System.out.println("O valor e negativo =(");

        } else {

            System.out.println("O valor e positivo =)");
        }
    }

}
