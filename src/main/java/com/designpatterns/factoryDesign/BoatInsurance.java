package com.designpatterns.factoryDesign;

public class BoatInsurance extends Insurance {
	@Override
	public double getInsuranceCost() {
		return 1000;
	}

	@Override
	public String getInsuranceType() {
		return "Boat Insurance";
	}

}
