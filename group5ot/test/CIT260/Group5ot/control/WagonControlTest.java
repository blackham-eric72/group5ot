/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ken
 */
public class WagonControlTest {
    
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
     */
    @Test
    public void testCalcWagonCargoWeight() {
        System.out.println("calcWagonCargoWeight");
        
        // ---Test Case 1 ---
        System.out.println("\tTest case 1");
        
        // input values for test case 1
        long numAdults = 2;
        long numChildren = 2;
        double foodWeight = 34;
        double waterWeight = 80;
        
        double expResult = 514; // expected output returned value
        
        // create instance of WagonControl class
        WagonControl instance = new WagonControl();

        // call function to run test
        double result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);

        
        
        // ---Test Case 2 ---
        System.out.println("\tTest case 2");
        
        // input values for test case 2
        numAdults = 5;
        numChildren = 4;
        foodWeight = -9;
        waterWeight = 56;
        
        expResult = -1; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);       
        
  
        
        // ---Test Case 3 ---
        System.out.println("\tTest case 3");
        
        // input values for test case 3
        numAdults = -7;
        numChildren = 5;
        foodWeight = 150;
        waterWeight = -8;
        
        expResult = -1; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);    
                
  
        
        // ---Test Case 4 ---
        System.out.println("\tTest case 4");
        
        // input values for test case 4
        numAdults = 6;
        numChildren = -6;
        foodWeight = 150;
        waterWeight = 34;
        
        expResult = -1; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0); 
        
  
        
        // ---Test Case 5 ---
        System.out.println("\tTest case 5");
        
        // input values for test case 5
        numAdults = 0;
        numChildren = 4;
        foodWeight = 0;
        waterWeight = 350;
        
        expResult = 550; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);    
        
  
        
        // ---Test Case 6 ---
        System.out.println("\tTest case 6");
        
        // input values for test case 6
        numAdults = 4;
        numChildren = 0;
        foodWeight = 200;
        waterWeight = 0;
        
        expResult = 800; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0); 
                
  
        
        // ---Test Case 7 ---
        System.out.println("\tTest case 7");
        
        // input values for test case 7
        numAdults = 4;
        numChildren = 4;
        foodWeight = 200;
        waterWeight = 350;
        
        expResult = 1350; // expected output returned value

        // call function to run test
        result = instance.calcWagonCargoWeight(numAdults, numChildren, foodWeight, waterWeight);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0); 
    }
    
}
