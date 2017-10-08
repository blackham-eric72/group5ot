/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Flores Family
 */
public class MainMenu implements Serializable{
    //class instance variables
    private ArrayList<Menu> menuItems = new ArrayList<>();
    
    public MainMenu() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.menuItems);
        return hash;
    }

    @Override
    public String toString() {
        return "MainMenu{" + "menuItems=" + menuItems + '}';
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
        final MainMenu other = (MainMenu) obj;
        if (!Objects.equals(this.menuItems, other.menuItems)) {
            return false;
        }
        return true;
    }

    
    
    public ArrayList<Menu> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<Menu> menuItems) {
        this.menuItems = menuItems;
    }
    
    
}
