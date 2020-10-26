package com.bridgelabz.cabinvoice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	CabInvoiceGenerator cabInvoiceGenerator=null;
	
	@Before
	public void setUp() throws Exception{
		cabInvoiceGenerator = new CabInvoiceGenerator();
	}
	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 5;
		double time = 5;
		double fare = cabInvoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(55, fare, 0.0);
	}

	@Test
	public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
		double distance = 0.1;
		double time = 3;
		double fare = cabInvoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}

//	@Test
//	public void givenMultipleRides_ShouldReturnTotalFare() {
//		Ride[] rides = { new Ride(5.0, 5), new Ride(.1, 3) };
//		double fare = cabInvoiceGenerator.calculateFare(rides);
//		Assert.assertEquals(60, fare, 0.0);
//	}
	
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		Ride[] rides = { new Ride(5.0, 5), new Ride(.1, 3) };
		InvoiceSummary summary = cabInvoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary=new InvoiceSummary(2,60.0);
		Assert.assertEquals(summary, expectedInvoiceSummary);
	}

}
