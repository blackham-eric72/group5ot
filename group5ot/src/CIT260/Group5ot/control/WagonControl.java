/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

/**
 *
 * @author ken
 */
public class WagonControl {
    
    double calcWagonCargoWeight(long numAdults, long numChildren, double foodWeight, double waterWeight) {
    
        if (numAdults < 0 || numAdults > 4) {
            return -1;
        }
        
        if (numChildren < 0 || numChildren > 4) {
            return -1;
        }
        
        if (foodWeight < 0 && foodWeight > 550) { //exceeded capacity
            return -1;
        }
        
        if (waterWeight < 0 && waterWeight > 550) { //exceeded capacity
            return -1;
        }
        
        if (((numAdults * 150) + (numChildren * 50) + (foodWeight) + (waterWeight)) > 1350) {
            return -1;
        }

        double totalWagonCargoWeight = ((numAdults * 150) + (numChildren * 50) + (foodWeight) + (waterWeight)) ;
        
        return totalWagonCargoWeight;
    }
						
						
}
