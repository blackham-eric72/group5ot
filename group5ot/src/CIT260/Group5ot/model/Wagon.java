/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import java.io.Serializable;
import java.util.Objects;
import CIT260.Group5ot.enums.ShoppingListEnum;
import java.util.Arrays;

/**
 *
 * @author crims
 */
public class Wagon implements Serializable{
    
    //class instance variabels
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
        hash = 79 * hash + Objects.hashCode(this.supplyItem);
        hash = 79 * hash + Objects.hashCode(this.player);
        hash = 79 * hash + Objects.hashCode(this.location);
        hash = 79 * hash + Arrays.hashCode(this.supplies);
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
        final Wagon other = (Wagon) obj;
        if (!Objects.equals(this.supplyItem, other.supplyItem)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Arrays.equals(this.supplies, other.supplies)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wagon{" + "supplyItem=" + supplyItem + ", player=" + player + ", location=" + location + ", supplies=" + supplies + '}';
    }  
    
}
