/*
Escreva um programa que gere um vetor com números aleatórios 
e mostre o vetor na ordem contrária em que os números foram gerados.
*/

import java.util.Random;

public class ExercVetorAleatorio {
    public static void main(String[] args) {
        
        Random random = new Random();

        int vetor[] = new int[5];

        for(int i = 0; i < vetor.length ;i++ ){

            vetor[i] = random.nextInt();
        }

        System.out.println("Vetor normal de 0 a 4: ");
        
        for(int i = 0; i < vetor.length ;i++ ){

            System.out.println(vetor[i]);
        }

        System.out.println("Vetor ao contrario de 4 a 0: ");

        for(int i = vetor.length - 1; i >= 0 ;i-- ){

            System.out.println(vetor[i]);
        }
    }
    
}
