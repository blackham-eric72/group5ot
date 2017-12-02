/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import static CIT260.Group5ot.control.GameControl.createCharacters;
import CIT260.Group5ot.enums.CharacterType;
import CIT260.Group5ot.exceptions.HealthControlException;
import group5ot.Group5ot;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Flores Family
 */
public class HealthControl {
    
    protected final PrintWriter console = Group5ot.getOutFile();    

    //calculate the decrease in health
    
    public double calcHealthDecrease(double healthLevel) throws HealthControlException{
        
        //check the parameters
        if (healthLevel <= 0 || healthLevel > 100){
            throw new HealthControlException("Health must be greater than 0 and less than 100");
        }
        if(healthLevel < 5){
            return 0;
        }
        
        //lose health        
        healthLevel -=5;
                
        return healthLevel;
                
    }
    
        //calculate the increase in health
    
    public double calcHealthIncrease(double healthLevel) throws HealthControlException{
        
        //check the parameters
        if (healthLevel <= 0 || healthLevel > 100){
           throw new HealthControlException("Health must be greater than 0 and less than 100");
        }
        if(healthLevel >= 96){
           return 100;
        }
        
        //add health        
        healthLevel +=5;
                
        return healthLevel;
                
    }
    
    public String calcHealthStatus(double healthLevel){
        
        String healthStatus = null;
        
        if(healthLevel == 0){
            healthStatus = "dead";
        }
        
        if(healthLevel >0 && healthLevel <= 25){
            healthStatus = "dying";
        }
        
        if (healthLevel > 25 && healthLevel <= 50){
            healthStatus = "weakening";
        }
        
        if (healthLevel > 50 && healthLevel <= 100){
            healthStatus = "healthy";
        }
        
        return healthStatus;
    }
    
    public void calcAverageHealth(){
         ArrayList<CIT260.Group5ot.model.Character> character = new ArrayList<>(); 
               
        CIT260.Group5ot.model.Character obadiah = new CIT260.Group5ot.model.Character("Obadiah", "He is the leader of the family", 10);
        CIT260.Group5ot.model.Character lilyAnne = new CIT260.Group5ot.model.Character("LilyAnne", "She is the mother(real leader) of the family", 10);
        CIT260.Group5ot.model.Character ephraim = new CIT260.Group5ot.model.Character("Ephraim", "First born son", 10);
        CIT260.Group5ot.model.Character gertrude = new CIT260.Group5ot.model.Character("Gertrude", "First born daughter, who has a fiesty attitude", 10);
        CIT260.Group5ot.model.Character myrtle = new CIT260.Group5ot.model.Character("Myrtle", "Last born child - only a baby", 10);
        CIT260.Group5ot.model.Character traderJoe = new CIT260.Group5ot.model.Character("Trader-Joe", "He is the owner of the trading post", 10);
        
        
        character.add(obadiah);
        character.add(lilyAnne);
        character.add(ephraim);
        character.add(gertrude);
        character.add(myrtle);
        character.add(traderJoe);
        
        this.console.println(character.get(0).getHealthLevel());
        //Use a for each loop to loop through each character and display their character level        
        for(CIT260.Group5ot.model.Character healthLvl :character){
         this.console.println( "\nName: " + healthLvl.getName()
                             + "\n\tHealth Level:" + healthLvl.getHealthLevel());
           }
        
        //Calculate and display the average character level
        int sum = 0;
        
        
         for(CIT260.Group5ot.model.Character healthLvl :character){
             sum += healthLvl.getHealthLevel();
           }
         int average = sum / character.size();
         this.console.println("Average Health Level: " + average);
         
        
    }
}
