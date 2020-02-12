/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author azhra
 */
public class buffs {
    
    private int buffId;
    private String description;
    private final ArrayList<buffBonuses> buffBonuses = new ArrayList<>();

    public int getBuffId() {
        return buffId;
    }

    public void setBuffId(int buffId) {
        this.buffId = buffId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.buffId;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.buffBonuses);
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
        final buffs other = (buffs) obj;
        if (this.buffId != other.buffId) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.buffBonuses, other.buffBonuses)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "buffs{" + "buffId=" + buffId + ", description=" + description + ", buffBonuses=" + buffBonuses + '}';
    }
    
    

    private static class buffBonuses {

        public buffBonuses() {
        }
    }
    
}
