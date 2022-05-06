package ExercRobo;

import java.util.Scanner;

public class AppRobo {
    public static void main(String[] args) {
        Robo robo1 = new Robo(4, 5);
        Scanner scanner = new Scanner(System.in);

        System.out.println(robo1.mostrarPosicao());

        while (true) {
            System.out.println("Voce deseja girar o Robo para qual lado? (N - S - L - O - X para sair)");
            char direcao = scanner.next().charAt(0);
            if (direcao == 'X') {break;}

            robo1.setGirarPara(direcao);
            robo1.andar();
            System.out.println(robo1.mostrarPosicao()); 
        }
        
        
        scanner.close();
    }
}
