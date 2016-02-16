/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Alex
 */
public class Ex1 {
    
    public static void main(String[] args) throws InterruptedException {
      t1 t1 = new t1();
      t1.start();
      t2 t2 = new t2();
      t2.start();
      t3 t3 = new t3();
      t3.start();
      Thread.sleep(10000);
      t3.stopThread();
    }  
}
