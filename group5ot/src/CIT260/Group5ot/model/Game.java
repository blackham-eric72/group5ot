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
 * @author erict.blackham
 */
public class Game implements Serializable  {
    
    //class instance variables
   private double totalTime;
   private int noPeople;
   private Player player;
   private Map map;
   private EndScene endscene;
   private Menu menu;
   private BarrelVolume barrelVolume;
   private MeatShare meatShare;
   private Trading trading;
   private InventoryItem[] inventory;
   private ArrayList<Character> characters;
   private ArrayList<InventoryItem> items;

    public ArrayList<InventoryItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<InventoryItem> items) {
        this.items = items;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }


   
    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 59 * hash + this.noPeople;
        return hash;
    }

   
    
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + ", player=" + player + ", map=" + map + ", endscene=" + endscene + ", menu=" + menu + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (this.noPeople != other.noPeople) {
            return false;
        }
        return true;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }     
   
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public EndScene getEndscene() {
        return endscene;
    }

    public void setEndscene(EndScene endscene) {
        this.endscene = endscene;
    }

    public BarrelVolume getBarrelVolume() {
        return barrelVolume;
    }

    public void setBarrelVolume(BarrelVolume barrelVolume) {
        this.barrelVolume = barrelVolume;
    }

    public MeatShare getMeatShare() {
        return meatShare;
    }

    public void setMeatShare(MeatShare meatShare) {
        this.meatShare = meatShare;
    }

    public Trading getTrading() {
        return trading;
    }

    public void setTrading(Trading trading) {
        this.trading = trading;
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
    
   
    
}
