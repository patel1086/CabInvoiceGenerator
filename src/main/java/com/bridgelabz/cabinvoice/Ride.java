package com.bridgelabz.cabinvoice;

public class Ride {

	public double distance;
	public int time;

	public CabRide cabRide;

	public Ride(CabRide ride, double distance, int time) {
		this.cabRide = ride;
		this.distance = distance;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Ride [distance=" + distance + ", time=" + time + ", cabRide=" + cabRide + "]";
	}

}