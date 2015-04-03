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
 *
 * @author rafael
 */
public class Lecturaxmlparaurls extends Metodos {

    String xmlFile;

    public Lecturaxmlparaurls(String x, Nodo enlace) {
        super(x=null, enlace=null);
    }
    
    public void Lecturaxmlparaurls(String xmlFile, Metodos lo,String x,Nodo enlace) {
      
        Metodos lo1 =lo;
        SAXBuilder builder = new SAXBuilder();

        try {
         
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            List list = rootNode.getChildren();

            for (int i = 0; i < list.size(); i++) {

                Element node = (Element) list.get(i);
              
                lo1.InsertarNodo(node.getValue());

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
