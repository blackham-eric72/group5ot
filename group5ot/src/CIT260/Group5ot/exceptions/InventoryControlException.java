/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.exceptions;

/**
 *
 * @author Flores Family
 */
public class InventoryControlException extends Exception {

    public InventoryControlException() {
    }

    public InventoryControlException(String string) {
        super(string);
    }

    public InventoryControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public InventoryControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public InventoryControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
