/*
• Escreva uma função para calcular e retornar a média de três
números
– Parâmetros de entrada: os três números
– retorno: a média calculada
*/

import java.util.Scanner;

public class Exerc4Media {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Digite o 1º numero: ");
        n1 = scanner.nextInt();

        System.out.println("Digite o 2º numero: ");
        n2 = scanner.nextInt();

        System.out.println("Digite o 3º numero: ");
        n3 = scanner.nextInt();

        System.out.println("a media e: " + media(n1, n2, n3) + " =)");
        scanner.close();
    }

    public static float media(float num1, float num2, float num3) {

        return ((num1 + num2 + num3) / 3);

    }

}