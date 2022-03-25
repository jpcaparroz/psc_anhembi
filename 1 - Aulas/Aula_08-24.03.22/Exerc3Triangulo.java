import java.util.Scanner;

/*
• Faça uma função para calcular e retornar a área de um triângulo
– parâmetros de entrada: base e altura
– retorno: a área calculada
*/
public class Exerc3Triangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite a base do triangulo: ");
        num1 = scanner.nextInt();

        System.out.println("Digite a altura do triangulo: ");
        num2 = scanner.nextInt();

        System.out.println("A Area do triangulo e: " + triangulo(num1, num2) + "cm²");

        scanner.close();
    }

    public static int triangulo(int base, int altura) {

        return ((base * altura) / 2);
    }

}
