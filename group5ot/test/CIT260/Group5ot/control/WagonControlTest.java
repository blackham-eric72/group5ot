/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.exceptions.WagonControlException;
import group5ot.Group5ot;
import java.io.PrintWriter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ken
 */
public class WagonControlTest {
    
    protected final PrintWriter console = Group5ot.getOutFile();    

    
    public WagonControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcWagonCargoWeight method, of class WagonControl.
     * @throws CIT260.Group5ot.exceptions.WagonControlException
     */
    @Test
    public void testCalcWagonCargoWeight() throws WagonControlException {
        this.console.println("calcWagonCargoWeight");
        
        // ---Test Case 1 ---
        this.console.println("\tTest case 1");
        
        // input values for test case 1
        int numAdults = 2;
        int numChildren = 2;
        double foodWeight = 34;
        double waterWeight = 80;
        double meatWeight = 140;
        
        double expResult = 654; // expected output returned value
        
        // create instance of WagonControl class
        WagonControl instance = new WagonControl();

        // call function to run test
        double result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, meatWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);

        
        
        // ---Test Case 2 ---
        this.console.println("\tTest case 2");
        
        // input values for test case 2
        numAdults = 5;
        numChildren = 4;
        foodWeight = -9;
        waterWeight = 56;
        meatWeight = 140;
        
        expResult = -1; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, meatWeight, waterWeight);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);       
        
  
        
        // ---Test Case 3 ---
        this.console.println("\tTest case 3");
        
        // input values for test case 3
        numAdults = -7;
        numChildren = 5;
        foodWeight = 150;
        waterWeight = -8;
        meatWeight = 140;
        
        expResult = -1; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, meatWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);    
                
  
        
        // ---Test Case 4 ---
        this.console.println("\tTest case 4");
        
        // input values for test case 4
        numAdults = 6;
        numChildren = -6;
        foodWeight = 150;
        waterWeight = 34;
        meatWeight = 140;
        
        expResult = -1; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, meatWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0); 
        
  
        
        // ---Test Case 5 ---
        this.console.println("\tTest case 5");
        
        // input values for test case 5
        numAdults = 0;
        numChildren = 4;
        foodWeight = 0;
        waterWeight = 350;
        meatWeight = 140;
        
        expResult = 690; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, meatWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);    
        
  
        
        // ---Test Case 6 ---
        this.console.println("\tTest case 6");
        
        // input values for test case 6
        numAdults = 4;
        numChildren = 0;
        foodWeight = 200;
        waterWeight = 0;
        meatWeight = 0;
        
        expResult = 800; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, meatWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0); 
                
  
        
        // ---Test Case 7 ---
        this.console.println("\tTest case 7");
        
        // input values for test case 7
        numAdults = 4;
        numChildren = 4;
        foodWeight = 200;
        waterWeight = 350;
        meatWeight = 250;
        
        expResult = 1600; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, meatWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0); 
    }
    
}
