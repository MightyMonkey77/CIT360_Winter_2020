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
class InitOrder {
    
    private final character Character;
    private final enemies Enemies;
    private final modes Modes;

    public InitOrder(character Character, enemies Enemies, modes Modes) {
        this.Character = Character;
        this.Enemies = Enemies;
        this.Modes = Modes;
    }
    
    public character getCharacter() {
        return Character;
    }

    public enemies getEnemies() {
        return Enemies;
    }

    public modes getModes() {
        return Modes;
    }

    @Override
    public String toString() {
        return "InitOrder{" + "Character=" + Character + ", Enemies=" + Enemies + ", Modes=" + Modes + '}';
    }
    
    
   
    
    
    
}
