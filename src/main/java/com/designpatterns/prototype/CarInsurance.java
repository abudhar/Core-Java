package com.designpatterns.prototype;

public class CarInsurance extends InsurancePolicy {
	private String regNo;

	public CarInsurance(String policyNumber, String policyHolderName, String regNo) {
		super(policyNumber, policyHolderName);
		this.regNo = regNo;
	}

	@Override
	public InsurancePolicy clone() {
		return new CarInsurance(this.policyNumber, this.policyHolderName, this.regNo);
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

}
