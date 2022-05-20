package ExemploAluno;

public class Aluno {

    private String nome;
    private int idade;
    private IdCard card;
 
    public Aluno(String nome, int idade, IdCard card){
        
        this.nome = nome;
        this.idade = idade;
        this.card = card;
    }
    
    public String getNome() {
        return nome;
    }

    public IdCard getCard(){
        return card;
    }

    @Override
    public String toString() {
        return "Aluno |" + card + ", Nome: " + nome + ", Idade: " + idade + "]";
    }
 
}
