/*
• Faça uma função que recebe dois números como parâmetro
– A função deve retorna a quantidade de número pares que existem entre os dois
números
– Exemplo:
¨ entrada: 4, 15
¨ retorno: 6
*/
import java.util.Scanner;

public class Exerc8Pares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o primeiro numero: ");
        num2 = scanner.nextInt();

        System.out.println("A quantidade de numeros pares e: " + pares(num1, num2));

        scanner.close();
    }

    public static int pares(int n1, int n2) {

        int quantidade = 0;

        for (int i = n1; i < n2; i++) {

            if (i % 2 != 1) {
                quantidade++;
            }
        }

        return quantidade;
    }

}
