/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;
import java.util.ArrayList; 
import CIT260.Group5ot.model.InventoryItem;
/**
 *
 * @author erict.blackham
 */
public class InventoryControl {
    
    public static double addInventoryItem(double itemQuantity){
        
             
        //make sure there is no negative inventory type:
        if (itemQuantity < 0) {
            return -1;
        }
        //make sure there is no excess
        if (itemQuantity >= 30) {
            return -1;
        }
        //add inventory item
        itemQuantity += 1;
        
        return itemQuantity;
    }
    
    public static double decreaseInventoryItem(double itemQuantity){
        //make sure there is no negative inventory type:
        if (itemQuantity <= 0) {
            return -1;
        }
        //make sure there is no excess
        if (itemQuantity > 30) {
            return -1;
        }
        //subtract inventory item
        itemQuantity -= 1;
        
        return itemQuantity;
        }
    public void sortInventoryItems(ArrayList<InventoryItem> inventory) {

        for (InventoryItem item : inventory) {

            // ItemTypes itemTypes = itemTypes.get(i);
            this.console.println("\n\tItem: " + item.getItemTypes().name() + 
                               "\n\tQuantity: " + item.getQuantityInStock());
        }



    }    
}
