/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;
import java.io.IOException;
import jdk.nashorn.internal.objects.Global;
/**
 *
 * @author rafael
 */
public class Prueba2Spider {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Metodos lo=new Metodos(null,null);
        Metodos lo1 =lo;
           String red = "google.com";
           Lecturaxmlparaurls hola = new Lecturaxmlparaurls(null,null);
           Lecturaweb Leer1 = new Lecturaweb();
          
          hola.Lecturaxmlparaurls("archivos_a_procesar.xml",lo1,null,null);
          Leer1.Lecturaweb(red,lo1);
           lo.ImprimirNodo();
           lo.MostrarNodo();
           
          
           
           
    }
 
    
   
    
}
