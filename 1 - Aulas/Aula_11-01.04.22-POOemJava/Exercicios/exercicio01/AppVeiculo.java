package exercicio01;

public class AppVeiculo {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo();

        carro.marca = "Volkswagen";
        carro.modelo = "Corsa Classic";
        carro.consumo = 12.5;
        
        carro.dados();
        
        System.out.println("O carro faz " + carro.gasto() + "km/l");
    }
     
}
