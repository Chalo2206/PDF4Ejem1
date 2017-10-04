package pdf4ejem1;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Gonzalo
 */
public class PDF4Ejem1 {

    public static void main(String[] args) {
        Collection listaMarCoches = new ArrayList<String>();
        
        listaMarCoches.add("Audi");
        listaMarCoches.add("Porche");
        listaMarCoches.add("Aston Martin");
        listaMarCoches.add("Ferrari");
        listaMarCoches.add("Mercedes");
        listaMarCoches.add("Seat");
        
        System.out.println("Numero elementosantes de eliminar : "+listaMarCoches.size());
        
        System.out.println(listaMarCoches.toString());
        
        listaMarCoches.remove("Seat");
        listaMarCoches.remove("Mercedes");
        
        System.out.println("numero elementos despues de eliminar Seat y Mercedes : " +listaMarCoches.size());
        
        System.out.println(listaMarCoches.toString());

    }
    
}
