package CIT260.Group5ot.control;

import CIT260.Group5ot.model.Animal; //Brings in my enum for later array creation.
import java.util.ArrayList; //Allows array creation.
import CIT260.Group5ot.model.InventoryItem;

/**
 *
 * @author Flores Family / ken
 */


public class AnimalHuntedControl {
    //determine the animal that will be hunted by the player
    //An array of animals: Squirrel, Rabbit, Deer, Buffalo
    //Animal will be picked randomly.
    //This information will be used by the AnimalHuntedView and MeatShareControl class
    //Squirrel = 1 lbs meat
    //Rabbit = 5 lbs meat
    //Deer = 150 lbs meat
    //Buffalo = 1000 lbs meat

    
    public static ArrayList<Animal> createAnimals(){
        
        ArrayList<Animal> tacoMeat = new ArrayList<>();
        
        //will convert enum values to variables (I think that's right)
        Animal squirrel = new Animal("Squirrel", 1);
        Animal rabbit = new Animal("Rabbit", 5);
        Animal deer = new Animal("Deer", 150);
        Animal buffalo = new Animal("Buffalo", 100);        
        
        //will fill new array with my animals
        tacoMeat.add(0, squirrel);
        tacoMeat.add(1, rabbit);
        tacoMeat.add(2, deer);
        tacoMeat.add(3, buffalo);        
        
        return tacoMeat;
    }
      
    //Try to use "tacoMeat" array above to get animal with most meat.
    public void findMostMeatyAnimal(ArrayList<Animal> tacoMeat) {
        
        for (int i = 0; i < tacoMeat.size(); i++) {
            System.out.println(tacoMeat.get(i));  
        }
        
    } 
    
}


        
