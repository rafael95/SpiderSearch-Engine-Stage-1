/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Clase que obtiene las urls de la pagina web
 * @author rafael, anderson
 */
public class Filtroparaurl {
   
    private String texto, texto1 = "", texto2 = "", texto3 = "", texto7 = "", texto4 = "", texto5 = "", texto6 = "",red1="";
    
    /**
 *Metodo que obtiene las urls de la pagina web
 * @author rafael, anderson
* * @param texto
* * @param red
* * @param lo
* * @param listaurl
* 
 */

    
   
    public void Filtroparaurl (String texto,String red,Cola lo,ListaCD listaurl,int a) {
       
        Pattern patterntex = Pattern.compile("/[/a-zA-ZóíñÑ0-9%$><@!*#()||{}|\\&.,=?/:;'_-]+");
        Matcher matchertex = patterntex.matcher(red+"/");
      
            red1 = red1 + matchertex.replaceAll("/");
        
        
        Pattern pattern = Pattern.compile("\"/(.*?)[a-zA-Z0-9]\"+");
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            texto1 = texto1 + matcher.group();
        }
        Pattern pattern1 = Pattern.compile("\"//");
        Matcher matcher1 = pattern1.matcher(texto1);
        texto2 = texto2 + matcher1.replaceAll("\"");

        
        Pattern pattern2 = Pattern.compile("\"/");
        Matcher matcher2 = pattern2.matcher(texto2);
        texto3 = texto3 + matcher2.replaceAll("\"" + red1 );

        
        Pattern pattern3 = Pattern.compile("\"");
        Matcher matcher3 = pattern3.matcher(texto3);
        texto4 = texto4 + matcher3.replaceAll(" ");
        
        Pattern pattern5 = Pattern.compile(">(.*?)<");
        Matcher matcher5 = pattern5.matcher(texto4);
        texto5 = texto5 + matcher5.replaceAll(" "); 
        
        Pattern pattern6 = Pattern.compile("//(.*?) ");
        Matcher matcher6= pattern6.matcher(texto5);
        texto7 = texto7 + matcher6.replaceAll(" ");
        
        
        Pattern pattern4 = Pattern.compile(" (.*?) ");
        Matcher matcher4 = pattern4.matcher(texto7);
        while (matcher4.find()) {
            texto6 = texto6 + matcher4.group();
            
        }
        
        
        Pattern p = Pattern.compile("[a-zA-ZóíñÑ0-9%$><@!*#()||{}|\\&.,=?/:;'_-]{35,}+");
        Matcher m = p.matcher(texto6);
        while (m.find()) {
       //synchronized(lo){
          lo.InsertarNodo(m.group(),a+1);
        
          //lo.notifyAll();
       //}
        }
        
          /**
 *Metodo que obtiene las urls de la pagina web
 * @author rafael, anderson
 se inseta la url en la lista
 */

        listaurl.insertHead(red);
       
    }
}
