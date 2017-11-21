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
 * @author ken
 */
public class Location implements Serializable {
    
    //class instance variables
//    private int row;
//    private int column;
    private boolean visited;
    private Scene sceneType;

    public Scene getSceneType() {
        return sceneType;
    }

    public void setSceneType(Scene sceneType) {
        this.sceneType = sceneType;
    }
    
    
   // private int amountRemaining;
   

    //constructor
    public Location() {
    }

    //getters and setters
//    public int getRow() {
//        return row;
//    }
//
//    public void setRow(int row) {
//        this.row = row;
//    }
//
//    public int getColumn() {
//        return column;
//    }
//
//    public void setColumn(int column) {
//        this.column = column;
//    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

//    public int getAmountRemaining() {
//        return amountRemaining;
//    }
//
//    public void setAmountRemaining(int amountRemaining) {
//        this.amountRemaining = amountRemaining;
//    }

//    public Map getMap() {
//        return map;
//    }
//
//    public void setMap(Map map) {
//        this.map = map;
//    }
    
    //hash, equals and tostring
    @Override
    public int hashCode() {
        int hash = 7;
//        hash = 41 * hash + this.row;
//        hash = 41 * hash + this.column;
        hash = 41 * hash + (this.visited ? 1 : 0);
      //  hash = 41 * hash + this.amountRemaining;
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
        final Location other = (Location) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.sceneType, other.sceneType)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", sceneType=" + sceneType + '}';
    }

    
    
    
    
    
}
