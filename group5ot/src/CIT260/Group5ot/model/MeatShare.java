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
public class MeatShare implements Serializable{
    
    
    //class instance variables
    private double meatWeight;
    private int numAdults;
    private int numChildren;
    
    

    public MeatShare(double meatWeight, int numAdults, int numChildren) {
    }
    
    

    public double getMeatWeight() {
        return meatWeight;
    }

    public void setMeatWeight(double meatWeight) {
        this.meatWeight = meatWeight;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    public int getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.meatWeight) ^ (Double.doubleToLongBits(this.meatWeight) >>> 32));
        hash = 37 * hash + this.numAdults;
        hash = 37 * hash + this.numChildren;
        return hash;
    }

    @Override
    public String toString() {
        return "MeatShare{" + "meatWeight=" + meatWeight + ", numAdults=" + numAdults + ", numChildren=" + numChildren + '}';
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
        final MeatShare other = (MeatShare) obj;
        if (Double.doubleToLongBits(this.meatWeight) != Double.doubleToLongBits(other.meatWeight)) {
            return false;
        }
        if (this.numAdults != other.numAdults) {
            return false;
        }
        if (this.numChildren != other.numChildren) {
            return false;
        }
        return true;
    }
    
    
}
