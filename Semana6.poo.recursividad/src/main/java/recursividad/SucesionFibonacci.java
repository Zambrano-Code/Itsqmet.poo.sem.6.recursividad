
package recursividad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geovanny Zambrano
 */
public class SucesionFibonacci {
    
    private ArrayList <Integer> Numero = new ArrayList();
    
    public SucesionFibonacci (int valorInicial){
       Numero.add(valorInicial);
    }
    
    public void recursividad() {
        int lenght = Numero.size();
        int indice1;
        int indice2;
        int nuevo;
        
        indice1 = Numero.get(lenght-1);        
        
        try{
            indice2 = Numero.get(lenght-2);
        }catch (Exception e){
            indice2 = 1;
        }
        
        nuevo = indice1 + indice2;
        Numero.add(nuevo); 
        if (lenght < 25) {
            recursividad();
        }
        
    }
    
    public void imprimir(){
        Numero.forEach(a -> System.out.print(a + "\t"));
    }
    
}
