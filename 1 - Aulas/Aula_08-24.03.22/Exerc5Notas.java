/*
• Faça um programa que leia a nota de 5 alunos
– Cada aluno possui três notas (A1, A2, A3)
– para cada aluno, calcule a média das notas
– utilize a função desenvolvida no exercício anterior para calcular a média.
*/
import java.util.Scanner;

public class Exerc5Notas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a1, a2, a3;

        for(int count = 1; count <= 5; count++){

            System.out.println("Digite a A1 do " + count + "º aluno: ");
            a1 = scanner.nextInt();

            System.out.println("Digite a A2 do " + count + "º aluno: ");
            a2 = scanner.nextInt();

            System.out.println("Digite a A3 do " + count + "º aluno: ");
            a3 = scanner.nextInt();

            System.out.printf("A media do %d º aluno e = %.2f \n", count, media(a1, a2, a3) );

            linha();
        }

        scanner.close();
    }

    public static float media(float nota1, float nota2, float nota3) {

        return((nota1 + nota2 + nota3) / 3);

    }

    public static void linha() {

        System.out.println("*********************");
        
    }
    
}
