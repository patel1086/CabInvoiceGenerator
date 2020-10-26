package com.bridgelabz.cabinvoice;

public class CabInvoiceGenerator {

	private static final double FARE_PER_KM = 10.0;
	private static final double FARE_PER_MINUTE = 1.0;

	public double calculateFare(double distance, double time) {
		return distance*FARE_PER_KM + time*FARE_PER_MINUTE;
	}

}
