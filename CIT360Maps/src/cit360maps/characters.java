/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360maps;

/**
 *
 * @author azhra
 */
public class characters {
    
    public static final characters regnot = new characters("Regnot",1,"Fighter");
    public static final characters mintou = new characters("Mintou",2,"Mage");
    public static final characters serandipity = new characters("Serandipity",3,"Cleric");
    public static final characters lugop = new characters("Lugop",4,"Rogue");

    private final String name;
    private final int charId;
    private final String cClass;
            
    public characters(final String name, final int charId, final String cClass) {
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
        return "characters{" + "name=" + name + ", charId=" + charId + ", cClass=" + cClass + '}';
    }
    
    
}
