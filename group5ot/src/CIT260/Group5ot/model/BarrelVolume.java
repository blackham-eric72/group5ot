/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import java.io.Serializable;

/**
 *
 * @author crims
 */
public class BarrelVolume implements Serializable {
    
    //class instance variables
    private double barrelRadius;
    private double barrelHeight;

    public BarrelVolume() {
    }

    
    
    public double getBarrelRadius() {
        return barrelRadius;
    }

    public void setBarrelRadius(double barrelRadius) {
        this.barrelRadius = barrelRadius;
    }

    public double getBarrelHeight() {
        return barrelHeight;
    }

    public void setBarrelHeight(double barrelHeight) {
        this.barrelHeight = barrelHeight;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.barrelRadius) ^ (Double.doubleToLongBits(this.barrelRadius) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.barrelHeight) ^ (Double.doubleToLongBits(this.barrelHeight) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "BarrelVolume{" + "barrelRadius=" + barrelRadius + ", barrelHeight=" + barrelHeight + '}';
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
        final BarrelVolume other = (BarrelVolume) obj;
        if (Double.doubleToLongBits(this.barrelRadius) != Double.doubleToLongBits(other.barrelRadius)) {
            return false;
        }
        if (Double.doubleToLongBits(this.barrelHeight) != Double.doubleToLongBits(other.barrelHeight)) {
            return false;
        }
        return true;
    }
  
    
    
}
