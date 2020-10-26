package com.bridgelabz.cabinvoice;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
	 @Test
	    public void givenDistanceAndTime_ShouldReturnTotalFare() {
	        double distance = 5;
	        double time = 5;
	        double fare = cabInvoiceGenerator.calculateFare(distance, time);
	        Assert.assertEquals(55, fare,0.0);
	    }

}
