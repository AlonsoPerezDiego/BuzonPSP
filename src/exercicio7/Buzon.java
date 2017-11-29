/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class Buzon{
    
    private String correo = "";

    public Buzon() {
    }

    public synchronized void escribe(boolean escribir){
        if(escribir){
            while(correo.length()>0){
                try {
                    System.out.println("Ya existe un mensaje...\nEsperando a que sea leido...\n");
                    sleep(1000);
                    wait();
                    System.out.println("Escrito tras ser enviado el anterior.\n");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Fios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            correo = "Hola";
            System.out.println("Mensaje escrito\n");
            notifyAll();
                
            
        }else{
            while(correo.length()==0){
                try {
                    System.out.println("No hay mensaje...\nEsperando por un mensaje...\n");
                    sleep(1000);
                    wait();
                    System.out.println("Mensaje recibido.\n");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Fios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            mostrarCorreo();
            System.out.println("Mensaje enviado\n");
            correo = "";
            notifyAll();
        }
    }
    
    public void mostrarCorreo(){
        System.out.println(correo + "\n");
    }
}
