/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class t2 extends Thread {
     
    private int num = 1;
    
    public void run(){
        while(num<6){
            try {
                System.out.println(num++);
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(t2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
