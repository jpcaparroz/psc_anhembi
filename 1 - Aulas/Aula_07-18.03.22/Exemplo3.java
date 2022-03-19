public class Exemplo3 {
    public static void main(String[] args) {
        
        linha(45);
        linha2(15, '¹');
    }

    public static void linha(int tamanho) {

        for(int count = 1; count <= tamanho; count++){
            System.out.print("-");
        }
        System.out.println();
    }

    public static void linha2(int tamanho, char simbolo) {

        for(int count = 1; count <= tamanho; count++){
            System.out.print(simbolo);
        }
        System.out.println();
    }
    
}
