package Exercicio03;

import java.util.Scanner;

public class AppRobo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Robo robo1 = new Robo();

        robo1.linha(20);
        robo1.linha(15);
        System.out.println("(= Robo Game =)");
        robo1.linha(15);
        robo1.linha(20);

        System.out.println("Primeiro defina o tamanho do mapa do robo, quanta(s) casa(s) na posição Y?");
        int max = scanner.nextInt();
        robo1.setMaxY(max);

        System.out.println("Agora defina quanta(s) casa(s) na posição X:");
        max = scanner.nextInt();
        robo1.setMaxX(max);



        while (true) {

            System.out.println("1 - Andar para Norte | 2 - Andar para Sul | 3 - Andar para Leste | 4 - Virar para Oeste | 5 - Sair");
            int resposta = scanner.nextInt();

            if (resposta == 5) {
                break;
            }

            robo1.setDirecao(resposta); 
        }

        scanner.close();
    }
    
}
