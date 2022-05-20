package ExemploAluno;

public class IdCard {

    private int anoIngresso;
    private int codigoCartao;
    private int ra;
    private String universidade;
    private String curso;
    
    
    public IdCard(int anoIngresso, int codigoCartao, int ra, String universidade, String curso){

        this.anoIngresso = anoIngresso;
        this.codigoCartao = codigoCartao;
        this.ra = ra;
        this.universidade = universidade;
        this.curso = curso;
    }

    public String getUniversidade(){
        return universidade;
    }

    public String toString() {

        return "Ano de Ingressão: " + anoIngresso + " |Código do Cartão: " + codigoCartao + 
        " |RA: " + ra + " |Universidade: " + universidade + " |Curso: " + curso; 
        
    }

}
