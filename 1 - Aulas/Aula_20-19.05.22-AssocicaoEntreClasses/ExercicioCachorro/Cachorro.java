package ExercicioCachorro;
import ExercicioData.Data;

public class Cachorro {

    private String nome;
    private String raca;
    private Proprietario proprietario;
    private Data nascimento;

    public Cachorro(String nome, String raca, Proprietario proprietario, Data nascimento) {
        this.nome = nome;
        this.raca = raca;
        this.proprietario = proprietario;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public String toString() {

        return "Nome do Pet: " + nome + " |Raça: " + raca + " | Proprietário: " + proprietario + " | Data de Nascimento: " + nascimento;
        
    }
}
