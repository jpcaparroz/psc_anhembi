package ExercicioAnimal;

public class Animal {

    private String nome;
    private String raca;
    private int anoNasc;
    private Proprietario prop;
    
    public Animal(){
        prop = new Proprietario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public Proprietario getProp() {
        return prop;
    }

    public void setProp(Proprietario prop) {
        
        if (prop != null) {
            this.prop = prop;
        } else {
            this.prop = new Proprietario();
        }
        
    }

    public String imprimir(){

        return "Nome: " + nome + " || Raça: " + raca + " || Ano de Nascimento: " + anoNasc + " || Proprietario: " + prop.imprimir();
    }
    
}
