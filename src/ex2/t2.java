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
public class t2 extends Thread{
    
    private Even e;

    public t2(Even e) {
        this.e = e;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(e.next());
        }
    }
    
}