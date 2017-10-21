/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

/**
 *
 * @author Flores Family
 */
public class HealthControl {
    
    //calculate the decrease in health
    
    public double calcHealthDecrease(double healthLevel) {
        
        //check the parameters
        if (healthLevel <= 0 || healthLevel > 100){
            return -1;
        }
        if(healthLevel < 5){
            return 0;
        }
        
        //lose health        
        healthLevel -=5;
                
        return healthLevel;
                
    }
    
        //calculate the increase in health
    
    public double calcHealthIncrease(double healthLevel) {
        
        //check the parameters
        if (healthLevel <= 0 || healthLevel > 100){
           return -1;
        }
        if(healthLevel >= 96){
           return 100;
        }
        
        //add health        
        healthLevel +=5;
                
        return healthLevel;
                
    }
    
    public String calcStatus(double healthLevel){
        
        String status = "error";
        
        if (healthLevel < 0 || healthLevel > 100){
            return status;
        }
        if(healthLevel == 0){
            status = "dead";
        }
        
        if(healthLevel >0 && healthLevel <= 25){
            status = "dying";
        }
        
        if (healthLevel > 25 && healthLevel <= 50){
            status = "weakening";
        }
        
        if (healthLevel > 50 && healthLevel <= 100){
            status = "healthy";
        }
        
        return status;
    }
    
}
