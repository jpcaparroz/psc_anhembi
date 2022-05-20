package ExercicioCachorro;
import java.util.ArrayList;

public class Petshop {

    ArrayList<Cachorro> lista = new ArrayList<>();
    
    public void adicionar(Cachorro dog) {

        lista.add(dog);
    }

    public void listar() {

        for (Cachorro cachorro : lista) {

            System.out.println(cachorro.toString());
        }
        
    }

    public void pesquisar(Cachorro dog) {
        
        lista.get(dog);
    }
    
}
