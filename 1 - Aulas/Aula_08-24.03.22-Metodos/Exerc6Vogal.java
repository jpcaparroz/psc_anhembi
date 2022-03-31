/*
• Escreva uma função chamada isVogal() que verifica se um dado
caractere é uma vogal
– Parâmetros de entrada: um caractere
– retorno: true se for vogal ou false caso contrário

*/
import java.util.Scanner;

public class Exerc6Vogal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        char letra;

        System.out.println("Digite uma letra: ");
        letra = scanner.next().charAt(0);

        System.out.println(isVogal(letra));

        scanner.close();
    }

    public static boolean isVogal(int test) {

        if (test == 'a' || test == 'e' || test == 'i' || test == 'o' || test == 'u') {

            return true;

        } else{
            
            return false;
        }
        
    }
    
}
