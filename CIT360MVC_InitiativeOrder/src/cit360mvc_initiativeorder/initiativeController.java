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
public class initiativeController {
    
    private initiativeModel model;
    private initiativeView view;
    
    public initiativeController(initiativeModel model, initiativeView view){
        
        this.model = model;
        this.view = view;
        
    }
    
    public void setCharacterName(String characterName) {
        model.setCharacterName(characterName);
    }
    
    public String getCharacterName() {
        return model.getCharacterName();
    }
    
    public void setCharacterInit(int characterInit) {
        model.setCharacterInit(characterInit);
    }
    
    public int getCharacterInit() {
        return model.getCharacterInit();
    }
   
    
    public void updateView() {
        view.characterInfo(model.getCharacterName(), model.getCharacterInit());
    }
}
