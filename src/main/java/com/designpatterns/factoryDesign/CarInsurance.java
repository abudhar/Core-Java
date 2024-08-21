package com.designpatterns.factoryDesign;

public class CarInsurance extends Insurance {
	@Override
	public double getInsuranceCost() {
		return 500;
	}
	
	@Override
	public String getInsuranceType() {
		return "Car Insurance";
	}
}
