/* • Escreva uma função para verificar se um número é par
– Sua função deve receber um número como parâmetro de entrada
– deve retornar true se o número for par . . .
– e false caso seja ímpar.
*/

import java.util.Scanner;

public class Exerc2Par {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero:");
        num = scanner.nextInt();

        System.out.println(par(num));

        scanner.close();
    }

    public static boolean par(int num1) {

        if (num1 % 2 == 1) {

            return false;

        } else {

            return true;
        }
    }
}
