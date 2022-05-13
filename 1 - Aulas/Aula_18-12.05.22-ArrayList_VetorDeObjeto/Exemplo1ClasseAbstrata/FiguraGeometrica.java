package Exemplo1ClasseAbstrata;

public abstract class FiguraGeometrica {

    private String nome;

    public abstract double calcularArea();
    
    public FiguraGeometrica(String nome){

        this.nome = nome;
    }

    public  String getNome(){
        return this.nome;
    }

}
