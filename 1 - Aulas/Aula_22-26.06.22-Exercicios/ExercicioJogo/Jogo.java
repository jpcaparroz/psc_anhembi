package ExercicioJogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        
        Heroi heroi = new Heroi("Goku");
        Vilao vilao = new Vilao("Raz");
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Batalha de '" + heroi.getNome() + "'" + " VS " + "'" + vilao.getNome() + "'");
        for (int i = 1; i < 11; i++) {
            
            System.out.println("<<< "+ i + "º TURNO!!!>>>");

            if (random.nextInt(100) <= 50 && heroi.getEnergia() >= 20) {

                System.out.println(heroi.getNome() + " Ataca!");
                heroi.atacar();
                System.out.println(heroi.getEnergia() + "% de Energia"); 
                heroi.falarNomeAtaque("TOMAAAAAA");
                vilao.diminuirVida(25);
                System.out.println("****************");
                System.out.println(vilao.getNome() + " sofre ataque");
                System.out.println(vilao.getNome() + ": " + vilao.getVida() + "% VIDA");

                if (vilao.getVida() <= 0) {
                    System.out.println(heroi.getNome() + " VENCEU!!! xD");
                    break;
                }
            }

            if (random.nextInt(100) <= 40 && vilao.getEnergia() >= 15) {

                System.out.println(vilao.getNome() + " Ataca!");
                vilao.atacar();
                System.out.println(vilao.getEnergia() + "% de Energia");
                heroi.diminuirVida(25);
                System.out.println("****************");
                System.out.println(heroi.getNome() + " sofre ataque");
                System.out.println(heroi.getNome() + ": " + heroi.getVida() + "% VIDA");

                if (heroi.getVida() <= 0) {
                    
                    System.out.println(vilao.getNome() + " VENCEU!!! :X");
                }
            }
            
        }

        if(heroi.getVida() > 0 && vilao.getVida() > 0){

            System.out.println("<<<<<<<<<<< HOUVE UM EMPATE >>>>>>>>>>>>");
        }

        scanner.close();
    }
    
}
