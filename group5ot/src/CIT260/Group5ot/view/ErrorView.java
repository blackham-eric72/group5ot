/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import group5ot.Group5ot;
import java.io.PrintWriter;

/**
 *
 * @author Flores Family
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Group5ot.getOutFile();
    private static final PrintWriter logFile = Group5ot.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println(
                            "------------------------------"
                          + "\n - ERROR - " + errorMessage
                          + "\n -------GET OUT FILE-------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
}
