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
public class FoodSource  implements Serializable{
    
    private String foodLvl;
    private String foodNeeded;
    
    
    //constructor

    public FoodSource() {
    }
    
    //getter and setters

    public String getFoodLvl() {
        return foodLvl;
    }

    public void setFoodLvl(String foodLvl) {
        this.foodLvl = foodLvl;
    }

    public String getFoodNeeded() {
        return foodNeeded;
    }

    public void setFoodNeeded(String foodNeeded) {
        this.foodNeeded = foodNeeded;
    }
    
 //equals and hash

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.foodLvl);
        hash = 13 * hash + Objects.hashCode(this.foodNeeded);
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
        final FoodSource other = (FoodSource) obj;
        if (!Objects.equals(this.foodLvl, other.foodLvl)) {
            return false;
        }
        if (!Objects.equals(this.foodNeeded, other.foodNeeded)) {
            return false;
        }
        return true;
    }
    
    //toString

    @Override
    public String toString() {
        return "FoodSource{" + "foodLvl=" + foodLvl + ", foodNeeded=" + foodNeeded + '}';
    }
    
}
