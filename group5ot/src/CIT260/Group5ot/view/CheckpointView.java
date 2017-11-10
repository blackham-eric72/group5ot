/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import java.util.Scanner;
import CIT260.Group5ot.control.GameControl;
import group5ot.Group5ot;
/**
 *
 * @author Flores Family
 */
public class CheckpointView extends View {
    /*public class MainMenuView
    {*/
        private String promptMessage;
                

        public CheckpointView() {
            super( "\n Would you like to..."
                        + "\n--------------------------"
                        + "\nL - Look around?"
                        + "\nH - Hunt?"
                        + "\nB - Buy Supplies?"
                        + "\nR - Rest?"
                        + "\nC - Continue moving forward?"
                        + "\nG - Go to Game Menu"
                        + "\n--------------------------");
        }
   
//    Moved to "View.java" class 
//    public void displayCheckpointView() {
//       
//        boolean done = false; // set flag to not done
//        do {
//            // prompt for and get players name
//            String menuOption = this.getMenuOption();
//            if (menuOption.toUpperCase().equals("X")) // user wants to quit
//                return; // exit the game
//            
//            // do the requested action and display the next view
//            done = this.doAction(menuOption);
//            
//        } while (!done);
//        
//    }
//
//    private String getMenuOption() {
//        
//        this.promptMessage = 
//                        
//                       
//                         "\n" + menu;
//               
//        
//        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
//        String value = ""; // value to be returned
//        boolean valid = false; //initilaize to not valid
//        
//        while (!valid) { // loop while an invalid value is entered
//            System.out.println("\n" + this.promptMessage);
//            
//            value = keyboard.nextLine(); // get next line typed on keyboard 
//            value = value.trim(); //trim off leading and trailing blanks
//            
//             if ("L".equals(value) || "H".equals(value) || "B".equals(value) || "R".equals(value) || "C".equals(value)) { //check for valid values
//               break; 
//            }
//            else {
//                 System.out.println("\nInvalid value: Must input L, H, B, or C");
//            }          
//        }
//        
//        return value; // return the value entered
//    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "L": 
                this.lookAround();
                break;
            case "H": 
                this.hunt();
                break;
            case "B": 
                this.buySupplies();
                break;
            case "R": 
                this.rest();
                break;
            case "C":
                this.displayMoveView();
                break;
            case "G":
                this.displayGameMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void lookAround() {
        LookAroundCheckpointView lookAroundCheckpointView = new LookAroundCheckpointView();
                
        // Display the help menu view
        lookAroundCheckpointView.display();    }

    private void hunt() {
        //Create ToHuntOrNotToHuntView object
        ToHuntOrNotToHuntView toHuntOrNotToHuntView = new ToHuntOrNotToHuntView();
                
        // Display the help menu view
        toHuntOrNotToHuntView.display();    }

    private void buySupplies() {
        TradingpostMenuView tradingpostMenuView = new TradingpostMenuView();
                
        // Display the help menu view
        tradingpostMenuView.display();
    }

    private void rest() {
        RestView restView = new RestView();
                
        // Display the help menu view
        restView.displayRestView();    
    }

    private void displayMoveView() {
        //Create move object
        MoveView moveView = new MoveView();
        
        //display move view
        moveView.displayMoveView();    
    }

    private void displayGameMenu() {
        //Create Game menu object
        GameMenuView gameMenuView = new GameMenuView();
                
        // Display the Game menu view
        gameMenuView.display();
    }

 
    
}