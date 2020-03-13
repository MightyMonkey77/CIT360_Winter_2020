/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecutablesRunnables;

/**
 *
 * @author azhra
 */
public class UpdateThread extends Thread{
    
     private Counter counter;
 
    public UpdateThread(Counter counter) {
        this.counter = counter;
    }
 
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) { ex.printStackTrace(); }
 
        counter.increment();
    }
}
