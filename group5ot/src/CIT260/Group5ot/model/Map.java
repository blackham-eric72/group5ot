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
 * @author ken
 */
public class Map implements Serializable {
    
    //class instance variables
    private String description;
    private int ROWCOUNT = 3;
    private int COLUMNCOUNT = 20;
    private ArrayList<Game> games = new ArrayList<>();
    private Location[][] locations = new Location[ROWCOUNT][COLUMNCOUNT];

    //default constructor
    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns) {
        
        this.ROWCOUNT = noOfRows;
        this.COLUMNCOUNT = noOfColumns;
    }
    
    //getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getROWCOUNT() {
        return ROWCOUNT;
    }
    //Is this needed?  We have a static value.
    public void setROWCOUNT(int ROWCOUNT) {
        this.ROWCOUNT = ROWCOUNT;
    }

    public int getCOLUMNCOUNT() {
        return COLUMNCOUNT;
    }
    //Is this needed?  We have a static value.
    public void setCOLUMNCOUNT(int COLUMNCOUNT) {
        this.COLUMNCOUNT = COLUMNCOUNT;
    }


    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    //implementing tostring, hashcode and equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + this.ROWCOUNT;
        hash = 89 * hash + this.COLUMNCOUNT;
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
        final Map other = (Map) obj;
        if (this.ROWCOUNT != other.ROWCOUNT) {
            return false;
        }
        if (this.COLUMNCOUNT != other.COLUMNCOUNT) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", ROWCOUNT=" + ROWCOUNT + ", COLUMNCOUNT=" + COLUMNCOUNT + '}';
    }
    
    
    
}
