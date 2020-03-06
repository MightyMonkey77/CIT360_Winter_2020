/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360acp;

import java.util.HashMap;

/**
 *
 * @author azhra
 */
public class handlerAddCharacter implements handler{
    
    @Override
    public void handleIt(Object data) {
        HashMap<String,String> map = (HashMap)data;
        String charFirstName = map.get("charFirstName");
        String charInitiative = map.get("charInitiative");
               
        character Char = new character(charFirstName, charInitiative); 
        group.addCharacter(Char);
        System.out.println(charFirstName + " " + charInitiative + " has been added.");
    }
}
