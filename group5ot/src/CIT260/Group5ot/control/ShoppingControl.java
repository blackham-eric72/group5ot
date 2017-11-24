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
     
    public static ArrayList<ShoppingList> createList(){
                
        ArrayList<ShoppingList> list = new ArrayList<>();
        
        return list;
                    
    }
    
    public double calculateTotalCost(ArrayList<ShoppingList> inList){
        double totalCost = 0;

        for (int i=0; i < inList.size();i++) {
            double cost = inList.get(i).getQuantity() * inList.get(i).getPrice();
            
            totalCost += cost;

        }
        return totalCost;
    }
}
