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
public class WinningGameScene implements Serializable {
    
    //class instance variables
    private String playerName; //Can and should we reference the Player class?
    private double recordedTime;
    private EndScene endscene;
    
    //constructor
    public WinningGameScene() {
    }
    
    //getters and setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getRecordedTime() {
        return recordedTime;
    }

    public void setRecordedTime(double recordedTime) {
        this.recordedTime = recordedTime;
    }

    public EndScene getEndscene() {
        return endscene;
    }

    public void setEndscene(EndScene endscene) {
        this.endscene = endscene;
    }
    
    //hash, tostring and equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.playerName);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.recordedTime) ^ (Double.doubleToLongBits(this.recordedTime) >>> 32));
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
        final WinningGameScene other = (WinningGameScene) obj;
        if (Double.doubleToLongBits(this.recordedTime) != Double.doubleToLongBits(other.recordedTime)) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WinningGameScene{" + "playerName=" + playerName + ", recordedTime=" + recordedTime + '}';
    }
    
    
    
    
}
