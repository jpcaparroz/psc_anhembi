package ExercRobo;

public class Robo {

    private int posicaoY;
    private int posicaoX;
    private int maxX;
    private int maxY;
    private char girarPara;

    public Robo(int maxX, int maxY){

        this.maxX = maxX;
        this.maxY = maxY;
    }
    
    public Robo(int maxX, int maxY, int posInicialX, int posInicialY){

        this.maxX = maxX;
        this.maxY = maxY;

        if (posInicialY > maxY) {

            posInicialY = 0;

        } else {posicaoY = posInicialY + posicaoY;}

        if (posInicialX > maxX) {

            posInicialX = 0;

        } else {posicaoX = posInicialX + posicaoX;}
    }

    public void setGirarPara(char girarPara){

        if (girarPara != 'N' && girarPara != 'S' && girarPara != 'L' && girarPara != 'O') {
            System.out.println("Posição inválida! =(");
        } else { this.girarPara = girarPara;}
        
    }

    public char getGirarPara() {

        return girarPara;        
    }

    public String mostrarPosicao(){

        return "Posicao X: " + posicaoX + " | PosicaoY: " + posicaoY;
    }

    public void andar(){

        switch (girarPara) {
            case 'N':
                
            posicaoY++;
            if (posicaoY > maxY) {
                posicaoY--;
                System.out.println("Posição máxima atingida =(");
            }
                break;

            case 'S':

            posicaoY--;
            if (posicaoY < (maxY * (-1))) {
                posicaoY++;
                System.out.println("Posição máxima atingida =(");
            }
                break;

            case 'L':
                
            posicaoX++;
            if (posicaoX > maxX) {
                posicaoX--;
                System.out.println("Posição máxima atingida =(");
            }
                break;

            case 'O':

            posicaoX--;
            if (posicaoX < (maxX * (-1))) {
                posicaoX++;
                System.out.println("Posição máxima atingida =(");
            }
                break;                
        
            default:
                break;
        }
    }
}


