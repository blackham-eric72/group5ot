package CIT260.Group5ot.model;

import CIT260.Group5ot.enums.ShoppingListEnum;

/**
 *
 * @author Flores Family
 */
public class ShoppingList {
    private ShoppingListEnum shoppingItem;
    private int quantity;
    private double price;

    public ShoppingList (ShoppingListEnum shoppingItem, int quantity, double price){
        this.shoppingItem = shoppingItem;
        this.quantity = quantity;
        this.price = price;
    }
    
    public ShoppingListEnum getItem() {
        return shoppingItem;
    }

    public void setItem(ShoppingListEnum shoppingItem) {
        this.shoppingItem = shoppingItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
