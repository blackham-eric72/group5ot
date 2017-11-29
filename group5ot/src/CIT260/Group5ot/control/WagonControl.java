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
    
    public double calcWagonCargoWeight(int numAdults, int numChildren, double supplyWeight, double meatWeight, double waterWeight) throws WagonControlException {
    
        if (numAdults < 0 || numAdults > 4) {
            throw new WagonControlException("Number of adults must be be more than zero and less than five.");
        }
        
        if (numChildren < 0 || numChildren > 4) {
            throw new WagonControlException("Number of children must be more than zero and less than five.");
        }
        
        if (supplyWeight < 0 && supplyWeight > 550) { //exceeded capacity
            throw new WagonControlException("Food weight must be between 550 lbs and zero.");
        }
        
        if (meatWeight < 0 && meatWeight > 250) { //exceeds capacity
            throw new WagonControlException("Meat weight must be between zero and 250 lbs.");
        }
        
        if (waterWeight < 0 && waterWeight > 550) { //exceeded capacity
            throw new WagonControlException("Water weight must be between 550 lbs and zero.");
        }
        
        if (((numAdults * 150) + (numChildren * 50) + (supplyWeight) + (meatWeight) + (waterWeight)) > 1600) {
            throw new WagonControlException("Total weight must be less than 1600 lbs.");
        }

        double totalWagonCargoWeight = ((numAdults * 150) + (numChildren * 50) + (supplyWeight) + (waterWeight)) ;
        
        return totalWagonCargoWeight;
    }

    double calcWagonCargoWeight(long numAdults, long numChildren, double foodWeight, double meatWeight, double waterWeight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
						
						
}
