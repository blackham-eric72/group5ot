///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package CIT260.Group5ot.view;
//
//import CIT260.Group5ot.control.HealthControl;
//import CIT260.Group5ot.exceptions.HealthControlException;
//import CIT260.Group5ot.model.Health;
//import CIT260.Group5ot.model.Character;
//import CIT260.Group5ot.enums.CharacterType;
//import java.io.Console;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
///**
// *
// * @author crims
// */
//public class HealthView extends View {
//    
//        private String promptMessage;
//        private String characterType;
//    
//    public HealthView(){
//        
//        super("\n|| ********   HEALTH MENU   ******** ||"
//                +"\n||                                ||"
//                +"\n||    V - View Health Status      ||"
//                +"\n||    P - Print Health Report     ||"
//                +"\n||    G - Return to Game Menu     ||"
//                +"\n||                                ||"
//                +"\n||********************************||");
//    }
//    
//    @Override
//    public boolean doAction(String choice) {
//        //Console console = System.console();
//    
//        
//        choice = choice.toUpperCase();
//        
//        switch (choice) {
//            case "V": {
//                try {       // display health status
//                    try {
//                        this.displayHealthStatus();
//                    } catch (IOException ex) {
//                        this.console.println("Not sure if this is right.");
//                    }   
//                } catch (HealthControlException ex) {
//                    ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());
//                }
//                
//            case "P":  {
//                try {       // print health report
//                    try{
//                        this.printHealthReport();
//                    } catch (IOException ex) {
//                        this.console.println("Not sure about this either.");
//                } catch (HealthControlException ex) {
//                    ErrorView.display(this.getClass().getName(), "Error reading input: " +ex.getMessage()):
//                }
//            
//            case "G":  //return to Game Menu
//                this.displayGameMenuView();
//                break;
//            default:
//                this.console.println("\n*** Invalid selection *** Try again");
//                break;
//        }
//        
//        return false;
//    }
//
//    public void displayHealthStatus() throws HealthControlException, IOException {
//        
//        HealthControl displayHealthStatusFunction = new HealthControl();
//        
//        
//        
//    }
//        
//    }
//
//    public void printHealthReport(ArrayList<CharacterType> character, String outputHealthReport)throws HealthControlException, IOException {        
//        try (PrintWriter out = new PrintWriter(outputHealthReport)) {
//
//            out.println("\n\n              Health Report                     ");
//            out.printf("%n%-20s%10d%15s", "Name", "Level", "Status");
//            out.printf("%n%-20s%10d%15s", "----", "-----", "------");
//
//            for (Character character : characterType) {
//                out.printf("%n%-20s%10d%15s", character.getDescription()
//                                            , character.getHealthLevel()
//                                            , character.getHealthStatus());
//            }
//        } catch (IOException ex) {
//                    System.out.println("I/O Error: " + ex.getMessage());
//        }
//    }
//
//
//
//        GameMenuView gameMenuView = new GameMenuView();
//        
//        gameMenuView.display();
//
//    
//    }
//
//    private void displayGameMenuView() {
//        GameMenuView gameMenuView = new GameMenuView();
//        
//        gameMenuView.display();
//    }
//}
//}