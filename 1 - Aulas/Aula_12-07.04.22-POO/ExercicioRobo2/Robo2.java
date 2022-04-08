package ExercicioRobo2;

public class Robo2 {

    private char direcao;
    private int posicaoY = 0;
    private int posicaoX = 0;

    public void setDirecao(char direcao) {

        if (direcao == 'N') {
            posicaoY++;
            this.direcao = direcao;
        } else if (direcao == 'S') {
            posicaoY--;
            this.direcao = direcao;
        } else if (direcao == 'O') {
            posicaoX--;
            this.direcao = direcao;
        } else if (direcao == 'L') {
            posicaoX++;
            this.direcao = direcao;
        } else {
            System.out.println("A direção escolhida não é valida");
        }
    }

    public char getDirecao() {
        return direcao;
    }

    public void mostrarPosicaoAtual() {
        
        System.out.println("Posição X: " + posicaoX);
        System.out.println("Posição Y: " + posicaoY);
    }
}
