import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, media;
       
        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextInt();

        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextInt();

        media = (nota1 + nota2) / 2;
        
        System.out.println("Sua media e igual a: " + media);
        
        entrada.close();
    }
    
}
