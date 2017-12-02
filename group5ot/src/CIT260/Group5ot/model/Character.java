/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;
import java.awt.Point;
/**
 *
 * @author erict.blackham
 */
public class Character {

    
    private String name;
    private String description;
    private int healthLevel;
    private String healthStatus;
   
    

  public Character(String name, String description, int healthLevel) {
    this.name = name;
    this.description = description;
    this.healthLevel = healthLevel;
    this.healthStatus = healthStatus;

    }  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", healthLevel=" + healthLevel + '}';
    }

    
    
}


