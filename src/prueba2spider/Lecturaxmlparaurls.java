/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;

import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *Clase para leer la informacion de los urls de un archivo xml
 * @author rafael, anderson
 */
public class Lecturaxmlparaurls  {

    String xmlFile;
    
 /**
 *Metodo para leer la informacion de los urls de un archivo xml
 * @author rafael,anderson
 * *@param xmlFile
 * *@param lo
 * *@param x
 * *@param enlace
 */

   
    public void Lecturaxmlparaurls(String xmlFile, Cola lo,String x,Nodo_para_cola enlace) {
      
       
        SAXBuilder builder = new SAXBuilder();

        try {
         
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            List list = rootNode.getChildren();

            for (int i = 0; i < list.size(); i++) {

                Element node = (Element) list.get(i);
              
                lo.InsertarNodo(node.getValue(),0);

            }
          
        } catch (IOException io) {
            System.out.println("hola");
            System.out.println(io.getMessage());
        } catch (JDOMException jdomex) {
            System.out.println("hola");
            System.out.println(jdomex.getMessage());
        }
     

    }

   
}
