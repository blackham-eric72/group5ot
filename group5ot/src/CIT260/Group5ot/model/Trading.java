/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author crims
 */
public class Trading implements Serializable{
    
    //class instance variables
    public String tradeItem;
    private double itemAmount;
    private double itemPrice;    
    public String tradeList[] = {"rope", "nails", "hammer", "saw", "axe", "shovel", "knife", "lead balls", "black powder", "rifle", "axel grease", "wagon wheel", "oats", "wheat", "lard", "salt pork", "flour", "sugar", "butter", "salt"};

    public Trading() {
    }
    
    

    public String getTradeItem() {
        return tradeItem;
    }

    public void setTradeItem(String tradeItem) {
        this.tradeItem = tradeItem;
    }

    public double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(double itemAmount) {
        this.itemAmount = itemAmount;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String[] getTradeList() {
        return tradeList;
    }

    public void setTradeList(String[] tradeList) {
        this.tradeList = tradeList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.tradeItem);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.itemAmount) ^ (Double.doubleToLongBits(this.itemAmount) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.itemPrice) ^ (Double.doubleToLongBits(this.itemPrice) >>> 32));
        hash = 47 * hash + Arrays.deepHashCode(this.tradeList);
        return hash;
    }

    @Override
    public String toString() {
        return "Trading{" + "tradeItem=" + tradeItem + ", itemAmount=" + itemAmount + ", itemPrice=" + itemPrice + ", tradeList=" + tradeList + '}';
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
        final Trading other = (Trading) obj;
        if (Double.doubleToLongBits(this.itemAmount) != Double.doubleToLongBits(other.itemAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemPrice) != Double.doubleToLongBits(other.itemPrice)) {
            return false;
        }
        if (!Objects.equals(this.tradeItem, other.tradeItem)) {
            return false;
        }
        if (!Arrays.deepEquals(this.tradeList, other.tradeList)) {
            return false;
        }
        return true;
    }
    
    

   /** @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.tradeItem);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.itemAmount) ^ (Double.doubleToLongBits(this.itemAmount) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.itemPrice) ^ (Double.doubleToLongBits(this.itemPrice) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Trading{" + "tradeItem=" + tradeItem + ", itemAmount=" + itemAmount + ", itemPrice=" + itemPrice + '}';
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
        final Trading other = (Trading) obj;
        if (Double.doubleToLongBits(this.itemAmount) != Double.doubleToLongBits(other.itemAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemPrice) != Double.doubleToLongBits(other.itemPrice)) {
            return false;
        }
        if (!Objects.equals(this.tradeItem, other.tradeItem)) {
            return false;
        }
        return true;
    }*/
    
    
}
