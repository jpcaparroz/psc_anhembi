package ExercicioData;

public class App {
    public static void main(String[] args) {
        
       // Data admissao = new Data(9, 5, 2015);
       // Data nascimento = new Data(9, 2, 2000);

        Funcionario funcionario = new Funcionario("Joao", "Programador", new Data(9, 2, 2000), new Data(9, 5, 2015));

        System.out.println(funcionario.toString());
    }
    
}
