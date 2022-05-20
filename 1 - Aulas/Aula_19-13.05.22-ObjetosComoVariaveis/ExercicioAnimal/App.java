package ExercicioAnimal;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal = new Animal();
        Proprietario prop = new Proprietario();

        System.out.println("******* Animal || Proprietario *******");

        System.out.println("Primeiramente, informações do proprietario");

        System.out.println("Digite o nome do Proprietario:");
        prop.setNome(scanner.nextLine());

        System.out.println("Digite o telefone do Proprietario:");
        prop.setTelefone(scanner.nextLine());

        animal.setProp(prop);

        System.out.println("Agora informações do Animal");
        
        System.out.println("Digite o nome do Animal:");
        animal.setNome(scanner.nextLine());

        System.out.println("Digite a raça do Animal:");
        animal.setRaca(scanner.nextLine());

        System.out.println("Digite o ano de nascimento do animal:");
        animal.setAnoNasc(scanner.nextInt());

        System.out.println("*****************************");

        System.out.println(animal.imprimir());

        scanner.close();
    }
    

    
}
