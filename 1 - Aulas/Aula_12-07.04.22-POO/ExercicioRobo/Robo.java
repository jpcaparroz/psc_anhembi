package ExercicioRobo;

public class Robo {

    private char direcao;

    public void setDirecao(char direcao) {

        if (direcao == 'N' || direcao == 'S' || direcao == 'O' || direcao == 'L') {
            this.direcao = direcao;
        } else {
            System.out.println("A direção escolhida não é valida");
        }
    }

    public char getDirecao() {
        return direcao;        
    }
}
