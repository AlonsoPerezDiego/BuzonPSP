/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class Fios extends Thread{
    private boolean escribir;
    private Buzon obj;

    public Fios(boolean escribir, Buzon obj, String name) {
        super(name);
        this.escribir = escribir;
        this.obj = obj;
    }
    
    
    public void run(){
        obj.escribe(escribir);
    }
    
}
