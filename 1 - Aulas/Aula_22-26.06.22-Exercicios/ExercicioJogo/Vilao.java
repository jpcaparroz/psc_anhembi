package ExercicioJogo;

public class Vilao extends Personagem {
    
    public Vilao(String nome){
        super(nome);
    }

    @Override
    public void atacar() {
        this.setEnergia(getEnergia() - 15);
    }
}
