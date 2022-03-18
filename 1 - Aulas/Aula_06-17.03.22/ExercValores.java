/**
 * • Faça um algoritmo que:
 * – leia um conjunto não determinado de valores e mostre:
 * ¨ o valor lido
 * ¨ o quadrado
 * ¨ o cubo
 * ¨ a raiz quadrada
 * – finalize a leitura dos valores caso seja digitado um valor negativo ou
 * zero.
 **/

import java.util.Scanner;

public class ExercValores {

    public static void main(String[] args) {

        int valor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = scanner.nextInt();

        if (valor <= 0) {

            System.out.println("Esse valor e invalido =(");

        } else {

            System.out.println("O valor digitado e = " + valor);
            System.out.println("O Valor ao quadrado e = " + valor * valor); //ou Math.pow(valor, 2)
            System.out.println("O Valor ao cubo e = " + (valor * valor) * valor); //ou Math.pow(valor, 3)
            System.out.println("A Raiz quadrada do numero e = " + Math.sqrt(valor));
        }

        scanner.close();
    }

}
