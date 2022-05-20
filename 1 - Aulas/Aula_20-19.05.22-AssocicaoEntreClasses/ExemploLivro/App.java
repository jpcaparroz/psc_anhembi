package ExemploLivro;

public class App {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.livro.nome = "Hobbit";

        System.out.println(biblioteca.livro.nome);
    }
    
}
