/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author azhra
 */
public class CIT360Queue {
    
    private final Queue<InitOrder> queue = new ArrayDeque<>();
    
    public void InitOrder(final character Character, final enemies Enemies, final modes Modes) {
        
        queue.offer(new InitOrder(Character, Enemies, Modes));
        
    }
    
    public void processAllModes() {
        
        while (!queue.isEmpty()) {
        final InitOrder initOrder = queue.remove();
        initOrder.getCharacter().reply( "You attack the monster");
        } 
        
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        CIT360Queue cit360Queue = new CIT360Queue();
        cit360Queue.InitOrder(character.regnot, enemies.reginald, modes.Attack);
        
        cit360Queue.processAllModes();
        
       
    }
    
    
}
