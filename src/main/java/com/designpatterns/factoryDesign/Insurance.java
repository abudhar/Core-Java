package com.designpatterns.factoryDesign;

public abstract class Insurance {

	protected String insuranceType;
	protected double insuranceAmount;

	public String getInsuranceType() {
		return insuranceType;
	}

	public double getInsuranceCost() {
		return insuranceAmount;
	}
}
