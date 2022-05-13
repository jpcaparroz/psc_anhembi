package Exemplo1ClasseAbstrata;

public class Elipse extends FiguraGeometrica {

    double diagMaior;
    double diagMenor;

    public Elipse(String nome, double diagMaior, double diagMenor) {

        super(nome);
        this.diagMaior = diagMaior;
        this.diagMenor = diagMenor;
    }

    @Override
    public double calcularArea() {
        
        return Math.PI * diagMaior * diagMenor;
        
    }
    
}
