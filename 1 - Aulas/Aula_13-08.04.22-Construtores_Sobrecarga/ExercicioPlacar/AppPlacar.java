package ExercicioPlacar;

public class AppPlacar {
    public static void main(String[] args) {

        Placar placar = new Placar("Sao Paulo", "Corinthians");
        Placar placar1 = new Placar(5, 0);
        Placar placar2 = new Placar();

        placar.exibir();
        placar1.exibir();
        placar2.exibir();
    }
    
}
