package Exemplo1ClasseAbstrata;

public class Quadrado extends FiguraGeometrica{

    double lado;

    public Quadrado (String nome, double lado){

        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }
    
}
