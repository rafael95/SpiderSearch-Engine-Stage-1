/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Clase para obtener palabras de un texto
 * @author rafael
 */
public class Filtroparatexto {

    private String filtro1;
    /**
 *Metodo para obtener palabras de un texto
 * @author rafael
 *  @param texto 
 */

    public void Filtroparatexto(String texto) {

        Pattern pattern = Pattern.compile(">(.*?)<");
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            filtro1 = filtro1 + matcher.group();
        }

        Pattern p = Pattern.compile(" [a-zA-ZóíñÑ]{4,30}+");
        Matcher m = p.matcher(filtro1);
        while (m.find()) {
          //  System.out.println(m.group());
        }

    }

}
