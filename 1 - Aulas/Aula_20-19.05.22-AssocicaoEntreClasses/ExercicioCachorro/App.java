package ExercicioCachorro;

import java.util.Scanner;

import ExercicioData.Data;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Petshop pet = new Petshop();

        Proprietario prop = new Proprietario("Joao Pedro", "9123032");
        Cachorro dog = new Cachorro("Amora", "Lhasa", prop, new Data(15, 11, 2014));
        pet.adicionar(dog);

        Proprietario prop1 = new Proprietario("Pedro", "4324235");
        Cachorro dog1 = new Cachorro("Lizzie", "Vira-lata", prop1, new Data(20, 10, 2011));
        pet.adicionar(dog1);

        Proprietario prop2 = new Proprietario("Pedro", "4324235");
        Cachorro dog2 = new Cachorro("Andromeda", "Lhasa", prop2, new Data(20, 10, 2011));
        pet.adicionar(dog2);

        Proprietario prop3 = new Proprietario("Pedro", "4324235");
        Cachorro dog3 = new Cachorro("Mia", "Lhasa", prop3, new Data(20, 10, 2011));
        pet.adicionar(dog3);

        pet.listar();

        System.out.println("Digite a pesquisa por raça:");
        pet.pesquisar(scanner.nextLine());

        scanner.close();
    }
    
}
