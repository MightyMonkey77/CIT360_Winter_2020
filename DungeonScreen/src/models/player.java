/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author azhra
 */
public class player implements Serializable {
    
    private int playerId;
    private String playerName;
    private String playerClass;
           
   
    public player() {
            }
            
            public int getplayerId()  {
                return playerId;
            }
            
            public void setplayerId(int playerId) {
                this.playerId = playerId;
            }
    
            public String getplayerName() {
                return playerName;
            }
            
            public void setplayerName(String playerName) {
               this.playerName = playerName;
            }
            
            public String getplayerClass(){
                return playerClass;
            }
             
            public void setplayerClass(String playerClass) {
                this.playerClass = playerClass;
            }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.playerId;
        hash = 17 * hash + Objects.hashCode(this.playerName);
        hash = 17 * hash + Objects.hashCode(this.playerClass);
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
        final player other = (player) obj;
        if (this.playerId != other.playerId) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.playerClass, other.playerClass)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "player{" + "playerId=" + playerId + ", playerName=" + playerName + ", playerClass=" + playerClass + '}';
    }
            
        
        
            
            
    
}
