/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;


public class Metodos extends Nodo{
    
    Nodo sig,frente,ultimo;
    private  String dato;
    
    Metodos(String x,Nodo enlace){
        super( x,enlace);
        frente=ultimo=null;
        dato="";
    }

    
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
    
    void SacarNodo(){
        frente=frente.sig;
    }
     void  MostrarNodo(){
          Nodo aux=frente;
         System.out.println(aux.dato);
    }
    
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
