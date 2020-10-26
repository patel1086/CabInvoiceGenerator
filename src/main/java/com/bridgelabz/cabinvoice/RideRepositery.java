package com.bridgelabz.cabinvoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RideRepositery {	
	HashMap<String,ArrayList<Ride>> userRides=null;

	public RideRepositery() {
		this.userRides = userRides;
	}

	public void addRides(String userId, Ride[] rides) {
		ArrayList<Ride> rideList=this.userRides.get(userId);
		if(rideList==null) {
			this.userRides.put(userId,new ArrayList<Ride>(Arrays.asList(rides)));
		}
		
	}

	public Ride[] getRides(String userId) {
		return this.userRides.get(userId).toArray(new Ride[0]);
	}
	
}
