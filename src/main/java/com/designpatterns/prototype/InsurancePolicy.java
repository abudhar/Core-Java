package com.designpatterns.prototype;

public abstract class InsurancePolicy implements ProtoType {
	protected String policyNumber;
	protected String policyHolderName;

	public InsurancePolicy(String policyNumber, String policyHolderName) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	@Override
	public abstract InsurancePolicy clone();
}