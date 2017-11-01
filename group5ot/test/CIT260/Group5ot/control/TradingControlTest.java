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
public class TradingControlTest {
    
    public TradingControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcTotal method, of class TradingControl.
     */
    @Test
    public void testCalcTotal() {
        System.out.println("calcTotal");
        
        /******************************
         *  Test case #1
         *****************************/
        System.out.println("\tTest case #1");        //tests valid inputs
        
        double itemAmountA = 15.0;
        double itemAmountB = 30.0;
        double itemPriceX = 0.28;
        double itemPriceY = 0.17;
        
        // create instance of TradingControl class
        TradingControl instance = new TradingControl();
        
        double expResult = 9.30;    //expected output returned value
        
        //call function to run test
        double result = instance.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
        
        //compare expected result return value with actual value returned
        assertEquals(expResult, result, 0.0001);       
        
        /******************************
         *  Test case #2
         *****************************/
        System.out.println("\tTest case #2");        //tests too low input for 1st parameter
        
        itemAmountA = -15.0;
        itemAmountB = 30.0;
        itemPriceX = 0.28;
        itemPriceY = 0.17;
        
        expResult = -1;    //expected output returned value
        
        //call function to run test
        result = instance.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
        
        //compare expected result return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /******************************
         *  Test case #3
         *****************************/
        System.out.println("\tTest case #3");        //tests too low input for 2nd parameter
        
        itemAmountA = 15.0;
        itemAmountB = -30.0;
        itemPriceX = 0.28;
        itemPriceY = 0.17;
                
        expResult = -1;    //expected output returned value
        
        //call function to run test
        result = instance.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
        
        //compare expected result return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /******************************
         *  Test case #4
         *****************************/
        System.out.println("\tTest case #4");       //tests too high input 3rd parameter
        
        itemAmountA = 15.0;
        itemAmountB = 30.0;
        itemPriceX = 280.0;
        itemPriceY = 0.17;
        
        expResult = -1;    //expected output returned value
        
        //call function to run test
        result = instance.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
        
        //compare expected result return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /******************************
         *  Test case #5
         *****************************/
        System.out.println("\tTest case #5");       //tests too high input 4th parameter
        
        itemAmountA = 15.0;
        itemAmountB = 30.0;
        itemPriceX = .28;
        itemPriceY = 170.0;
                
        expResult = -1;    //expected output returned value
        
        //call function to run test
        result = instance.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
        
        //compare expected result return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /******************************
         *  Test case #6
         *****************************/
        System.out.println("\tTest case #6");       //tests too low input for parameters 1 & 2
        
        
        itemAmountA = 0.0;
        itemAmountB = -10.0;
        itemPriceX = 0.28;
        itemPriceY = 0.17;
        
        expResult = -1;    //expected output returned value
        
        //call function to run test
        result = instance.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
        
        //compare expected result return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /******************************
         *  Test case #7
         *****************************/
        System.out.println("\tTest case #7");       //tests upper boundary 
        
        itemAmountA = 100.0;
        itemAmountB = 30.0;
        itemPriceX = 0.28;
        itemPriceY = 0.17;
        
        expResult = -1;    //expected output returned value
        
        //call function to run test
        result = instance.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
        
        //compare expected result return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /******************************
         *  Test case #8
         *****************************/
        System.out.println("\tTest case #8");       //tests upper boundary of first part of equation
        
        itemAmountA = 150.0;
        itemAmountB = 30.0;
        itemPriceX = 280;
        itemPriceY = 0.17;
        
        expResult = -1;    //expected output returned value
        
        //call function to run test
        result = instance.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
        
        //compare expected result return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /******************************
         *  Test case #9
         *****************************/
        System.out.println("\tTest case #9");       //tests lower boundary
        
        itemAmountA = 100.0;
        itemAmountB = 30.0;
        itemPriceX = -0.28;
        itemPriceY = -0.17;
        
        expResult = -1;    //expected output returned value
        
        //call function to run test
        result = instance.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
        
        //compare expected result return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /******************************
         *  Test case #10
         *****************************/
        System.out.println("\tTest case #10");      //test valid boundaries
        
        itemAmountA = 20.0;
        itemAmountB = 45.0;
        itemPriceX = 0.32;
        itemPriceY = 0.15;
        
        expResult = 13.15;    //expected output returned value
        
        //call function to run test
        result = instance.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
        
        //compare expected result return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
    }

    /** 
     * Test of checkListInput method, of class TradingControl.
    
    @Test
    public void testCheckListInput() {
        System.out.println("checkListInput");
        String[] tradeList = null;
        String testValue = "";
        String expResult = "";
        String result = TradingControl.checkListInput(tradeList, testValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */
    
}
