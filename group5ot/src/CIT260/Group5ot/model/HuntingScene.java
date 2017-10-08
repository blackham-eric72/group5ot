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
 * @author erict.blackham
 */
public class HuntingScene implements Serializable {
    
    private double ammunitionLvl; 
    private String animalType;
    private String difficultyLvl;

    //constructor

    public HuntingScene() {
    }
   
    
    //getter and setter

    public double getAmmunitionLvl() {
        return ammunitionLvl;
    }

    public void setAmmunitionLvl(double ammunitionLvl) {
        this.ammunitionLvl = ammunitionLvl;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    
       public String getDifficultyLvl() {
        return difficultyLvl;
    }

    public void setDifficultyLvl(String difficultyLvl) {
        this.difficultyLvl = difficultyLvl;
    }
    
   //equals and hash

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.ammunitionLvl) ^ (Double.doubleToLongBits(this.ammunitionLvl) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.animalType);
        hash = 59 * hash + Objects.hashCode(this.difficultyLvl);
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
        final HuntingScene other = (HuntingScene) obj;
        if (Double.doubleToLongBits(this.ammunitionLvl) != Double.doubleToLongBits(other.ammunitionLvl)) {
            return false;
        }
        if (!Objects.equals(this.animalType, other.animalType)) {
            return false;
        }
        if (!Objects.equals(this.difficultyLvl, other.difficultyLvl)) {
            return false;
        }
        return true;
    }
    
    //to string

    @Override
    public String toString() {
        return "HuntingScene{" + "ammunitionLvl=" + ammunitionLvl + ", animalType=" + animalType + ", difficultyLvl=" + difficultyLvl + '}';
    }
    
    
    
    
    
}
