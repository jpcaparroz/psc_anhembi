package Exemplo1ClasseAbstrata;

public class Losango extends FiguraGeometrica{
    
    double diagMaior;
    double diagMenor;

    public Losango(String nome, double diagMaior, double diagMenor){
        
        super(nome);
        this.diagMaior = diagMaior;
        this.diagMenor = diagMenor;
    }

    @Override
    public double calcularArea() {

        return (diagMaior * diagMenor) / 2;
        
    }
}
