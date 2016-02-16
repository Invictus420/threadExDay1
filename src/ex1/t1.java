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
public class t1 extends Thread{
    
    private long sum = 0;
    
    @Override
    public void run(){
        for (long i = 1; i <= 1000000000; i++) {
            sum = sum +i;
        }
        System.out.println(sum);
    }
    
}
