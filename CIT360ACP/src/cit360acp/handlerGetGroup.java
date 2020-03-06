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
public class handlerGetGroup implements handler {
    
    @Override
    public void handleIt(Object data) {
        
        ArrayList list = group.getCharacterList();
        System.out.println("The adventuring team is: ");
        for(int i = 0; i < list.size(); i++) {
            character Char = (character)list.get(i);
            int index = i + 1;
            System.out.println(index + " " + Char.getCharFirstName());
                    
        }
        
    }
}
