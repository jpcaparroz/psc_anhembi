import java.util.Scanner;

//Calculadora usando Switch Case
public class ex_calculadora_sc {

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

        switch (operador) {
            case "+":

                System.out.println("A soma de " + (num1) + "+" + (num2) + " e igual a: " + (num1 + num2));

                break;
            case "-":

                System.out.println("A subtracao de " + (num1) + "-" + (num2) + " e igual a: " + (num1 - num2));

                break;

            case "*":

                System.out.println("A multiplicacao de " + (num1) + "*" + (num2) + " e igual a: " + (num1 * num2));

                break;
            case "/":

                if (num1 <= 0) {

                    System.out.println("Impossivel dividir =(");
                } else {

                    System.out.println("A divisao de " + (num1) + "/" + (num2) + " e igual a: " + (num1 / num2));
                }
                break;

            default:
                break;
        }

        scanner.close();
    }

}
