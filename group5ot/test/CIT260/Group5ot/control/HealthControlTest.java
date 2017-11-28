/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.exceptions.HealthControlException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Flores Family
 */
public class HealthControlTest {
    
    public HealthControlTest() {
    }

    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
     

    /**
     * Test of calcHealthDecrease method, of class HealthControl.
     */
    @Test
    public void testCalcHealthDecrease() throws HealthControlException {
   
        //Test Case 1
        
        System.out.println("\t calcHealthDecrease Test case 1");
        
        //input variables
        double healthLevel = 55;
        
        double expResult = 50;
        
        HealthControl instance = new HealthControl();
        
        double result = instance.calcHealthDecrease(healthLevel);
        
        assertEquals(expResult, result, 0);
        
        
        //Test Case 2
        
        System.out.println("\t calcHealthDecrease Test case 2");
        
        //input variables
        healthLevel = 101;
        
        expResult = -1;
              
        result = instance.calcHealthDecrease(healthLevel);
        
        assertEquals(expResult, result, 0);
        
        
        //Test Case 3
        
        System.out.println("\t calcHealthDecrease Test case 3");
        
        //input variables
        healthLevel = -5;
        
        expResult = -1;
              
        result = instance.calcHealthDecrease(healthLevel);
        
        assertEquals(expResult, result, 0);
        
        
        //Test Case 4
        
        System.out.println("\t calcHealthDecrease Test case 4");
        
        //input variables
        healthLevel = 100;
        
        expResult = 95;
              
        result = instance.calcHealthDecrease(healthLevel);
        
        assertEquals(expResult, result, 0);
        
        
        //Test Case 5
        
        System.out.println("\t calcHealthDecrease Test case 5");
        
        //input variables
        healthLevel = 1;
        
        expResult = 0;
              
        result = instance.calcHealthDecrease(healthLevel);
        
        assertEquals(expResult, result, 0); 
    }

    
       /**
     * Test of calcHealthIncrease method, of class HealthControl.
     */
    
    @Test
    public void testCalcHealthIncrease() throws HealthControlException {
        //Test Case 1
        
        System.out.println("\t calcHealthIncrease Test case 1");
        
        //input variables
        double healthLevel = 55;
        
        double expResult = 60;
        
        HealthControl instance = new HealthControl();
        
        double result = instance.calcHealthIncrease(healthLevel);
        
        assertEquals(expResult, result, 0);
        
        
        //Test Case 2
        
        System.out.println("\t calcHealthIncrease Test case 2");
        
        //input variables
        healthLevel = 101;
        
        expResult = -1;
               
        result = instance.calcHealthIncrease(healthLevel);
        
        assertEquals(expResult, result, 0);
        
        
        //Test Case 3
        
        System.out.println("\t calcHealthIncrease Test case 3");
        
        //input variables
        healthLevel = -5;
        
        expResult = -1;
               
        result = instance.calcHealthIncrease(healthLevel);
        
        assertEquals(expResult, result, 0);
        
        
        //Test Case 4
        
        System.out.println("\t calcHealthIncrease Test case 4");
        
        //input variables
        healthLevel = 100;
        
        expResult = 100;
               
        result = instance.calcHealthIncrease(healthLevel);
        
        assertEquals(expResult, result, 0); 
        
        
        //Test Case 5
        
        System.out.println("\t calcHealthIncrease Test case 5");
        
        //input variables
        healthLevel = 1;
        
        expResult = 6;
               
        result = instance.calcHealthIncrease(healthLevel);
        
        assertEquals(expResult, result, 0); 
    }
    
    
    /**
     * Test of calcStatus method, of class HealthControl.
     */
    @Test
    public void testCalcStatus() {
        
         //Test Case 1
        
        System.out.println("\t calcStatus Test case 1");
        
        double healthLevel = 45;
        
        HealthControl instance = new HealthControl();
        
        String expResult = "weakening";
        
        String result = instance.calcStatus(healthLevel);
        
        assertEquals(expResult, result);
        
        
         //Test Case 2
        
        System.out.println("\t calcStatus Test case 2");
        
        healthLevel = 101;
             
        expResult = "error";
        
        result = instance.calcStatus(healthLevel);
        
        assertEquals(expResult, result);
        
        
        //Test Case 3
        
        System.out.println("\t calcStatus Test case 3");
        
        healthLevel = -5;
             
        expResult = "error";
        
        result = instance.calcStatus(healthLevel);
        
        assertEquals(expResult, result);
        
        
        //Test Case 4
        
        System.out.println("\t calcStatus Test case 4");
        
        healthLevel = 100;
             
        expResult = "healthy";
        
        result = instance.calcStatus(healthLevel);
        
        assertEquals(expResult, result);
        
        
        //Test Case 5
        
        System.out.println("\t calcStatus Test case 5");
        
        healthLevel = 0;
             
        expResult = "dead";
        
        result = instance.calcStatus(healthLevel);
        
        assertEquals(expResult, result);
        
        
        //Test Case 6
        
        System.out.println("\t calcStatus Test case 5");
        
        healthLevel = 24;
             
        expResult = "dying";
        
        result = instance.calcStatus(healthLevel);
        
        assertEquals(expResult, result);

    }
    
}
