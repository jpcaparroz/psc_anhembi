package Exercicio01;

public class Carro {

    private String marca;
    private String modelo;
    private double qntCombustivel;
    private double consumo;
    private float quilometragem;

    public Carro(String marca, String modelo, double qntCombustivel, double consumo, float quilometragem) {
        
        if (marca != null && marca.length() > 4){

            this.marca = marca;   
        } else{

            this.marca = "????";
        }

        if (modelo != null && modelo.length() > 1){

            this.modelo = modelo;   
        } else{
            
            this.modelo = "????";
        }

        if (qntCombustivel > 0){

            this.qntCombustivel = qntCombustivel;   
        }

        if (consumo > 0){

            this.consumo = consumo;   
        }

        if (quilometragem > 0){

            this.quilometragem = quilometragem;   
        }
    }

    public Carro(String marca, String modelo, double consumo) {

        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public String exibir() {

        String exibirCarro = "Marca: " + marca + " | Modelo: " + modelo + " | Quantidade de Combustivel: "
                + qntCombustivel + "L " + " | Consumo Médio: " + consumo + "km/l " + " | Quilometragem: "
                + quilometragem + "km";

        return exibirCarro;
    }

    public void abastecer(double litros) {

        if(litros > 0){

            System.out.println("Abastecido com sucesso!");
            System.out.println("Adicionados " + litros + "L " + "ao tanque.");
            qntCombustivel = qntCombustivel + litros;

            System.out.println(litros + qntCombustivel + "L no tanque.");            

        } else {

            System.out.println("Combustivel não pode ser negativo! =(");
        }      
    }

    public void andar(double distancia) {

        if (distancia >= 0 && distancia > (qntCombustivel * consumo)) {

            System.out.println("Não possue combustivel suficiente =(");

        } else {

            System.out.println("Viagem feita com sucesso! =)");
            quilometragem = quilometragem + (float) distancia;
        }
    }
}
