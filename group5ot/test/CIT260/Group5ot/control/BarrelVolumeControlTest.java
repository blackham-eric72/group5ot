/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crims
 */
public class BarrelVolumeControlTest {
    
    public BarrelVolumeControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalcBarrelVolume() {
        System.out.println("calcBarrelVolume");
        
        // ---Test Case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        double height = 12;
        double radius = 36;
        
        double expResult = 9.42; // expected result 
        
        //create instance of BarrelVolumeControl
        BarrelVolumeControl instance = new BarrelVolumeControl(); 
        
        // call the method
        double result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);    
        
        
        // ---Test Case 2 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        height = 36;
        radius = -1;
        
        expResult = 0.07; // expected result        
                
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        
        
        // ---Test Case 3 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        height = -36;
        radius = 12;
        
        expResult = -9.42; // expected result 
        
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        
        // ---Test Case 4 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        height = 36;
        radius = 100;
        
        expResult = 654.50; // expected result 
        
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        
        // ---Test Case 5 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        height = 0;
        radius = 18;
        
        expResult = .00; // expected result 
        
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        
        // ---Test Case 6 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        height = 60;
        radius = 0;
        
        expResult = 0; // expected result 
        
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        
        // ---Test Case 7 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        height = 60;
        radius = 18;
        
        expResult = 35.34; // expected result 
        
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        fail("The test case is a prototype.");
    }
    
}
