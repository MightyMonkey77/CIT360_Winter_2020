/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360sets;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author azhra
 */
public class CIT360Sets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // This is to show 2 sets of data.
        //Declare the Set must be unique and will be Unordered
        Set<String> buffs = new HashSet<>();
            buffs.add("Plus Strength");
            buffs.add("Plus Dexterity");
            // If the set collection works it should auto remove this same line since each must be unique
            buffs.add("Plus Dexterity");
            buffs.add("Plus Constitution");
            buffs.add("Plus Wisdom");
            buffs.add("Plus Intelegence");
            buffs.add("Plus Charisma");
            
            //Print it out to see
            for(String Buffs: buffs){
                System.out.println(Buffs + " ");
            }
            
        //Declare second set
        Set<String> deBuffs = new HashSet<>();
            deBuffs.add("Minus Strength");
            deBuffs.add("Minus Dexterity");
            deBuffs.add("Minus Constitution");
            deBuffs.add("Minus Wisdom");
            deBuffs.add("Minus Intelligence");
            deBuffs.add("Minus Charisma");
            
            //Print it out
            for(String DeBuffs: deBuffs) {
                System.out.println(DeBuffs + " ");
            }
   
     
    }
    
}
