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
 * @author Flores Family
 */
public class Trail implements Serializable{
    
    //class instance variables
    private String condition;

    public Trail() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.condition);
        return hash;
    }

    @Override
    public String toString() {
        return "Trail{" + "condition=" + condition + '}';
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
        final Trail other = (Trail) obj;
        if (!Objects.equals(this.condition, other.condition)) {
            return false;
        }
        return true;
    }
    
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    
}
