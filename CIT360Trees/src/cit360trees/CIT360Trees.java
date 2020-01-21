/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360trees;


import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author azhra
 */
public class CIT360Trees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Using the Set works lets do a tree which should be sorted.
        
        Set<String> buffs = new TreeSet<>();
            buffs.add("Plus Strength");
            buffs.add("Plus Dexterity");
            // If the set collection works it should auto remove this same line since each must be unique
            buffs.add("Plus Dexterity");
            buffs.add("Plus Constitution");
            buffs.add("Plus Wisdom");
            buffs.add("Plus Intelegence");
            buffs.add("Plus Charisma");
            
            //Print it out to see in alphabetical order
            for(String Buffs: buffs){
                System.out.println(Buffs + " ");
            }
            
        //Declare second set
        Set<String> deBuffs = new TreeSet<>();
            deBuffs.add("Minus Strength");
            deBuffs.add("Minus Dexterity");
            deBuffs.add("Minus Constitution");
            deBuffs.add("Minus Wisdom");
            deBuffs.add("Minus Intelligence");
            deBuffs.add("Minus Charisma");
            
            //Print it out see it in alphabetical order
            for(String DeBuffs: deBuffs) {
                System.out.println(DeBuffs + " ");
            }
    }
    
}
