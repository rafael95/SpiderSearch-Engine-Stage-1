/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import static prueba2spider.IConstantes.REGEX_HIPER_PATTER;

/**
 * Lee los parametros del xml para poder inicializar las listas
 *
 * @author rafael, anderson
 * *@param xmlFile
 * *@param lo
 * *@param Listaurl
 * *@param Leer1
 */
public class Lecturaxml {

    int a = 0;
    String xmlFile,p;
    int maxthreads = 0, recursivity = 0, reindex = 0, contador = 1;

    public void Lecturaxml(String xmlFile, Cola lo, ListaCD listaurl, Lecturaweb Leer1, ListaDE listadoble) throws JDOMException, IOException {

        SAXBuilder builder = new SAXBuilder();
p=REGEX_HIPER_PATTER;
        Document document = (Document) builder.build(xmlFile);
        Element rootNode = document.getRootElement();
        List list = rootNode.getChildren();
        String configuracion[] = new String[3];

        for (int e = 0; e < list.size(); e++) {

            Element node = (Element) list.get(e);

            String configuracio = node.getValue();
            configuracion[e] = configuracio;

        }
        a = lo.Mostrarasociado();
        lo.MostrarNodo();
        String red = lo.MostrarNodo();
        lo.SacarNodo();
        Leer1.Lecturaweb(red, lo, listaurl, listadoble, a);
        maxthreads = Integer.parseInt(configuracion[0]);
        recursivity = Integer.parseInt(configuracion[1]);
        reindex = Integer.parseInt(configuracion[2]);
        lo.MostrarNodo();
        final CyclicBarrier barreraInicio = new CyclicBarrier(maxthreads + contador);
        final CyclicBarrier barreraFin = new CyclicBarrier(maxthreads + contador);

        for (int i = 0; i < maxthreads; i++) {
            Thread hilo = new Thread("h" + i) {
                @Override
                public void run() {

                    try {
                        barreraInicio.await();
                        while (lo.Mostrarasociado() <= recursivity) {

                            System.out.println(lo.MostrarNodo());

                            if (lo.MostrarNodo() != null) {
                                System.out.println(this.getName() + lo.Mostrarasociado());
                                a = lo.Mostrarasociado();
                                lo.MostrarNodo();
                                String red = lo.MostrarNodo();
                                lo.SacarNodo();
                                Leer1.Lecturaweb(red, lo, listaurl, listadoble, a);

                            }

                        }

                        barreraFin.await();

                    } catch (InterruptedException | BrokenBarrierException e) {
                    }
                }
            };
            hilo.start();

        }

        try {

            barreraInicio.await();
            barreraFin.await();

        } catch (InterruptedException | BrokenBarrierException e) {
        }

        System.out.println(lo.ImprimirNodo());

        System.out.println(listaurl.mostrar());
        System.out.println(listadoble.mostrardesdeHead());

    }
}
