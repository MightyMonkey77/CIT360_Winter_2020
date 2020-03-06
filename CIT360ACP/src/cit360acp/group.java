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
public class group {
    
    private static ArrayList<character> characterList = new ArrayList<character>();
    
    public static ArrayList<character> getCharacterList() {
        return characterList;
    }
    
    public static void addCharacter(character Char){
        characterList.add(Char);
    }
    
    public static void setCharacterList(ArrayList<character> characterList) {
        characterList = characterList;
    }
}
