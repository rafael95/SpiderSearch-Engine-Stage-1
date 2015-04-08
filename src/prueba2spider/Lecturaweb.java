/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import static org.apache.xalan.xsltc.compiler.util.Type.String;

/**
 *Clase que realiza la conexion para obtener la informacion de la pagina web
 * @author rafael
 */

public class Lecturaweb {
        
       private String texto;
 /**
 *Metodo que realiza la conexion para obtener la informacion de la pagina web
 * @author rafael
 */
    
    public void Lecturaweb(String urlweb,Metodos lo,ListaCD listaurl) {
        
        try {
         // Se abre la conexión
         URL url = new URL("http://"+ urlweb);
         URLConnection conexion = url.openConnection();
         conexion.connect();
         
         // Lectura
         InputStream is = conexion.getInputStream();
         BufferedReader br = new BufferedReader(new InputStreamReader(is));
         char[] buffer = new char[1000];
         
         int leido;
         while ((leido = br.read(buffer)) > 0) {
            texto=texto +(new String(buffer, 0, leido));
 
            
            }
         
         
       
      } catch (MalformedURLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
        
         Filtroparaurl text1= new Filtroparaurl(null,null,0);
         text1.Filtroparaurl(texto,urlweb,lo,listaurl);
           Filtroparatexto text2= new Filtroparatexto();
         text2.Filtroparatexto(texto);
     
      
      
         
         
  
        
    }
  

    }