/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *Lee los parametros del xml para poder inicializar las listas
 * @author rafael, anderson
 * *@param xmlFile
 * *@param lo
 * *@param Listaurl
 * *@param Leer1
 */
public class Lecturaxml {

    String xmlFile;
    int maxthreads=0,recursivity=0,reindex=0,contador=1;
    

    public void Lecturaxml(String xmlFile,Cola lo,ListaCD listaurl, Lecturaweb Leer1,ListaDE listadoble) {

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
         //  int rodas=0;
          
         // while(rodas<=maxthreads){
          // TrabajarHilos numeppp1=new TrabajarHilos("N"+rodas) {
             //  @Override
               
             //   public  void run() {
                     
                   
             ///     int i = 0;
             //      while (i< recursivity){
             //          synchronized(lo){
            //              if(lo.MostrarNodo()==null){
             //             }
             //                 try {
             //                     lo.wait();
            //                  } catch (InterruptedException ex) {
            //                      Logger.getLogger(Lecturaxml.class.getName()).log(Level.SEVERE, null, ex);
            //                  }
            //              }
          //            
          //           String red =  lo.MostrarNodo();
          //      lo.SacarNodo();
          //       Leer1.Lecturaweb(red,lo,listaurl);
          //         i=i+1;
           //        }
                   
                   
          //      }
             
          
         
            
         //  };rodas=rodas+1;  
                   
                
           
                   
                  
      //  }
        
        } catch (IOException | JDOMException io) {
            System.out.println("hola");
            System.out.println(io.getMessage());
        }
        
        
        }  
    }

