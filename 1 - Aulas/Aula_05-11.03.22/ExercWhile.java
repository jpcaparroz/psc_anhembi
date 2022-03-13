import java.util.Scanner;

public class ExercWhile {

    public static void main(String[] args) {

        int count, lim;

        count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero lim para a contagem: ");
        lim = scanner.nextInt();

        System.out.println("*****************************************");

        while (count <= lim) {

            System.out.print(count + " ");
            count++;
        }

        scanner.close();
    }

}
