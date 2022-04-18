package Exercicio01;

public class Carro {

    private String marca;
    private String modelo;
    private double qntcombustivel;
    private double consumo;
    private float quilometragem;
    
    public Carro(String marca, String modelo, double qntcombustivel, double consumo, float quilometragem){

        this.marca = marca;
        this.modelo = modelo;
        this.qntcombustivel = qntcombustivel;
        this.consumo = consumo;
        this.quilometragem = quilometragem;
    }

    public Carro(String marca, String modelo, double consumo){

        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public String Exibir() {

        String exibirCarro = "Marca: " + marca + "Modelo: " + modelo + "Quantidade de Combustivel: " + qntcombustivel + "L " + "Consumo Médio: " + consumo + "km/l " + "Quilometragem: " + quilometragem + "km";

        return exibirCarro;        
    }
}
