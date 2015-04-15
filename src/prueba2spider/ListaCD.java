package prueba2spider;
/**
 *Clase en  la que se utiliza la lista circular dble
 * @author anderson, anderson
 *  * @param tail
 *  * @param head
 */
public class ListaCD  extends NodoCD{
    NodoCD head;
    NodoCD tail;
    ListaCD(String Dato,NodoCD Prev,NodoCD Next){
        super(Dato,Prev=null,Next=null);
        head=null;
        tail=null;  
        Dato=null;
       
    }
   /**
 *inserta el dato en el inicio de la lista circular doble
 * @author anderson, anderson
 * *@param Dato
 */
    public void insertHead(String Dato){
        
       NodoCD nuevo=new NodoCD(Dato,null,null);
       
        nuevo.Dato=Dato;
        if(head==null){
            head=nuevo;
            
            head.Next=head;
            nuevo.Prev=tail;
            tail=nuevo;
        }
        else{
            tail.Next=nuevo;
            nuevo.Next=head;
            nuevo.Prev=tail;
            tail=nuevo;
            head.Prev=tail;
        }
    }
    /**
 *Busca el dato dado y envia un string si el dato es encontrado o no 
 * @author anderson, anderson
 * *@param Dato
 */
    public void buscarNodo(String Dato){
        NodoCD actual=new NodoCD(Dato,null,null);
        actual=tail;
        boolean encontrado=false;
        do{
            if(actual.Dato==Dato){
                encontrado=true;
            }
            actual=actual.Prev;
        }while(actual!=tail);
        if(encontrado==true){
            System.out.println("Nodo encontrado");
        }else{
            System.out.println("Nodo no encontrado");
        }
    }
    /**
 *Muestra el contenido de la lista doble enlazada
 * @author anderson, anderson
 */
    public void mostrar(){
        NodoCD actual=new NodoCD(null,null,null);
        actual=head;
        do{
            System.out.println(actual.Dato);
            actual=actual.Next;
        }
        while(actual!=head);
    }
}
