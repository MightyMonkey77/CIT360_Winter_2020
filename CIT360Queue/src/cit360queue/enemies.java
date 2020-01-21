/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360queue;

import java.util.logging.Logger;

/**
 *
 * @author azhra
 */
class enemies {
    
    public static final enemies roughnut = new enemies("Roughnut",1,"Guard");
    public static final enemies harlequin = new enemies("Harlequin",2,"Guard ");
    public static final enemies reginald = new enemies("Reginald",3,"Shaman");
    public static final enemies sunny = new enemies("Sunny",4,"Babarian");
    
    private final String name;
    private final int enemyId;
    private final String eClass;

    public enemies(String name, int enemyId, String eClass) {
        this.name = name;
        this.enemyId = enemyId;
        this.eClass = eClass; 
    }

      public String getName() {
        return name;
    }

    public int getEnemyId() {
        return enemyId;
    }

    public String geteClass() {
        return eClass;
    }

    @Override
    public String toString() {
        return "enemies{" + "name=" + name + ", enemyId=" + enemyId + ", eClass=" + eClass + '}';
    }

    public void reply(final String message) {
        System.out.printf(name, message);
    }
    
    
    
    
}
