
/*
• Faça uma função que verifica se um número pertence ao
intervalo de 0 a 10
– Parâmetro de entrada: um número
– retorno: true se pertencer ao intervalo e false caso contrário
*/
import java.util.Scanner;

public class Exerc7Verificar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;

        System.out.println("Digite um numero: ");
        num1 = scanner.nextInt();

        System.out.println(verificar(num1));

        scanner.close();
    }

    public static Boolean verificar(int n1) {

        if (n1 >= 0 && n1 <= 10) {

            return true;

        } else {

            return false;
        }

    }

}
