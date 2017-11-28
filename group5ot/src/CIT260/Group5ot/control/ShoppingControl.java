package CIT260.Group5ot.control;

import CIT260.Group5ot.enums.ShoppingListEnum;
import CIT260.Group5ot.exceptions.ShoppingControlException;
import CIT260.Group5ot.model.ShoppingList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Flores Family
 */
public class ShoppingControl {
     
    public static ArrayList<ShoppingList> createList(){
                
        ArrayList<ShoppingList> list = new ArrayList<>();
        
        return list;
                    
    }
    
    public double calculateTotalCost(ArrayList<ShoppingList> inList) throws ShoppingControlException{
        double totalCost = 0;

        for (int i=0; i < inList.size();i++) {
            
            if(inList.get(i).getQuantity() < 0|| inList.get(i).getQuantity() > 100){
                throw new ShoppingControlException("Quantity must be greater than or equal to 0");
            }

            if(inList.get(i).getPrice()<0){
                throw new ShoppingControlException("Price must be greater than or equal to 0");
            }
            else{
                double cost = Math.round((inList.get(i).getQuantity() * inList.get(i).getPrice())*100)/100;
                totalCost += cost;
            }
            
        }
        return totalCost;
    }
}
