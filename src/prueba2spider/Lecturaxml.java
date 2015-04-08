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
public class Lecturaxml {

    String xmlFile;
    int maxthreads=0,recursivity=0,reindex=0,contador=1;
    

    public void Lecturaxml(String xmlFile) {

        SAXBuilder builder = new SAXBuilder();

        try {

            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            List list = rootNode.getChildren();
            String configuracion[]=new String[3];

            for (int i = 0; i < list.size(); i++) {

                Element node = (Element) list.get(i);

                String configuracio= node.getValue();
                configuracion[i]=configuracio;

            }
           maxthreads= Integer.parseInt(configuracion[0]);
           recursivity=Integer.parseInt(configuracion[1]);
           reindex=Integer.parseInt(configuracion[2]);
           while(contador<=maxthreads){
            TrabajarHilos numero=new TrabajarHilos("N"+contador);
            contador=contador+1;
         
            
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
