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
 * @author Flores Family
 */
public class RiverCrossing implements Serializable{
    
    //class instance variables
    private String difficulty;
    private String waterLevel;

    public RiverCrossing() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.difficulty);
        hash = 89 * hash + Objects.hashCode(this.waterLevel);
        return hash;
    }

    @Override
    public String toString() {
        return "RiverCrossing{" + "difficulty=" + difficulty + ", waterLevel=" + waterLevel + '}';
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
        final RiverCrossing other = (RiverCrossing) obj;
        if (!Objects.equals(this.difficulty, other.difficulty)) {
            return false;
        }
        if (!Objects.equals(this.waterLevel, other.waterLevel)) {
            return false;
        }
        return true;
    }

    
    
    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(String waterLevel) {
        this.waterLevel = waterLevel;
    }
    
    
    
}
