/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import group5ot.Group5ot;
import java.io.PrintWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erict.blackham
 */
public class InventoryControlTest {
    
    protected final PrintWriter console = Group5ot.getOutFile();    

    
    public InventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addInventoryItem method, of class InventoryControl.
     */
    @Test
    public void testAddInventoryItem() {
       //Test Case 1
        
        this.console.println("\t add inventory test case 1");
        
        //input variables
        double itemQuantity =5;
        
        double expResult = 6;
        
                
        double result = InventoryControl.addInventoryItem(itemQuantity);
        
        assertEquals(expResult, result, 0.01);
        
        
             //Test Case 2
        
        this.console.println("\t addInventoryItem Test case 2");
        
        //input variables
        itemQuantity = 31;
        
        expResult = -1;
              
        result = InventoryControl.addInventoryItem(itemQuantity);
        
        assertEquals(expResult, result, 0.01);
        
        //Test Case 3
        
        this.console.println("\t addInventoryItem Test case 3");
        
        //input variables
        itemQuantity = -16;
        
        expResult = -1;
              
        result = InventoryControl.addInventoryItem(itemQuantity);
        
        assertEquals(expResult, result, 0.01);
        
        
    //Test Case 4 (upper boundary)
        
        this.console.println("\t addInventoryItem Test case 4");
        
        //input variables
        itemQuantity = 29;
        
        expResult = 30;
              
        result = InventoryControl.addInventoryItem(itemQuantity);
        
        assertEquals(expResult, result, 0.01);     
        
        
        
        //Test Case 5 (lower boundary)
        
        this.console.println("\t addInventoryItem Test case 5");
        
        //input variables
        itemQuantity = 0;
        
        expResult = 1;
              
        result = InventoryControl.addInventoryItem(itemQuantity);
        
        assertEquals(expResult, result, 0.01); 
        
       
        
    }

    /**
     * Test of decreaseInventoryItem method, of class InventoryControl.
     */
    @Test
    public void testDecreaseInventoryItem() {
        
        //Test Case 1
        
        this.console.println("\t decrease inventory test case 1");
        
        //input variables
        double itemQuantity =5;
        
        double expResult = 4;
        
        InventoryControl instance = new InventoryControl();
        
        double result = InventoryControl.decreaseInventoryItem(itemQuantity);
        
        assertEquals(expResult, result, 0);
        
        
             //Test Case 2 (invalid - too high)
        
        this.console.println("\t decrease inventory Test case 2(invalid)");
        
        //input variables
        itemQuantity = 38;
        
        expResult = -1;
              
        result = InventoryControl.decreaseInventoryItem(itemQuantity);
        
        assertEquals(expResult, result, 0);
        
        //Test Case 3 invalid - too low
        
        this.console.println("\t decrease InventoryItem Test case 4 (invalid)");
        
        //input variables
        itemQuantity = -30;
        
        expResult = -1;
              
        result = InventoryControl.decreaseInventoryItem(itemQuantity);
        
        assertEquals(expResult, result, 0);
        
        
    //Test Case 4 (upper boundary)
        
        this.console.println("\t decrease InventoryItem Test case 4(upper boundary)");
        
        //input variables
        itemQuantity = 30;
        
        expResult = 29;
              
        result = InventoryControl.decreaseInventoryItem(itemQuantity);
        
        assertEquals(expResult, result, 0);     
        
        
        
        //Test Case 5 (lower boundary)
        
        this.console.println("\t decrease inventory item Test case 5(lower boundary)");
        
        //input variables
        itemQuantity = 1;
        
        expResult = 0;
              
        result = InventoryControl.decreaseInventoryItem(itemQuantity);
        
        assertEquals(expResult, result, 0); 
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
