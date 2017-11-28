/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;
import CIT260.Group5ot.exceptions.MeatShareException;
/**
 *
 * @author Flores Family
 */
public class MeatShareControl {
    
    public double calcShares(double meatWeight, double numAdults, double numChildren) throws MeatShareException {
            if (meatWeight <= 0 || meatWeight > 300){
                throw new MeatShareException("\n Meat weight cannot be less than 0 "
                                               + "\n or greater than 300.");
            }

            if (numAdults < 0 || numAdults > 2) {
                throw new MeatShareException("Number of adults must be between "
                                               + "\n 0 and 2.");
            }

            if (numChildren < 0 || numChildren > 3) {
                throw new MeatShareException("Number of children must be between "
                                               + "\n 0 and 3.");
            }

            double totalShares = (numAdults * 2) + numChildren;
            double weightPerShare = meatWeight/totalShares;
            double roundedWeightPerShare = Math.floor(weightPerShare * 100) / 100;
            return roundedWeightPerShare;
    }    
}
