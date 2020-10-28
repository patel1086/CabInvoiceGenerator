package com.bridgelabz.cabinvoice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	InvoiceService invoiceService = null;
	ArrayList<Ride> rides = new ArrayList<Ride>();
	InvoiceSummary expectedInvoiceSummary = null;
	private RideRepositery rideRepositery = null;

	@Before
	public void setUp() throws Exception {
		invoiceService = new InvoiceService();
		rideRepositery = new RideRepositery();
		invoiceService.setRideRepositery(rideRepositery);
		rides.add(new Ride(CabRide.NORMAL, 5, 5));
		rides.add(new Ride(CabRide.PREMIUM, 0.1, 3));
		expectedInvoiceSummary = new InvoiceSummary(2, 60.0);
	}

	@Test
	public void invoiceService() {
		double distance = 5;
		double time = 5;
		double fare = invoiceService.calculateFare(distance, time);
		Assert.assertEquals(55, fare, 0.0);
	}

	@Test
	public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
		double distance = 0.1;
		double time = 3;
		double fare = invoiceService.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}

	@Test
	public void giverUserIdAndRides_ShouldReturnInvoiceSummary() {
		String userId = "jitendra";
//		Ride[] rides = { new Ride(5.0, 5), new Ride(0.1, 3) };
		invoiceService.addRides(userId, rides);
		InvoiceSummary summary = invoiceService.getInvoiceSummary(userId);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 75.0);
		Assert.assertEquals(summary, expectedInvoiceSummary);
	}

	@Test
	public void faltu() {
		Assert.assertEquals(CabRide.PREMIUM, CabRide.PREMIUM);
	}
}
