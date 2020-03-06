/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360acp;

import java.util.ArrayList;

/**
 *
 * @author azhra
 */
public class handlerGetCharacter implements handler{
    
    @Override
    public void handleIt(Object data) {
        String charFirstName = (String)data;
        
        ArrayList list = group.getCharacterList();
        boolean hasChar = false;
        
        for(int i = 0; i < list.size(); i++) {
            character Char = (character)list.get(i);
            
            if(charFirstName.equals(Char.getCharFirstName())) {
                System.out.println("Character Name: "+ Char.getCharFirstName());
                System.out.println("Initiative: " + Char.getCharInitiative());
                hasChar = true;
            }
        }
        
        if(!hasChar) {
            System.out.println("No character found.");
        }
    }
    
}
