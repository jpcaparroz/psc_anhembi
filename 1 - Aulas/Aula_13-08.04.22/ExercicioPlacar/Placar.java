package ExercicioPlacar;

public class Placar {

    private String time1;
    private String time2;
    private int result1;
    private int result2;

    public Placar(String nomeTime1, String nomeTime2) {
        time1 = nomeTime1;
        time2 = nomeTime2;

        //ou this.time1 = time1;

    }

    public Placar(int resultTime1, int resultTime2) {
        result1 = resultTime1;
        result2 = resultTime2;
    }

    public Placar() {
        time1 = "??";
        time2 = "??";
    }

    public void exibir() {

        System.out.println(time1 + " " + result1 + " X " + result2 + " " + time2);
        
    }
}
