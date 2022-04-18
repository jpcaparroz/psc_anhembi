package Exercicio01;

import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Carro carroUsado = new Carro("Volks", "Corsa", 15, 7, 15000);

        System.out.println(carroUsado.exibir());

        System.out.println("Deseja abastecer o carro? (s/n)");
        char resposta = scanner.next().charAt(0);

        if (resposta == 's') {

            System.out.println("Quantos litros?");
            double litros = scanner.nextDouble();

            carroUsado.abastecer(litros);
        }

        carroUsado.exibir();
        
        System.out.println("Quantos km's você deseja percorrer?");
        double distancia = scanner.nextDouble();

        carroUsado.andar(distancia);

        scanner.close();
    }
    
}
