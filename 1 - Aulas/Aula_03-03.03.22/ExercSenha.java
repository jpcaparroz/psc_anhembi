import java.util.Scanner;

public class ExercSenha {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String senha ="R10p5";

        System.out.println("Digite a senha: ");
        senha = scanner.next();

        if (senha.equals("R10p5")) {

            System.out.println("Acesso Concedido =)");
                        
        } else {
            System.out.println("Acesso Negado =#");
        }

        scanner.close();
    }
    
}
