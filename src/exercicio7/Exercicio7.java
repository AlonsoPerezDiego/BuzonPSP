/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon obj = new Buzon();
        
        Fios fio1 = new Fios(true, obj, "Escribir");
        fio1.start();
        Fios fio2 = new Fios(false, obj, "Enviar");
        fio2.start();
        Fios fio3 = new Fios(true, obj, "Escribir");
        fio3.start();
        Fios fio4 = new Fios(false, obj, "Enviar");
        fio4.start();
        
    }
    
}
