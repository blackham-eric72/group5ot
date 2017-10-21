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
public class MeatShareControl {
    
    public double calcShares(double meatWeight, double numAdults, double numChildren){
        
        if (meatWeight <= 0 || meatWeight > 300){
            return -1;
        }
    
        if (numAdults < 0 || numAdults > 2) {
            return -1;
        }
        
        if (numChildren < 0 || numChildren > 3) {
            return -1;
        }
        
        double totalShares = (numAdults * 2) + numChildren;
        double weightPerShare = meatWeight/totalShares;
        
        return weightPerShare;
    }    
}
