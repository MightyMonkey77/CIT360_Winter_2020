/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecutablesRunnables;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author azhra
 */
public class Counter {
    
    private AtomicInteger value = new AtomicInteger();
 
    public void increment() {
        value.incrementAndGet();
    }
 
    public void decrement() {
        value.decrementAndGet();
    }
 
    public int get() {
        return value.get();
    }
}
