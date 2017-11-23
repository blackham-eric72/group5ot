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
public class Barrel implements Serializable{
    
    //class instance variables
    private double height;
    private double diameter;

    public Barrel(double height, double diameter) {
        this.height = height;
        this.diameter = diameter;
    }
    

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.diameter) ^ (Double.doubleToLongBits(this.diameter) >>> 32));
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
        final Barrel other = (Barrel) obj;
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.diameter) != Double.doubleToLongBits(other.diameter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Barrel{" + "height=" + height + ", diameter=" + diameter + '}';
    }

   

    
   
    

   
    
    
    
    
}
