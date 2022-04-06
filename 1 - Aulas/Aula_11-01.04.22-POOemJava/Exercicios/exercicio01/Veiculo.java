package exercicio01;

public class Veiculo {

    String marca;
    String modelo;
    double consumo;
    
    void dados(){
        System.out.println("A marca do carro: " + marca + ".");
        System.out.println("E o seu modelo: " + modelo + ".");
    } 

    double gasto(){
        return consumo;
    }
}
