import java.util.ArrayList;
import java.util.Iterator;

//forEach vs Iterator
//Iterator permite modificar la lista mientras se la recorre, el forEach no.
//Por ejemplo, eliminar elementos de la lista durante la iteración.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        for (String nombre : nombres) {
        System.out.println(nombre + " con forEach");
        }
        
        // Crear un Iterator para la lista de nombres
        Iterator<String> iterator = nombres.iterator();
        
        // Usar el Iterator para recorrer la lista
        while (iterator.hasNext()) {
            String nombre = iterator.next();
            System.out.println(nombre + " con iterator");
        }
    }
}
