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
public class Campsite implements Serializable{
    
    
    /*//class instance variables*/
    private boolean water;
    private boolean shade;
    private String weather;
    private String resources;

    public Campsite() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.water ? 1 : 0);
        hash = 89 * hash + (this.shade ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.weather);
        hash = 89 * hash + Objects.hashCode(this.resources);
        return hash;
    }

    @Override
    public String toString() {
        return "Campsite{" + "water=" + water + ", shade=" + shade + ", weather=" + weather + ", resources=" + resources + '}';
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
        final Campsite other = (Campsite) obj;
        if (this.water != other.water) {
            return false;
        }
        if (this.shade != other.shade) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        if (!Objects.equals(this.resources, other.resources)) {
            return false;
        }
        return true;
    }

    
    
    
    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isShade() {
        return shade;
    }

    public void setShade(boolean shade) {
        this.shade = shade;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }
    
    
    
}
