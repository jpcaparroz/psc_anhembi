package ExercicioCanhao;

public class App {
    public static void main(String[] args) {
        
        Canhao canhao = new Canhao();
        canhao.setBala(new Bala(0, 0));

        canhao.disparar(15, 25);
        System.out.println("Alcance Maximo >>");
        System.out.println(canhao.getAlcanceMaximo());

        //System.out.println(canhao.getBala().getPosicaoX());
    }
}
