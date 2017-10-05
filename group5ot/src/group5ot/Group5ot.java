/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5ot;

import CIT260.Group5ot.model.Player;
import CIT260.Group5ot.model.Character;


/**
 *
 * @author erict.blackham
 */
public class Group5ot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        playerOne.setName("Michael Jordan");
        playerOne.setBestTime(8.00);
        
        String playerOneName = playerOne.getName();
        double playerOneBestTime = playerOne.getBestTime();
        
        System.out.println(playerOne.toString());
        
       Character.Father.getName();
       Character.Father.getDescription();
       
       
       
       
       System.out.println(Character.Father.getName() + " , " + Character.Father.getDescription());
             
    }
    
   
   
   
    
    
    
}
