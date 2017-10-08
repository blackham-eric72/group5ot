/*
 *Water Source Java Class
 */
package CIT260.Group5ot.model;

import java.io.Serializable;

/**
 *
 * @author erict.blackham
 */
public class WaterSource implements Serializable {
    
   //class instance variables
    private double currentWaterLvl;
    
    //constructor

    public WaterSource() {
    }
    
   //getter and setter

    public double getCurrentWaterLvl() {
        return currentWaterLvl;
    }

    public void setCurrentWaterLvl(double currentWaterLvl) {
        this.currentWaterLvl = currentWaterLvl;
    }
    
    //equals and hash

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.currentWaterLvl) ^ (Double.doubleToLongBits(this.currentWaterLvl) >>> 32));
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
        final WaterSource other = (WaterSource) obj;
        if (Double.doubleToLongBits(this.currentWaterLvl) != Double.doubleToLongBits(other.currentWaterLvl)) {
            return false;
        }
        return true;
    }
    
//TO STRING
    @Override
    public String toString() {
        return "WaterSource{" + "currentWaterLvl=" + currentWaterLvl + '}';
    }
    
    
    
    
    
}
