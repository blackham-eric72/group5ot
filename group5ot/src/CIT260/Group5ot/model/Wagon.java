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
    private int[] supplies = new int[4];
    private int locationNumber = 1;
//    private String ox;
//    private String food;
//    private String ammo;
//    private String medicine;
    private int numOfOx;
    private int numOfFood;
    private int numOfAmmo;
    private int numOfMedicine;
    
  

    public Wagon() {
    }

    public int getNumOfOx() {
        return numOfOx;
    }

    public void setNumOfOx(int numOfOx) {
        this.numOfOx = numOfOx;
    }

    public int getNumOfFood() {
        return numOfFood;
    }

    public void setNumOfFood(int numOfFood) {
        this.numOfFood = numOfFood;
    }

    public int getNumOfAmmo() {
        return numOfAmmo;
    }

    public void setNumOfAmmo(int numOfAmmo) {
        this.numOfAmmo = numOfAmmo;
    }

    public int getNumOfMedicine() {
        return numOfMedicine;
    }

    public void setNumOfMedicine(int numOfMedicine) {
        this.numOfMedicine = numOfMedicine;
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

    public int[] getSupplies() {
        return supplies;
    }

    public void setSupplies(int[] supplies) {
        this.supplies = supplies;
    }

    public int getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(int locationNumber) {
        this.locationNumber = locationNumber;
    }
    
//    public void addSupplies(ShoppingListEnum supplyType, int quantity) {
//       this.supplies[supplyType.ordinal()] += quantity;
//   }
   
   public void subtractSupplies(ShoppingListEnum supplyType, int quantity) {
       this.supplies[supplyType.ordinal()] -= quantity;
   }
   
   public int[] getAllSupplies(){
       return supplies;
   }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.supplyItem);
        hash = 89 * hash + Objects.hashCode(this.player);
        hash = 89 * hash + Arrays.hashCode(this.supplies);
        hash = 89 * hash + this.locationNumber;
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
        if (this.locationNumber != other.locationNumber) {
            return false;
        }
        if (!Objects.equals(this.supplyItem, other.supplyItem)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.equals(this.supplies, other.supplies)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wagon{" + "supplyItem=" + supplyItem + ", player=" + player + ", supplies=" + supplies + ", locationNumber=" + locationNumber + ", numOfOx=" + numOfOx + ", numOfFood=" + numOfFood + ", numOfAmmo=" + numOfAmmo + ", numOfMedicine=" + numOfMedicine + '}';
    }
    
    public String toInventoryString() {
        return "Number of Ox(en) = " + numOfOx + "\nAmount of Food = " + numOfFood + "\n Amount of Ammo = " + numOfAmmo + "\nAmount of Medicine = " + numOfMedicine ;
    }

    
}

    

