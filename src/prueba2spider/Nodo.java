package prueba2spider;
/**
 *Clase crea nodo
 * @author rafael
 */
public class Nodo {
    Nodo sig;
    String dato;
   
    
    Nodo(String x,Nodo enlace){
        sig=enlace;
        dato=x;
    }
}
