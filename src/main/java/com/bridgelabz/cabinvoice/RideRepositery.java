package com.bridgelabz.cabinvoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RideRepositery {
	public static HashMap<String, List<Ride>> userRides;

	public RideRepositery() {
		this.userRides = new HashMap<String, List<Ride>>();
	}

	public void addRides(String userID, List<Ride> rides) {
		try {
			if (userID == null || rides == null) {
				throw new NullPointerException("Null value not allowed");
			}
			if (userRides.containsKey(userID)) {
				System.out.println("if");
				for (Ride rides1 : rides) {
					userRides.get(userID).add(rides1);

				}

			} else {
				userRides.put(userID, rides);
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	public List<Ride> getRides(String userId) {
		return this.userRides.get(userId);
	}

}
