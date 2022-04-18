package ExercicioImpressora;

public class AppImpressora {
    public static void main(String[] args) {
        
        Impressora impressora = new Impressora();

        impressora.exibir(48.90);
        impressora.exibir(90.3, 75.3);
        impressora.exibir(45.9, "oi");
        impressora.exibir("af", 13.01);
        impressora.exibir(3, 2, "caramba");
    }
    
}
