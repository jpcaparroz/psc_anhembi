package ExemploConstrutor;

public class Pessoa {

    private String nome;
    private double salario;

    public Pessoa(String nomePessoa, double salarioPessoa){

        nome = nomePessoa;
        salario = salarioPessoa;
    }

    public void exibir() {

        System.out.println(nome + " || Salario R$" + salario);        
    }
    
}
