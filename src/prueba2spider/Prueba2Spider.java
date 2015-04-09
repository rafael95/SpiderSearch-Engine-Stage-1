/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;
import java.io.IOException;
import jdk.nashorn.internal.objects.Global;
/**
 * Clase de ejecucion del programa y instanciacion de los objetos
 * @author  rafael, anderson
 */
public class Prueba2Spider {

    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
         Metodos lo=new Metodos(null,null,0);
         Lecturaxmlparaurls hola = new Lecturaxmlparaurls(null,null,0);
         hola.Lecturaxmlparaurls("archivos_a_procesar.xml",lo,null,null);
         Lecturaxml Leer = new Lecturaxml();
       
         ListaCD listaurl=new ListaCD(null,null,null);
         Lecturaweb Leer1 = new Lecturaweb();
        int i=0;
       
        
     
       while (lo.MostrarNodo()!=null& i!=15){
         
         String red =  lo.MostrarNodo();
         lo.SacarNodo();
         Leer1.Lecturaweb(red,lo,listaurl);
         i=i+1;
            
        }
         lo.MostrarNodo();
         lo.ImprimirNodo();
         listaurl.mostrar();
           
        
           
           
    
 
    
   
    }
}
