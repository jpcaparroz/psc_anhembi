import java.util.Scanner;

//Calculadora usando if/else
public class ex_calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float num1, num2;
        String operador;

        System.out.println("Digite a operacao: '+' '-' '/' '*'");
        operador = scanner.next();

        System.out.println("Digite o 1º numero: ");
        num1 = scanner.nextFloat();

        System.out.println("Digite o 2º numero: ");
        num2 = scanner.nextFloat();

        if (operador.equals("+")) {

            System.out.println("A soma de " + (num1) + "+" + (num2) + " e igual a: " + (num1 + num2));

        } else if (operador.equals("-")) {

            System.out.println("A subtracao de " + (num1) + "-" + (num2) + " e igual a: " + (num1 - num2));

        } else if (operador.equals("*")) {

            System.out.println("A multiplicacao de " + (num1) + "*" + (num2) + " e igual a: " + (num1 * num2));

        } else if (operador.equals("/")) {

            if (num1 <= 0) {

                System.out.println("Impossivel dividir =(");
            } else {

                System.out.println("A divisao de " + (num1) + "/" + (num2) + " e igual a: " + (num1 / num2));
            }
        }

        scanner.close();
    }

}
