public class Exemplo2 {
    public static void main(String[] args) {
        
        System.out.println("Chamando o metodo 1...");
        metodo1();
        System.out.println("FINAL!!!!");
    }

    public static void metodo1() {

        System.out.println("Agora vou chamar o metodo 2");
        metodo2();
        
    }

    public static void metodo2() {

        System.out.println("Agora voltar ao inicio, e imprimir final");
    
    }
}
