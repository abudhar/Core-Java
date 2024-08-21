package com.designpatterns.factoryDesign;

public class BikeInsurance extends Insurance {
	@Override
	public double getInsuranceCost() {
		return 100;
	}
	
	@Override
	public String getInsuranceType() {
		return "Bike Insurance";
	}
}
