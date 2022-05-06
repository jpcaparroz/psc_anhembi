package ExemploPessoa;

public class AppPessoa {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Joao", "sdajasi", "hsadauhs");
        Estudante e = new Estudante("Carlos", "sdajasi", "hsadauhs", 123);
        EstudantePos ep = new EstudantePos("Carlos", "sdajasi", "hsadauhs", 123, "charles");

        System.out.println(e);
        System.out.println(p);
        System.out.println(ep);

    }
    
}
