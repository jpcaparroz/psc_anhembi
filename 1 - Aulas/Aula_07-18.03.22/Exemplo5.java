import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite um valor: ");
        valor1 = scanner.nextInt();

        System.out.println("Digite um valor para a soma: ");
        valor2 = scanner.nextInt();

        System.out.println("O Resultado da Soma e igual a: " + soma(valor1, valor2));

        scanner.close();
    }

    public static int soma(int n1, int n2) {

        return (n1 + n2);
    }
    
}
