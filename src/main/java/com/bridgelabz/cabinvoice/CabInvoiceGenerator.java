package com.bridgelabz.cabinvoice;

public class CabInvoiceGenerator {

	private static final double COST_PER_KM = 10.0;
	private static final double COST_PER_MINUTE = 1.0;
	private static final double MINIMUM_FARE = 5.0;

	public double calculateFare(double distance, double time) {
		double totalFare = distance * COST_PER_KM + time * COST_PER_MINUTE;
		return Math.max(totalFare, MINIMUM_FARE);

	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length,totalFare);
	}

}
