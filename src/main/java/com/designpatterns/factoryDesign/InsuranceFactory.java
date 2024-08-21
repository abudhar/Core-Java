package com.designpatterns.factoryDesign;

public class InsuranceFactory {
	
	public static Insurance getInsurance(String type){
		switch (type) {
		case "CAR":
			return new CarInsurance();
		case "BIKE":
			return new BikeInsurance();
		case "BOAT":
			return new BoatInsurance();
		}
		return null;
	}

}
