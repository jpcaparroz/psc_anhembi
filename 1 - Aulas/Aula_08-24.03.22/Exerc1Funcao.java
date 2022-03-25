/* • Escreva uma função que recebe dois números e imprime o maior
deles
– Parâmetros de entrada: dois números
*/

import java.util.Scanner;

public class Exerc1Funcao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o 1º numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o 2º numero: ");
        num2 = scanner.nextInt();

        maior(num1, num2);

        scanner.close();
    }
    public static void maior(int n1, int n2) {

        if (n1 > n2) {
            System.out.println("O maior numero e o 1: " + n1);
            
        } else {

            System.out.println("O maior numero e o 2: " + n2);
        }
        
    }    
}
