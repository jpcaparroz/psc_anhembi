package Exercicio01;

import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String marca = null;
        String modelo = null;
        double qntCombustivel = 0;
        double consumo = 0;
        float quilometragem = 0;

        while(true){

            System.out.println("A marca do carro:");
            marca = scanner.next();
            if (marca.isEmpty()) {
                System.out.println("A marca não pode estar vazia.");
                
            } else {
                break;
            } 
        }

        while(true){

            System.out.println("O modelo do carro:");
            modelo = scanner.next();
            if (modelo.isEmpty()) {
                System.out.println("O modelo não pode estar vazio.");
                
            } else {
                break;
            } 
        }

        while(true){

            System.out.println("A quantidade de combustivel do carro:");
            qntCombustivel = scanner.nextDouble();
            if (qntCombustivel < 0) {
                System.out.println("A quantidade não pode ser negativa.");
                
            } else {
                break;
            } 
        }    
        
        while(true){

            System.out.println("O consumo do carro:");
            consumo = scanner.nextDouble();
            if (consumo <= 0) {
                System.out.println("O consumo não pode ser negativo.");
                
            } else {
                break;
            } 
        }
        
        while(true){

            System.out.println("A quilometragem do carro:");
            quilometragem = scanner.nextFloat();
            if (quilometragem < 0) {
                System.out.println("A quilometragem não pode ser negativa.");
                
            } else {
                break;
            } 
        }

        Carro carroUsado = new Carro(marca, modelo, qntCombustivel, consumo, quilometragem);

        System.out.println(carroUsado.exibir());

        System.out.println("Deseja abastecer o carro? (s/n)");
        char resposta = scanner.next().charAt(0);

        if (resposta == 's') {

            System.out.println("Quantos litros?");
            double litros = scanner.nextDouble();

            carroUsado.abastecer(litros);
        }

        System.out.println(carroUsado.exibir());
        
        System.out.println("Quantos km's você deseja percorrer?");
        double distancia = scanner.nextDouble();
        carroUsado.andar(distancia);

        System.out.println(carroUsado.exibir());

        scanner.close();
    }
    
}
