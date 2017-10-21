/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Flores Family
 */
public class MeatShareControlTest {
    
    public MeatShareControlTest() {
    }

    @Test
    public void testCalcShares() {
        
        //Test Case 1
        
        System.out.println("\tTest case 1");
        
        //input variables
        double meatWeight = 150.00;
        double numAdults = 12.00;
        double numChildren = 8.00;
        
        double expResult = 4.69;
        
        MeatShareControl instance = new MeatShareControl();
        
        double result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.00);
    
        
        //Test Case 2
                
        System.out.println("\tTest case 2");
        
        //input variables
        meatWeight = -1.00;
        numAdults = 12.00;
        numChildren = 8.00;
        
        expResult = -1;
             
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.00);
        
        
        //Test Case 3
                
        System.out.println("\tTest case 3");
        
        //input variables
        meatWeight = 150.00;
        numAdults = -12.00;
        numChildren = 8.00;
        
        expResult = -1;
              
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.00);
        
        
        //Test Case 4
                
        System.out.println("\tTest case 4");
        
        //input variables
        meatWeight = 150.00;
        numAdults = 12.00;
        numChildren = -8.00;
        
        expResult = -1;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.00);
        
        
        //Test Case 5
                
        System.out.println("\tTest case 5");
        
        //input variables
        meatWeight = 150.00;
        numAdults = 34.00;
        numChildren = 8.00;
        
        expResult = -1;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.00);
    
                
        //Test Case 6
                
        System.out.println("\tTest case 6");
        
        //input variables
        meatWeight = 0.00;
        numAdults = -12.00;
        numChildren = 8.00;
        
        expResult = -1;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.00);
       
                
        //Test Case 7
                
        System.out.println("\tTest case 7");
        
        //input variables
        meatWeight = 0.00;
        numAdults = 0.00;
        numChildren = 8.00;
        
        expResult = -1;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.00);
        
                
        //Test Case 8
                
        System.out.println("\tTest case 8");
        
        //input variables
        meatWeight = 150.00;
        numAdults = 0.00;
        numChildren = 0.00;
        
        expResult = -1;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.00);
        
        
        //Test Case 9
                
        System.out.println("\tTest case 9");
        
        //input variables
        meatWeight = 275.00;
        numAdults = 34.00;
        numChildren = 14.00;
        
        expResult = -1;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.00);
    }
    
}
    
    
    
