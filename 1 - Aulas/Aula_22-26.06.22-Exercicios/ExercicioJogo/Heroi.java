package ExercicioJogo;

public class Heroi extends Personagem {
    
    public Heroi(String nome){
        super(nome);
    }

    @Override
    public void atacar() {
        this.setEnergia(getEnergia() - 20);
    }

    public String falarNomeAtaque(String ataque) {

        return "ATAQUE: " + ataque + "!!!!";
    }
}
