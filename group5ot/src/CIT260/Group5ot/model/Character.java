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
public enum Character {
    Father("Obadiah", "He is the leader of the family", new Point (1,1)),
    Mother("LilyAnne", "She is the mother(real leader) of the family", new Point (0,1)),
    Son1("Ephraim", "First born son", new Point (1,2)),
    Daughter1("Gertrude", "First born daughter, who has a fiesty attitude", new Point (1,3)),
    Daughter2("Myrtle", "Last born child - only a baby", new Point (1,4)),
    Trader("Trader-Joe", "He is the owner of the trading post", new Point (2,3));
    
    private String name;
    private String description;
    private Point coordinates;
    

  Character(String name, String description, Point coordinates) {
    this.name = name;
    this.description = description;
    this.coordinates = coordinates;

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

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }


}


