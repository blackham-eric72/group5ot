/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

/**
 *
 * @author erict.blackham
 */
public class Location2View extends View {
     public Location2View() {
            super( "\n|| -------------------------------------------- ||"
                 + "\n||                                              ||"
                 + "\n|| You are now at Kansas City, Missouri.        ||"
                 + "\n|| You are enjoying the crisp air and trail!    ||"
                 + "\n|| Here you have the opportunity to eat!        ||"
                
                 + "\n|| ******************************************** ||"
                 + "\n|| Press C to continue                          ||"
                 + "\n|| Press G to display the Game Menu.            ||"
                 + "\n|| -------------------------------------------- ||");

        }
   

//    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "C":
                this.nextView();
                break;
            case "G": // return to previous screen
                this.displayGameMenuView();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    
    
    //This will take them to the trading post view. 
    private void nextView() {
        
        EatingView eat = new EatingView();
        eat.display();    
    
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();  
    }


    
}

