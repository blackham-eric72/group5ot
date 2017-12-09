/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;
import CIT260.Group5ot.exceptions.WagonControlException;
import CIT260.Group5ot.model.Wagon;
import CIT260.Group5ot.model.ShoppingList;
import group5ot.Group5ot;
import CIT260.Group5ot.model.Game;
import CIT260.Group5ot.view.BuySuppliesView;
import java.util.ArrayList;

/**
 *
 * @author ken
 */
public class WagonControl {
		
  Wagon wagon = Group5ot.getCurrentGame().getWagon();
  
    //Wagon wagon = null;
    
   public  WagonControl(){       
    }
    
    public void setWagon(Wagon wagon) {
        this.wagon = wagon; 
    }
	
    public Wagon getWagon() {
        return this.wagon;
    }
    
    public void addShoppingItemsToWagon(int foodQuantity, int oxQuantity, int ammoQuantity,  int medicineQuantity){
        int ammoAmount = wagon.getNumOfAmmo();
        int foodAmount = wagon.getNumOfFood();
        int medsAmount = wagon.getNumOfMedicine();
        int oxAmount = wagon.getNumOfOx();

        wagon.setNumOfAmmo(ammoAmount + ammoQuantity);
        wagon.setNumOfFood(foodAmount + foodQuantity);
        wagon.setNumOfMedicine(medsAmount + medicineQuantity);
        wagon.setNumOfOx(oxAmount + oxQuantity);
    }
            
    public void addShoppingList(ArrayList<ShoppingList>shoppingList) {
        this.wagon = Group5ot.getCurrentGame().getWagon();
        for (int i=0; i < shoppingList.size(); i++) {
            
//            wagon.addSupplies(shoppingList.get(i).getItem(), shoppingList.get(i).getQuantity());
        }
    }
    
        

}

