/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ken
 */
public class LosingGameScene implements Serializable{
    
    //class instance variables
    private String playerName; //Can and should we reference the Player class?
    private EndScene endscene;
    
    //constructor

    public LosingGameScene() {
    }
    
    //getters and setters

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public EndScene getEndscene() {
        return endscene;
    }

    public void setEndscene(EndScene endscene) {
        this.endscene = endscene;
    }
    
    //tostring, hash and equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.playerName);
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
        final LosingGameScene other = (LosingGameScene) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LosingGameScene{" + "playerName=" + playerName + '}';
    }
    
    
}
