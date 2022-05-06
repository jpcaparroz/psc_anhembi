package ExercicioFuncionario;

public class FuncionarioSenior extends Funcionario {

    private double bonus;

    
    public FuncionarioSenior (String nome, int horas, double valorHora, double bonus){

        super(nome, horas, valorHora);
        this.bonus = bonus;
    }

    @Override
    public double Salario() {

        return super.Salario() + bonus * (getHoras() / 10);
    }

    @Override
    public void exibir() {

        super.exibir();
        System.out.println("R$" + bonus + " de bonus");
    }
}
