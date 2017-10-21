/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

/**
 *
 * @author crims
 */
public class TradingControl {
    
  /*  public static String checkListInput(String[] tradeList, String testValue){
    
       
        for(int i=0; i< tradeList.length; i++){
           
           if (tradeList[i] == testValue){         
               return "valid item";
           }
           
            if (tradeList[i] != testValue){
                return "invalid item";
            }  
            
        }    
        
        return testValue;
    }
    */
    
    public double calcTotal(double itemAmountA, double itemAmountB, double itemPriceX, double itemPriceY ){        
       
    
            if (itemAmountA < 0 || itemAmountA > 99){ //itemAmount is not negative or more than 99
                return -1;
            }   
            
            if (itemAmountB < 0 || itemAmountB > 99){ //itemAmount is not negative or more than 99
                return -1;
            } 
            
            if (itemPriceX < 0 || itemPriceX > 99){  //itemPrice is not negative or more than 99
                return -1;                        
            }
            
            if (itemPriceY < 0 || itemPriceY > 99){  //itemPrice is not negative or more than 99
                return -1;                        
            }
            
            
        double total = (itemAmountA * itemPriceX) + (itemAmountB * itemPriceY); 
        
            return total;
                
            
   
            
       
    }
       
}
