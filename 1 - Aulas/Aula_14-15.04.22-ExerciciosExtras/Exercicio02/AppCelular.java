package Exercicio02;

import java.util.Scanner;

public class AppCelular {
    public static void main(String[] args) {
        
        CelularPrePago celular1 = new CelularPrePago("Rafaela", "(11) 9054-3251", 0);

        Scanner scanner = new Scanner(System.in);

        System.out.println(celular1.exibir()); 

        System.out.println("Deseja fazer uma ligação? (s/n)");
        char resposta = scanner.next().charAt(0);

        if (resposta == 's') {
            
            celular1.fazerLigacao();
        }

        System.out.println("Deseja recarregar o saldo? (s/n)");
        resposta = scanner.next().charAt(0);

        if (resposta == 's') {
            
            System.out.println("Quantos reais deseja adicionar?");
            double recarga = scanner.nextDouble();
            celular1.recarregar(recarga);
        }

        System.out.println("Deseja fazer uma ligação? (s/n)");
        resposta = scanner.next().charAt(0);

        if (resposta == 's') {
            
            celular1.fazerLigacao();
        }
    
        scanner.close();
    }
}
