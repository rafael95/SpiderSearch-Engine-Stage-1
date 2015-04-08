package prueba2spider;
/**
 *Clase crea nodo
 * @author rafael
 */
public class Nodo {
    Nodo sig;
    String dato;
   int posicion;
    
    Nodo(String x,Nodo enlace,int posicion1){
        sig=enlace;
        dato=x;
        posicion=posicion1;
    }
}
