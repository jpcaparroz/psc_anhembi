package ExemploAluno;

public class App {
    public static void main(String[] args) {
        
        IdCard card = new IdCard(2021, 121212, 3744222, "Anhembi Morumbi", "SI");
        Aluno aluno = new Aluno("Joao", 22, card);

        System.out.println(aluno.getCard().getUniversidade());
    }
    
}
