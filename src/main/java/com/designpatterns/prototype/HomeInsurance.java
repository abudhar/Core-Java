package com.designpatterns.prototype;

public class HomeInsurance extends InsurancePolicy{
	private String homeSI;
	
	public HomeInsurance(String policyNumber, String policyHolderName, String homeSI) {
		super(policyNumber, policyHolderName);
		this.homeSI = homeSI;
	}

	@Override
	public InsurancePolicy clone() {
		return new HomeInsurance(this.policyNumber, this.policyHolderName, this.homeSI);
	}

}
