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
public class GunControl {
    
   public double calcTaxProblem(double subtotal, double tax){
        
        if(subtotal < 0){
            return -1;
        }
        
        if(tax < 0 || tax > 100){
            return -1;
        }
        
        double total = subtotal + (subtotal * tax);
        //total = Math.floor(total * 100) / 100;
        return total;
    
    }
    
}
