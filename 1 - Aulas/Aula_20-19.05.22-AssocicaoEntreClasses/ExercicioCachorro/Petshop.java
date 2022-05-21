package ExercicioCachorro;
import java.text.BreakIterator;
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

    public void pesquisar(String raca) {
        
        for (int i = 0; i < lista.size(); i++) {
            
            if (lista.get(i).getRaca().equals(raca)) {
                System.out.println(lista.get(i).toString());
                System.out.println("*****************************************");
            }
        }
    }
    
}
