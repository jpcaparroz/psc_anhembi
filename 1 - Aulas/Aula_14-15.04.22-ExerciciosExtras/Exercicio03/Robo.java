package Exercicio03;

public class Robo {

    private int direcao;
    private int posicaoY;
    private int posicaoX;
    private int maxX;
    private int maxY;


    public void setDirecao(int direcao) {

        switch (direcao) {

            case 1:

                posicaoY++;
                if (posicaoY > maxY) {
                    posicaoY--;
                    System.out.println("Posição máxima inválida!");
                }
                mapa();
                break;

            case 2:

                posicaoY--;
                if (posicaoY < (maxY * (-1))) {
                    posicaoY++;
                    System.out.println("Posição máxima inválida!");
                }
                mapa();
                break;
        
            case 3:
                
                posicaoX++;
                if (posicaoX > maxX) {
                    posicaoX--;
                    System.out.println("Posição máxima inválida!");
                }
                mapa();
                break;

            case 4:

                posicaoX--;
                if (posicaoX < (maxX * (-1))) {
                    posicaoX++;
                    System.out.println("Posição máxima inválida!");
                }
                mapa();
                break;

            default:

                System.out.println("Entrada inválida.");
                break;
        }
    }

    public int getDirecao() {

        return direcao;            
    }

    public void setMaxY(int max) {

        if (max < 0) {

            System.out.println("Não pode ser um numero negativo!");
        }

        maxY = maxY + max;
    }

    public int getMaxY() {

        return maxY;
    }

    public void setMaxX(int max) {

        if (max < 0) {

            System.out.println("Não pode ser um numero negativo!");
        }

        maxX = maxX + max;
    }

    public int getMaxX() {

        return maxX;
    }
    
    public void mapa() {

        System.out.println("Posição X: " + posicaoX);
        System.out.println("Posição Y: " + posicaoY);

    }

    public void linha(int quantidade){

        for (int i = 0; i < quantidade; i++) {
            
            System.out.print("*");
        }
        System.out.println();
    }
}
