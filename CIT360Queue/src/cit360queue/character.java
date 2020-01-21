/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360queue;

/**
 *
 * @author azhra
 */
class character {
    
    public static final character regnot = new character("Regnot",1,"Fighter");
    public static final character mintou = new character("Mintou",2,"Mage");
    public static final character serandipity = new character("Serandipity",3,"Cleric");
    public static final character lugop = new character("Lugop",4,"Rogue");

    private final String name;
    private final int charId;
    private final String cClass;
            
    public character(final String name, final int charId, final String cClass) {
        this.name = name;
        this.charId = charId;
        this.cClass = cClass;   
    }

    public String getName() {
        return name;
    }

    public int getCharId() {
        return charId;
    }

    public String getcClass() {
        return cClass;
    }
    
    

    @Override
    public String toString() {
        return "character{" + "name=" + name + ", charId=" + charId + ", cClass=" + cClass + '}';
    }

    public void reply(final String message) {
        System.out.printf(name, message);
    }
    
    
    
}
