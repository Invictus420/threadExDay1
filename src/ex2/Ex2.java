/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Alex
 */
public class Ex2 {
    public static void main(String[] args) throws InterruptedException {
        Even Even = new Even();
        t1 t1 = new t1(Even);
        t1 t2 = new t1(Even);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
    }
}
