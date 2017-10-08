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
public class Menu implements Serializable{
    
    //class instance variables
    private ArrayList<Menu> menuItems = new ArrayList<>();
    private HelpMenu helpMenu;
    private MainMenu mainMenu;
    private GameMenu gameMenu;
    private Game game;
    private Player player;
        
    public Menu() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.menuItems);
        return hash;
    }

    @Override
    public String toString() {
        return "Menu{" + "menuItems=" + menuItems + '}';
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
        final Menu other = (Menu) obj;
        if (!Objects.equals(this.menuItems, other.menuItems)) {
            return false;
        }
        return true;
    }

    public HelpMenu getHelpMenu() {
        return helpMenu;
    }

    public void setHelpMenu(HelpMenu helpMenu) {
        this.helpMenu = helpMenu;
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public GameMenu getGameMenu() {
        return gameMenu;
    }

    public void setGameMenu(GameMenu gameMenu) {
        this.gameMenu = gameMenu;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
        
    public ArrayList<Menu> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<Menu> menuItems) {
        this.menuItems = menuItems;
    }

    
    
}
