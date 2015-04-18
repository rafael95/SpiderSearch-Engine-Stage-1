package prueba2spider;
/**
 *
 * @author anderson
 */
public class ListaDE  extends NodoDE{
    NodoDE head;
   NodoDE tail;
    public ListaDE(String Dato,NodoDE Next,NodoDE Prev){
        super( Dato=null, Next=null,Prev=null);
        head=null;
        tail=null;
    }

    ListaDE() {
    }
    public void insertHead(String x){
        NodoDE temp=new NodoDE(x,null,null);
        temp.Dato=x;
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.Next=head;
            head.Prev=temp;
            head=temp;
        }
    }
    public void insertTail(String x){
        NodoDE temp=new NodoDE(x,null,null);
        temp.Dato=x;
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            tail.Next=temp;
            temp.Prev=tail;
            tail=temp;
        }
    }
    public void BorrarHead(){
        head=head.Next;
        head.Prev=null;
    }
    public void BorrarTail(){
        if(tail.Prev==null){
            head=null;
            tail=null;
        }else{
            tail=tail.Prev;
            tail.Next=null;
        }
    }
    
    public void buscarNodo(String Dato){
        NodoDE actual=new NodoDE(Dato,null,null);
        actual=tail;
        boolean encontrado=false;
        do{
            if(actual.Dato==Dato){
                encontrado=true;
            }
            actual=actual.Prev;
        }while(actual!=null);
        if(encontrado==true){
            System.out.println("Nodo encontrado");
        }else{
            System.out.println("Nodo no encontrado");
        }
 
   }
 public String mostrardesdeHead(){
        NodoDE actual=new NodoDE();
        actual=head;
        String respuesta="";
        if(actual==null){
            return null;
        }
        do{
            respuesta= respuesta+actual.Dato;
            actual=actual.Next;
           
            
        }
      
        while(actual!=null);
           return(respuesta);
    }

public void mostrardesdeTail(){
        NodoDE actual=new NodoDE();
        actual=tail;
        
        do{
            System.out.println(actual.Dato);
            actual=actual.Prev;
        }
        while(actual!=null);
    }
}

