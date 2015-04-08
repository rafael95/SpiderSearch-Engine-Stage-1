package prueba2spider;
/**
 *
 * @author anderson
 */
public class ListaCD {
    NodoCD head;
    NodoCD tail;
    public ListaCD(){
        head=null;
        tail=null;                
    }
    public void insertHead(String x){
        NodoCD nuevo=new NodoCD();
        nuevo.Dato=x;
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
    public void buscarNodo(String x){
        NodoCD actual=new NodoCD();
        actual=tail;
        boolean encontrado=false;
        do{
            if(actual.Dato==x){
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
    public void mostrar(){
        NodoCD actual=new NodoCD();
        actual=head;
        do{
            System.out.println(actual.Dato);
            actual=actual.Next;
        }
        while(actual!=head);
    }
}
