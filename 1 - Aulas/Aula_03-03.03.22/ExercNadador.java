import java.util.Scanner;

public class ExercNadador {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade nadador: ");
        idade = scanner.nextInt();

        if (idade < 5) {

            System.out.println("Voce nao tem idade suficiente :(");
            
        }else if (idade <= 7) {

            System.out.println("Categoria: infantilA");
            
        } else if (idade <=10) {

            System.out.println("Categoria: infantilB");
            
        } else if (idade <= 13) {

            System.out.println("Categoria: juvenilA");
            
        } else if (idade <= 17) {

            System.out.println("Categoria: juvenilB");
            
        } else {

            System.out.println("Categoria: Senior");
        }

      scanner.close();  
    }
    
}
