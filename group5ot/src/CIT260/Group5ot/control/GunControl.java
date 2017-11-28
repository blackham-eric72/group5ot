/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;
import CIT260.Group5ot.exceptions.GunControlException;
/**
 *
 * @author ken
 */
public class GunControl {
    
   public double calcTaxProblem(double subtotal, double tax) throws GunControlException {
              
        if(subtotal < 0){
            throw new GunControlException("Your price must be greater than $0.00.");
        }
        
        if(tax < 0 || tax > 1){
            throw new GunControlException("Tax must be a percentage between 0 and 1, as in .08 for 8%, etc.");
        }
        
        double total = subtotal + (subtotal * tax);
        return total;
    }
    
    
}
