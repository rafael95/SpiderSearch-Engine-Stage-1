/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;

/**
 *Clase para inicializar los hilos
 * @author rafael, anderson
 */
public abstract class TrabajarHilos implements Runnable {

    Thread t;
    String nombre;
    
    public TrabajarHilos (){
        
        t= new Thread(this,"hilo1");
        t.start();
       
    }
    /**
 *Metodo que iniciliza el thread
 * @author rafael, anderson
 * *@param nombre
 */
    public TrabajarHilos (String nombre){
        this.nombre=nombre;
        t= new Thread(this,"hilo1");
        t.start();
       
    }
    
    
   
            
            
       
}
