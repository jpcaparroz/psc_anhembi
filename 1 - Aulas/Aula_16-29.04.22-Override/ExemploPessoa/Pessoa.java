package ExemploPessoa;

public class Pessoa {

    private String nome;
    private String email;
    private String telefone;

    public Pessoa(String nome, String email, String telefone){

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override //Dando um override na superclass do java "Object"
    public String toString(){
        return "Nome: " + nome;
    }
}
