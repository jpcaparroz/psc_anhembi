package Exerc2_Fase;

import java.util.Scanner;

public class Fases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double resultado;

        System.out.println("Digite o número de fases que o jogador completou:");
        int fasesOk = scanner.nextInt();

        System.out.println("Agora o número de fases total do jogo:");
        int fases = scanner.nextInt();

        resultado = ((double) fasesOk / (double) fases) * 100;

        System.out.print("Porcentagem de fases que o jogador completou: %");
        System.out.format("%.2f", resultado);

        scanner.close();
    }
    
}
