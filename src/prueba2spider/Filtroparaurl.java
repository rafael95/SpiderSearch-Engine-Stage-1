/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rafael
 */
public class Filtroparaurl extends Metodos{
   
    private String texto, texto1 = "", texto2 = "", texto3 = "", texto4 = "", texto5 = "",red1="";
    public Filtroparaurl(String x,Nodo enlace){
        super(x,enlace);
       
    }
   
    public void Filtroparaurl (String texto,String red,Metodos lo) {
        Metodos lo1=lo;
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

        Pattern pattern4 = Pattern.compile(" (.*?) ");
        Matcher matcher4 = pattern4.matcher(texto4);
        while (matcher4.find()) {
            texto5 = texto5 + matcher4.group();
        }
        
        
        Pattern p = Pattern.compile(" [a-zA-ZóíñÑ0-9%$><@!*#()||{}|\\&.,=?/:;'_-]{17,}+");
        Matcher m = p.matcher(texto5);
        while (m.find()) {
            lo1.InsertarNodo(m.group());
            
        }
       
    }
}
