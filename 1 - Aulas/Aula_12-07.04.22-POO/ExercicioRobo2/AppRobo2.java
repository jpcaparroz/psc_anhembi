package ExercicioRobo2;

import java.util.Scanner;

public class AppRobo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Robo2 robo = new Robo2();

        int i = 0;
        char continuar;

        while (i == 0) {
            System.out.println("Digite a direção em que o Robo andará: ");
            char direcao = scanner.next().charAt(0);

            robo.setDirecao(direcao);
            robo.mostrarPosicaoAtual();

            System.out.println("Deseja continuar movendo o Robo? (s/n)");
            continuar = scanner.next().charAt(0);

            if (continuar == 'S') {
                System.out.println("Continuando...");
            } else {
                i++;
            }

        }

        scanner.close();
    }

}
