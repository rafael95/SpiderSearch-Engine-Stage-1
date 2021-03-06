/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;
/**
 *Clase Para modificar la cola 
 * @author rafael, anderson
 */

public class Cola extends Nodo_para_cola{
    Nodo_para_cola 
            sig, frente,ultimo;
    
  
    private  String dato;
    private  int pos;
    
    Cola(String x,Nodo_para_cola enlace,int posicion1){
        super( x,enlace,posicion1);
        frente=ultimo=null;
        dato="";
        pos=0;
    }

    /**
 *Clase Para modificar la cola 
 * @author rafael, anderson
 * *@param x
 * *@param posicion1
 */
    void InsertarNodo(String x,int posicion1){
        Nodo_para_cola nuevo;
        if(frente==null){
            nuevo=new Nodo_para_cola(x,null,posicion1);
            frente=ultimo=nuevo;
        }else{
            nuevo=new Nodo_para_cola(x,null,posicion1);
            ultimo.sig=nuevo;
            ultimo=nuevo;
            
        }
    }
    /**
 *Metodo que elimina el primer valor de la cola
 * @author rafael, anderson
 */
    void SacarNodo(){
        frente=frente.sig;
    }
    /**
 *Metodo que muestra el primer valor de la cola
 * @author rafael, anderson
 */
     String  MostrarNodo(){
            Nodo_para_cola aux=frente;
           if(aux==null){
            return null;
           }
       
          
         return (aux.dato);
    }
     
     
      int  Mostrarasociado(){
          Nodo_para_cola aux=frente;
          if(aux==null){
              return 100;
          }
         return (aux.posicion);
    }
     /**
 *Metodo que imprime la cola
 * @author rafael     /**
 *Metodo que imprime la cola
 * @author rafael, anderson
 */
    
    String ImprimirNodo(){
        Nodo_para_cola aux=frente;
        String salir="";
        if (aux==null){
            return null;
        }
        while(aux!=null){
            salir+=aux.dato+""+(aux.posicion)+",";
            aux=aux.sig;
        }
        return("Nodos :"+salir);
    }
}
