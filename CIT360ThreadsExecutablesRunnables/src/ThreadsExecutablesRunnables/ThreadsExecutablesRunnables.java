/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecutablesRunnables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author azhra
 */

public interface ThreadsExecutablesRunnables {
    
    class startThread extends Thread {
    @Override
    public void run() {
        System.out.println("Here we will run a couple of threads.");
    }
}

    // implementing runnables will make this line react to each "Runnable" made thread.
class startRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("This printout should show for each Runnable. YOUR DOOM IS HERE!");
    }
}


public class Collections_Threads_Executors_Runnables {

    /**
     * @param args the command line arguments
     */
    

    // Here will be the hard code for the threads to be run and go through the cycle of running them and executing them.
    public static void main(String[] args) {
        
        System.out.println("This should hopefully start first.  Welcome to you nightmare!");
        
        // In these threads we will find the thread creation and the accompanying runnable that controls each.
        startThread DMAwoken = new startThread();
        DMAwoken.start();
        
        Thread playerRevenge = new Thread(new startRunnable());
        playerRevenge.start();
        
        Thread goblinsAttack = new Thread(new startRunnable());
        goblinsAttack.start();
        
        Thread takeYourInitiatives = new Thread(new startRunnable());
        takeYourInitiatives.start();
        
        Thread endEncounter = new Thread(new startRunnable());
        endEncounter.start();
                        
        // Never used a sleep timer in jaa before might be fun to try.
        try {
            Thread.sleep(3000);
            System.out.println("Pause for dramatic effect!");
        } catch (InterruptedException e) {
            System.out.println("Exception works " + e);
        }
           
        // Execute the thread
        ExecutorService exe = Executors.newSingleThreadExecutor();
        exe.submit(() -> {
        String threadName = Thread.currentThread().getName();
        System.out.println("Pool name and thread" + threadName);
        });


        try {
            System.out.println("Now we need to close this from running");
            exe.shutdown();
            exe.awaitTermination(10, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("Uh-oh! Failiure");
        }
        finally {
            if (!exe.isTerminated()) {
                System.err.println("Did it work?");
            }
            exe.shutdownNow();
            System.out.println("Hurray it is done.....Or is it? Muwahahahahahahahaha!!!");
        }
        
    }
    
}
}
