// CREAR UN HASH SET DE STRING Y USAR UN FOREACH PARA RECORRER EL SET
package algo2sem7hashset1;

import java.util.HashSet;
import java.util.Set;


public class Algo2sem7hashset1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creas hashset
        Set<String> set = new HashSet<>();
        //adiciono elementos
        set.add("LIma");
        set.add("Puno");
        set.add("Cuzco");
        set.add("Huancayo");
        set.add("La Libertad");
        
        System.out.println(set);
        
        // mostrar elementos del hash set
        for(String s: set){
            System.out.print(s.toUpperCase()+" ");
        }     
    }
    
}
