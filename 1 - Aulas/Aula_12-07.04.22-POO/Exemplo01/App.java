package Exemplo01;

public class App {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();

        p.setNome("Joao");
        p.setIdade(22);
        p.setAltura(1.75);

        System.out.println("Dados da Pessoa");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Alura: " + p.getAltura());
    }
    
}
