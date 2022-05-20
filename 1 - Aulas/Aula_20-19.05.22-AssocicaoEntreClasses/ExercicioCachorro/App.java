package ExercicioCachorro;

import ExercicioData.Data;

public class App {
    public static void main(String[] args) {

        Data data = new Data(15, 11, 2014);
        Proprietario prop = new Proprietario("Joao Pedro", "9123032");
        Cachorro dog = new Cachorro("Amora", "Lhasa", prop, data);

        Petshop pet = new Petshop();

        System.out.println(dog.getProprietario().getNome());
    }
    
}
