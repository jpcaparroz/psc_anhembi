package ExercicioData;

public class Funcionario {

    private String nome;
    private String ocupacao;
    private Data nascimento;
    private Data admissao;

    public Funcionario(String nome, String ocupacao, Data nascimento, Data admissao){

        this.nome = nome;
        this.ocupacao = ocupacao;
        this.nascimento = nascimento;
        this.admissao = admissao;
    }

    public String toString() {

        return "Nome: " + nome + 
        " |Ocupação: " + ocupacao + 
        "| Nascimento: " + nascimento + 
        " |Admissão: " + admissao;
        
    }
    
}
