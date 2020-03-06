/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360acp;

import java.util.Objects;

/**
 *
 * @author azhra
 */
public class character {
    
    private String charFirstName;
    private String charInitiative;

    public character(String charFirstName, String charInitiative) {
        this.charFirstName = charFirstName;
        this.charInitiative = charInitiative;
    }

    public String getCharFirstName() {
        return charFirstName;
    }

    public void setCharFirstName(String charFirstName) {
        this.charFirstName = charFirstName;
    }

    public String getCharInitiative() {
        return charInitiative;
    }

    public void setCharInitiative(String charInitiative) {
        this.charInitiative = charInitiative;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.charFirstName);
        hash = 37 * hash + Objects.hashCode(this.charInitiative);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final character other = (character) obj;
        if (!Objects.equals(this.charFirstName, other.charFirstName)) {
            return false;
        }
        if (!Objects.equals(this.charInitiative, other.charInitiative)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "character{" + "charFirstName=" + charFirstName + ", charInitiative=" + charInitiative + '}';
    }
    
    
    
}
  