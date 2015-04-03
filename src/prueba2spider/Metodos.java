/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;
/**
 *Clase Para modificar la cola 
 * @author rafael
 */

public class Metodos extends Nodo{
    
    Nodo sig,frente,ultimo;
    private  String dato;
    
    Metodos(String x,Nodo enlace){
        super( x,enlace);
        frente=ultimo=null;
        dato="";
    }

    /**
 *Clase Para modificar la cola 
 * @author rafael
 */
    void InsertarNodo(String x){
        Nodo nuevo;
        if(frente==null){
            nuevo=new Nodo(x,null);
            frente=ultimo=nuevo;
        }else{
            nuevo=new Nodo(x,null);
            ultimo.sig=nuevo;
            ultimo=nuevo;
            
        }
    }
    /**
 *Metodo que elimina el primer valor de la cola
 * @author rafael
 */
    void SacarNodo(){
        frente=frente.sig;
    }
    /**
 *Metodo que muestra el primer valor de la cola
 * @author rafael
 */
     void  MostrarNodo(){
          Nodo aux=frente;
         System.out.println(aux.dato);
    }
     /**
 *Metodo que imprime la cola
 * @author rafael
 */
    
    void ImprimirNodo(){
        Nodo aux=frente;
        String salir="";
        while(aux!=null){
            salir+=aux.dato+",";
            aux=aux.sig;
        }
        System.out.println("Nodos :"+salir);
    }
}
