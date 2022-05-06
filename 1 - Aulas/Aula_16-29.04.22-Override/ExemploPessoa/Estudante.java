package ExemploPessoa;

public class Estudante extends Pessoa {

    private int ra;
    private String curso;
    private String turma;

    public Estudante(String nome, String email, String telefone, int ra){
        
        super(nome, email, telefone);
        this.ra = ra;
    }

    @Override
    public String toString(){
        return super.toString() + " RA: " + ra;
    }
    
}
