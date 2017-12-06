/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;
import CIT260.Group5ot.model.Player;
/**
 *
 * @author erict.blackham
 */
public class FirstView extends View {
    
   
              

        public FirstView() {
            super( "\n|| -------------------------------------------- ||"
                 + "\n||                                              ||"
                 + "\n|| You are now at Independence, Missouri.       ||"
                 + "\n|| This is the starting location of the game!   ||"
                 + "\n|| Before you get started on your journey,      ||"
                 + "\n|| you'll want to get some supplies at the      ||"
                 + "\n|| trading postOnce you are all set there - Bon ||"
                 + "\n|| Voyage - as the French like to say!          ||"
                 + "\n|| ******************************************** ||"
                 + "\n|| Press C to continue on to the trading post.  ||"
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
        TradingpostMenuView tradingpostMenuView = new TradingpostMenuView();
        tradingpostMenuView.display();    
    
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();  
    }


    
}
