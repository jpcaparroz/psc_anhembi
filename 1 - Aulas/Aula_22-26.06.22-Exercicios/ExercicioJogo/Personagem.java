package ExercicioJogo;

public abstract class Personagem {
    
    private String nome;
    private int vida = 100;
    private int energia = 100;

    public Personagem(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome (){
        return nome;
    }

    public int getEnergia(){
        return energia;
    }

    public int getVida(){
        return vida;
    }
    
    public void diminuirVida (int ataqueVida) {
        
        vida = vida - ataqueVida;
    }

    public void atacar() {}
}
