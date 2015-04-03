package prueba2spider;

public class Nodo {
    Nodo sig;
    String dato;
   
    
    Nodo(String x,Nodo enlace){
        sig=enlace;
        dato=x;
    }
}
