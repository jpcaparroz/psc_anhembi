package ExercicioFuncionario;

public class Funcionario {

    private String nome;
    private int horas;
    private double valorHora;
    

    public Funcionario (String nome, int horas, double valorHora){

        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public double Salario (){

        return (double) horas * valorHora;
    }

    public void exibir(){

        System.out.println("Nome: " + nome + " | Horas Trabalhadas: " + horas + "| Valor da Hora Trabalhada: " + valorHora);
    }

    public int getHoras() {
        return horas;
    }
}
