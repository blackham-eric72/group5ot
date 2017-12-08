/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import java.io.Serializable;
import java.util.Objects;
import CIT260.Group5ot.enums.ShoppingListEnum;

/**
 *
 * @author crims
 */
public class Wagon implements Serializable{
    
    //class instance variabels
    private double totalWeight;
    private String supplyItem;
    private Player player;
    private Location location;
    private int[] supplies = new int[4];

    

    public Wagon() {
    }
    
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
   
    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getSupplyItem() {
        return supplyItem;
    }

    public void setSupplyItem(String supplyItem) {
        this.supplyItem = supplyItem;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public void addSupplies(ShoppingListEnum supplyType, int quantity) {
        this.supplies[supplyType.ordinal()] += quantity;
    }
    
    public void subtractSupplies(ShoppingListEnum supplyType, int quantity) {
        this.supplies[supplyType.ordinal()] -= quantity;
    }
    
    public int[] getAllSupplies(){
        return supplies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalWeight) ^ (Double.doubleToLongBits(this.totalWeight) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.supplyItem);
        return hash;
    }

    @Override
    public String toString() {
        return "Wagon{" + "totalWeight=" + totalWeight + ", supplyItem=" + supplyItem + ", player=" + player + ", location=" + location + '}';
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
        final Wagon other = (Wagon) obj;
        if (Double.doubleToLongBits(this.totalWeight) != Double.doubleToLongBits(other.totalWeight)) {
            return false;
        }
        if (!Objects.equals(this.supplyItem, other.supplyItem)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    
    
    

  
    
    
    
    
    
}
