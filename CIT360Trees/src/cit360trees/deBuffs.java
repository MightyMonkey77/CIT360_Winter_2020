/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360sets;

/**
 *
 * @author azhra
 */
public class deBuffs {
    
    private final String name;
    private final String desc;
   

    public deBuffs(String name, String desc) {
        this.name = name;
        this.desc = desc;
        
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "deBuffs{" + "name=" + name + ", desc=" + desc + '}';
    }

    
}
