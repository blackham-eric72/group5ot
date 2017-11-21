/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import CIT260.Group5ot.enums.ItemType;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author crims
 */
public class InventoryItem implements Serializable{
    
    //class instance variables
    private String inventoryType;
    private int quantityInStock;
    private int requiredAmount;
    private Barrel barrel;
    private ItemType itemType;

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public InventoryItem() {
    }
    
    public InventoryItem(ItemType itemType , int quantityInStock, int requiredAmount) {
    
        this.itemType = itemType;
        this.quantityInStock = quantityInStock;
        this.requiredAmount = requiredAmount;
    }
    
    

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public Barrel getBarrel() {
        return barrel;
    }

    public void setBarrel(Barrel barrel) {
        this.barrel = barrel;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.inventoryType);
        hash = 67 * hash + this.quantityInStock;
        hash = 67 * hash + this.requiredAmount;
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
