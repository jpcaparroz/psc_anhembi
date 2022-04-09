package ExercicioImpressora;

public class Impressora {

    public void exibir(double valor1) {

        System.out.println(valor1);
    }
    
    public void exibir(double valor1, double valor2) {

        System.out.println(valor1 + ", " + valor2);        
    }

    public void exibir(double valor1, String valor2) {

        System.out.println(valor1 + ", " + valor2);         
    }

    public void exibir(String valor1, double valor2) {
        
        System.out.println(valor1 + ", " + valor2);         
    }

    public void exibir(int valor1, int valor2, String valor3) {

        System.out.println(valor1 + ", " + valor2 + ", " + valor3); 
        
    }
}
