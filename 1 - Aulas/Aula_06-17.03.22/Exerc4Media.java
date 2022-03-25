import java.util.Scanner;

/**
 * • Faça um programa que:
 * – Calcule a média aritmética de 5 alunos;
 * – Calcule a média da classe.
 * • Cada aluno possui duas notas Ñ (n1 e n2);
 * – A entrada de cada nota deve ser validada!
 * ¨ ou seja, o programa somente avança se a entrada de nota estiver entre 0 e
 * 10.
 * ¨ caso contrário, solicite ela novamente.
 * – Utilize o do. . .while para validar as notas.
 **/

public class Exerc4Media {

    public static void main(String[] args) {

        int n1, n2;
        float media, mediaSala = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("**************Sistema de Calculo de Media**************");

        for (int count = 1; count <= 5; count++) {

            do {
                System.out.println("Digite a nota da n1 do " + count + "º aluno");
                n1 = scanner.nextInt();

            } while (n1 < 0 || n1 > 10);

            do {
                System.out.println("Digite a nota da n2 do " + count + "º aluno");
                n2 = scanner.nextInt();

            } while (n2 < 0 || n2 > 10);

            media = (n1 + n2) / 2;

            mediaSala = media + mediaSala;

            System.out.println("A media do " + count + "º aluno e: " + media);
        }

        System.out.println("*********************************************");
        System.out.println("A media da sala e: " + mediaSala / 5);

        scanner.close();
    }

}
