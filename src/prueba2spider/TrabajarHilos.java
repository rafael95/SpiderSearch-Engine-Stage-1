/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2spider;

/**
 *Clase que se utiliza para crear hilo
 * @author rafael
 */
public class TrabajarHilos implements Runnable {

    Thread t;
    String nombre;
    /**
 *Metodo que se utiliza para crear hilo
 * @author rafael
 */
    public TrabajarHilos (){
        
        t= new Thread(this,"hilo1");
        t.start();
       
    }
  
    public TrabajarHilos (String nombre){
        this.nombre=nombre;
        t= new Thread(this,"hilo1");
        t.start();
       
    }
    
   /**
 *Metodo que corre el hilo 
 * @author rafael
 */
    public void run() {
        try{
            for(int i=1;i<=5;i++){
                
                System.out.println(nombre+" "+i);
                Thread.sleep(500);
                
            }
            
            
        }catch(InterruptedException e){};

    
    }
    
}
