/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

/**
 *
 * @author crims
 */
public class MoveView extends View {
    
    
    public MoveView() {
                super("\n"
                            + "\n---------------------------------------"       
                            + "\n|           Movement                  |"
                            + "\n---------------------------------------"
                            + "\n|     M - View Map                    |" 
                            + "\n|     V - View Health                 |"
                            + "\n|     I - View Inventory              |"
                            + "\n|     F - Move Forward                |" 
                            + "\n|     G - Return to Game Menu         |"
                            + "\n--------------------------------------");
    }

   @Override
   public boolean doAction(String choice) {
       
       choice = choice.toUpperCase(); // convert to upper case
            
            switch (choice) {
                case "M": // display buy supplies menu
                    this.displayMapView();
                    break;
                case "V": // return to previous screen
                    this.displayHealthView();
                    break;
                case "I": // return to previous screen
                    this.displayInventoryView();
                    break;
                case "F": // return to previous screen
                    this.movement();
                    break;
                case "G": // return to previous screen
                    this.displayGameMenuView();
                    break;         
                default:
                   System.out.println("\n*** Invalid selection *** Try Again");
                   break;
        }
            return false;
   }
    
   
    

    private void displayMapView() {
        MapView mapView = new MapView();
       
        mapView.display();
    }

    private void displayHealthView() {
        System.out.println("*** displayHealthView() function has been called");
    }

    private void displayInventoryView() {
        System.out.println("*** displayInventoryView() function has been called");
    }    
    
    private void movement() {
        System.out.println("*** movement() function has been called");
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();
    }

    
}
