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
public class TradingPost implements Serializable {
    
    private String suppliesForSale;
    private double costOfSupplies;
    
    
    //constructor 

    public TradingPost() {
    }
//getter and setter
    public String getSuppliesForSale() {
        return suppliesForSale;
    }

    public void setSuppliesForSale(String suppliesForSale) {
        this.suppliesForSale = suppliesForSale;
    }

    public double getCostOfSupplies() {
        return costOfSupplies;
    }

    public void setCostOfSupplies(double costOfSupplies) {
        this.costOfSupplies = costOfSupplies;
    }
            
    //equals and hash

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.suppliesForSale);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.costOfSupplies) ^ (Double.doubleToLongBits(this.costOfSupplies) >>> 32));
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
        final TradingPost other = (TradingPost) obj;
        if (Double.doubleToLongBits(this.costOfSupplies) != Double.doubleToLongBits(other.costOfSupplies)) {
            return false;
        }
        if (!Objects.equals(this.suppliesForSale, other.suppliesForSale)) {
            return false;
        }
        return true;
    }
    
//toString

    @Override
    public String toString() {
        return "TradingPost{" + "suppliesForSale=" + suppliesForSale + ", costOfSupplies=" + costOfSupplies + '}';
    }
    
    
}
