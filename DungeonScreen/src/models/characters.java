/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author azhra
 */
public class characters implements Serializable {
    
    private int characterId;
    private String characterName;
    private String characterRace;
    private final ArrayList<characterAttribute> characterAttribute = new ArrayList<>();
    private final ArrayList<characterAttributeBonuses> characterAttributeBonuses = new ArrayList<>();
    private int buffId;
    private int deBuffId;

  

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(String characterRace) {
        this.characterRace = characterRace;
    }

    public int getBuffId() {
        return buffId;
    }

    public void setBuffId(int buffId) {
        this.buffId = buffId;
    }

    public int getDeBuffId() {
        return deBuffId;
    }

    public void setDeBuffId(int deBuffId) {
        this.deBuffId = deBuffId;
    }

        
      @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.characterId;
        hash = 47 * hash + Objects.hashCode(this.characterName);
        hash = 47 * hash + Objects.hashCode(this.characterRace);
        hash = 47 * hash + Objects.hashCode(this.characterAttribute);
        hash = 47 * hash + Objects.hashCode(this.characterAttributeBonuses);
        hash = 47 * hash + this.buffId;
        hash = 47 * hash + this.deBuffId;
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
        final characters other = (characters) obj;
        if (this.characterId != other.characterId) {
            return false;
        }
        if (this.buffId != other.buffId) {
            return false;
        }
        if (this.deBuffId != other.deBuffId) {
            return false;
        }
        if (!Objects.equals(this.characterName, other.characterName)) {
            return false;
        }
        if (!Objects.equals(this.characterRace, other.characterRace)) {
            return false;
        }
        if (!Objects.equals(this.characterAttribute, other.characterAttribute)) {
            return false;
        }
        if (!Objects.equals(this.characterAttributeBonuses, other.characterAttributeBonuses)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "characters{" + "characterId=" + characterId + ", characterName=" + characterName + ", characterRace=" + characterRace + ", characterAttribute=" + characterAttribute + ", characterAttributeBonuses=" + characterAttributeBonuses + ", buffId=" + buffId + ", deBuffId=" + deBuffId + '}';
    }
    
        
    private static class characterAttribute {

        public characterAttribute() {
        }
    }

    private static class characterAttributeBonuses {

        public characterAttributeBonuses() {
        }
    }


    
}
