package prueba2spider;
/**
 *Clase crea nodo
 * @author rafael
 */
public class Nodo_para_cola {
    Nodo_para_cola sig;
    String dato;
   int posicion;
    
    Nodo_para_cola(String x,Nodo_para_cola enlace,int posicion1){
        sig=enlace;
        dato=x;
        posicion=posicion1;
    }
}
