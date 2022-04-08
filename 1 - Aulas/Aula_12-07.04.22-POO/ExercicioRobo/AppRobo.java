package ExercicioRobo;

import java.util.Scanner;

public class AppRobo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Robo robo = new Robo();
                
        System.out.println("Digite a direção em que o Robo andará: ");        
        char direcao = scanner.next().charAt(0);

        robo.setDirecao(direcao);

        scanner.close();
    }
}
