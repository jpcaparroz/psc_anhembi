/*
Uma pessoa deseja verificar se um dado está viciado ou não. 
Para ajudá-la você deve escrever um programa que leia os valores de 1 a 6 correspondendo aos lados do dado, e ao final da digitação 
exibir quantas vezes cada lado ocorreu. Na entrada de dados você deve validar se os números estão de acordo com o esperado. 
O critério de parada de leitura é quando o usuário digitar o valor -1.
*/
import java.util.Scanner;

public class ExercDados {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int dado[] = new int[7];
        
        int numero = 0;

        int verificar = 0;

        for (int i = 0; i < dado.length; i++) {

            dado[i] = 0;
        }

        while(verificar != -1){

            System.out.println("Digite um numero entre 1 e 6");
            numero = scanner.nextInt();

            if(numero == -1){
                break;
            }
            dado[numero] = dado[numero]  + 1;
        }

        System.out.println("Resultado: ");

        for (int i = 1; i < dado.length; i++) {

            System.out.println("Posição " + i + " foi sorteada " + dado[i] + " vez(es)");            
        }

        scanner.close();
    }
    
}
