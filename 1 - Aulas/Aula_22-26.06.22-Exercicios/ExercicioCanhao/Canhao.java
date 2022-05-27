package ExercicioCanhao;

public class Canhao {
    
    private Bala bala;
    private double alcanceMaximo;

    public void setBala (Bala bala){
        this.bala = bala;
    }

    public Bala getBala (){
        return bala;
    }

    public double disparar (double velocidadeInicial, double angulo){

        alcanceMaximo = 2 * (velocidadeInicial * velocidadeInicial) * (Math.sin(Math.toRadians(angulo))  * Math.cos(Math.toRadians(angulo)) / 9.81);
        bala.setPosicaoX(alcanceMaximo);
        return alcanceMaximo;
    }

    public double getAlcanceMaximo() {
        return alcanceMaximo;
    }
}
