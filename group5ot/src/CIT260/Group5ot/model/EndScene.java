/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ken
 */
public class EndScene implements Serializable {
    
    //class instance variables
    private boolean endStatus;
    private ArrayList<Game> games = new ArrayList<>();
    
    //constructor
    public EndScene() {
    }
    
    //getters and setters
    public boolean isEndStatus() {
        return endStatus;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public void setEndStatus(boolean endStatus) {
        this.endStatus = endStatus;
    }
 
    //hash, equals and tostring
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.endStatus ? 1 : 0);
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
        final EndScene other = (EndScene) obj;
        if (this.endStatus != other.endStatus) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EndScene{" + "endStatus=" + endStatus + '}';
    }
    


}
