package Exemplo1ClasseAbstrata;

public class Circulo extends FiguraGeometrica{
    
    double raio;

    public Circulo(String nome, double raio){
        
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}
