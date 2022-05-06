package ExercicioFuncionario;

public class AppFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Joao", 40, 30);
        FuncionarioSenior funcsenior = new FuncionarioSenior("Carlos", 40, 30, 10);

        funcionario.exibir();
        funcsenior.exibir();
        System.out.println("Salario Funcionario: R$" + funcionario.Salario());
        System.out.println("Salario Funcionario Seniro : R$" + funcsenior.Salario());
    }
    
}
