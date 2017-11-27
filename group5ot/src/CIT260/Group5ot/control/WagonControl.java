/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.exceptions.WagonControlException;

/**
 *
 * @author ken
 */
public class WagonControl {
    
    double calcWagonCargoWeight(long numAdults, long numChildren, double foodWeight, double waterWeight) throws WagonControlException {
    
        if (numAdults < 0 || numAdults > 4) {
            throw new WagonControlException("Number of adults must be be more than zero and less than five.");
        }
        
        if (numChildren < 0 || numChildren > 4) {
            throw new WagonControlException("Number of children must be more than zero and less than five.");
        }
        
        if (foodWeight < 0 && foodWeight > 550) { //exceeded capacity
            throw new WagonControlException("Food weight must be between 550 lbs and zero.");
        }
        
        if (waterWeight < 0 && waterWeight > 550) { //exceeded capacity
            throw new WagonControlException("Water weight must be between 550 lbs and zero.");
        }
        
        if (((numAdults * 150) + (numChildren * 50) + (foodWeight) + (waterWeight)) > 1350) {
            throw new WagonControlException("Total weight must be less than 1350 lbs.");
        }

        double totalWagonCargoWeight = ((numAdults * 150) + (numChildren * 50) + (foodWeight) + (waterWeight)) ;
        
        return totalWagonCargoWeight;
    }
						
						
}
