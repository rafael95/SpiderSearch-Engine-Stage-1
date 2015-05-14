package prueba2spider;
/**
 *clase en la se colocan el tipo de dato que se encuenta en el nodo
 * @author anderson,rafael
 * *@param Dato
 * *@param Next
 * *@param Prev
 */
public class NodoDE {
   String Dato;
   NodoDE Next;
   NodoDE Prev;
    NodoDE(String Dato,NodoDE Next,NodoDE Prev){
        Dato=this.Dato;
        Prev=this.Prev;
        Next=this.Next;
}

    NodoDE() {
        
    }

   
}