/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;
import CIT260.Group5ot.enums.ShoppingListEnum;

/**
 *
 * @author Flores Family
 */
public class ShoppingControl {
//BEGIN
//total = 0
//FOR index = 0 TO list.length -1
// total = total + list[index]
//ENDFOR
//RETURN total
//END
    
       public double calculateTotalCost(double quantity, double price){
           double totalCost = 0;
           
            for (int i=0; i<4; i++) {
                if(quantity < 0){
                    return -1;
                }

                if(price < 0){
                    return -1;
                }

                double cost = quantity * price;
                totalCost += cost;
                
            }
            return totalCost;
       }
}
