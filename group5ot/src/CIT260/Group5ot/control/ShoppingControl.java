/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.enums.ShoppingListEnum;
import CIT260.Group5ot.model.ShoppingList;
import java.util.ArrayList;
import java.util.Scanner;

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
     
    public static ArrayList<ShoppingListEnum> createList(){
                
        ArrayList<ShoppingListEnum> list = new ArrayList<>();
        
        return list;
                    
    }
    //for each item in the array of possible items they could purchase
    //calculate the cost then add those together to get the total cost.
    //How do I create my array and pass it to this function? the values
    //are coming from buysuppliesview.
    
    public double calculateTotalCost(double quantity, double price){
        double totalCost = 0;

        for (/*what do I put in here?*/) {
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
