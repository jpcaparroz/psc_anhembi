import java.util.Scanner;

public class ex_ternario {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor: ");
        valor = scanner.nextInt();
        
        System.out.println(valor >= 0 ? "Positivo" : "Negativo");

        scanner.close();
    }
    
}
