/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

/**
 *
 * @author Flores Family
 */
public class TradingPostView extends View{
    
    public TradingPostView() {
       super( "\n You see a trading post. "
            + "\nPress T to go inside."
            + "\nPress C to keep moving forward."
            + "\nPress G to display the Game Menu.");

   }
   

//    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "T":
                this.displayTradingPostMenuView();
                break;
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

    private void displayTradingPostMenuView() {
        TradingpostMenuView tradingpostMenuView = new TradingpostMenuView();
       
        tradingpostMenuView.display();    
    }

    private void nextView() {
        this.console.println("\n*** Chuck Norris has been to Mars. That's why there are no signs of life. Brought to you by the NextView().");
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();    
    }
}
