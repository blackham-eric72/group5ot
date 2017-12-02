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
 * @author crims
 */
public class Health implements Serializable{
    
    //class instance variables
    private int healthLevel;
    private String healthStatus;
    private Player player;

    public Health() {      
    } 
    
    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthlevel) {
        this.healthLevel = healthLevel;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.healthLevel;
        hash = 71 * hash + Objects.hashCode(this.healthStatus);
        return hash;
    }

    @Override
    public String toString() {
        return "Health{" + "healthlevel=" + healthLevel + ", healthStatus=" + healthStatus + '}';
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
        final Health other = (Health) obj;
        if (this.healthLevel != other.healthLevel) {
            return false;
        }
        if (!Objects.equals(this.healthStatus, other.healthStatus)) {
            return false;
        }
        return true;
    }
    
    
    
}
