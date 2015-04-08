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
        ListaCD listaurl=new ListaCD(null,null,null);
      
        
           String red = "google.com";
           Lecturaxmlparaurls hola = new Lecturaxmlparaurls(null,null,0);
           Lecturaweb Leer1 = new Lecturaweb();
          
          hola.Lecturaxmlparaurls("archivos_a_procesar.xml",lo,null,null);
          Leer1.Lecturaweb(red,lo,listaurl);
           lo.ImprimirNodo();
           lo.MostrarNodo();
          listaurl.mostrar();
           
          
           
           
    }
 
    
   
    
}
