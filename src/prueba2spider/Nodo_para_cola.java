package prueba2spider;
/**
 *Clase crea nodoy se crea los atributos que se llevaran en el nodo
 * @author rafael, anderson
 * *@param x
 * *@param enlace
 * *@param posicion1
 * 
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
