/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360mvc_initiativeorder;

/**
 *
 * @author azhra
 */
public class characters {
    
    private String characterName;
    private int characterInit;

    public characters(String characterName, int characterInit) {
        this.characterName = characterName;
        this.characterInit = characterInit;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterInit() {
        return characterInit;
    }

    public void setCharacterInit(int characterInit) {
        this.characterInit = characterInit;
    }
    
    
}
