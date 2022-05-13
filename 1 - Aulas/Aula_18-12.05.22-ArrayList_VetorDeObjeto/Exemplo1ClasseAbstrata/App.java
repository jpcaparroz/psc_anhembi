package Exemplo1ClasseAbstrata;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<FiguraGeometrica> lista = new ArrayList<>();

        //FiguraGeometrica[] vetor = new FiguraGeometrica[5];

        lista.add(new Circulo("Circulo", 3));
        lista.add(new Triangulo("Seta", 3, 3));
        lista.add(new Quadrado("Caixa", 5));
        lista.add(new Losango("Losango", 2, 5));
        lista.add(new Elipse("Elip", 9, 2));

        //vetor[0] = new Circulo("Circulo", 3);
        //vetor[1] = new Triangulo("Seta", 3, 3);
        //vetor[2] = new Quadrado("Caixa", 5); 
        //vetor[3] = new Losango("Losango", 2, 5);
        //vetor[4] = new Elipse("Elip", 9, 2);       

        for (FiguraGeometrica fig : lista) {

            System.out.println(fig.getNome());
            System.out.println(fig.calcularArea());
            System.out.println("**********************");
        }
    }
}
