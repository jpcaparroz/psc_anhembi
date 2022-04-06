package exemplo01;

public class AppPessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        p1.nome = "Joao";
        p1.idade = 22;
        p1.apresentar();

        p2.nome = "Pedro";
        p2.idade = 25;
        p2.apresentar();
    }
      
}
