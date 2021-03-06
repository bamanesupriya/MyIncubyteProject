package calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.*;
import junit.framework.Assert;



import org.junit.jupiter.api.*;


import org.junit.jupiter.api.Assertions.*;

class TestCalculate {

	private StringCalculator calculator;
	
    @Test
    public void init() {
    	calculator=new StringCalculator();
    }
    @Test
    void emptyStringReturns0() {
        
    	try {
    		StringCalculator stringCalculator = new StringCalculator();
			assertEquals(0, stringCalculator.add(""));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    @Test
    void stringSingleNumberReturnNumber() {
        
        try {
        	StringCalculator stringCalculator = new StringCalculator();
			assertEquals(1, stringCalculator.add("1"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
   
    @Test
    public void twoNumbersCommaDelimitedReturnSum() {
    	
    	try {
			//assertEquals(calculator.add("1,2"),3);
    		StringCalculator stringCalculator = new StringCalculator();
			assertEquals(3, stringCalculator.add("1,2"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }
    @Test
    public void twoNumbersNewLineDelimitedReturnSum() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(3, stringCalculator.add("1\n2"));
    	
    }
    @Test
    public void threeNumbersDelimitedBothWaysReturnSum() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(6, stringCalculator.add("1,2,3"));
    	
    }
    @Test 
    public void negativeInputReturnsException() {
    	
    	Assertions.assertThrows(RuntimeException.class,() -> calculator.add("-1"));
    }
    
    public void ignoresNumberGreaterThan1000() throws Exception {
    	assertEquals(calculator.add("10,10,1001"),20);
    }
    
}