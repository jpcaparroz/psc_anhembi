package ExercicioCachorro;

public class Proprietario {

    private String nome;
    private String telefone;

    public Proprietario(String nome, String telefone){

        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String toString() {
        
        return "Nome do Proprietário: " + nome + " |Telefone: " + telefone;
    }
}
