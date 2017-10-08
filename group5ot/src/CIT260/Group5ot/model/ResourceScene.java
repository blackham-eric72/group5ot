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
public class ResourceScene implements Serializable {
    
    //class instance variables
    private String amount;

    
    public ResourceScene(String amount) {
        this.amount = amount;
    }
    
    

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.amount);
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
        final ResourceScene other = (ResourceScene) obj;
        if (!Objects.equals(this.amount, other.amount)) {
            return false;
        }
        return true;
        
        
    }

    @Override
    public String toString() {
        return "ResourceScene{" + "amount=" + amount + '}';
    }
    
    
    
    
    
}
