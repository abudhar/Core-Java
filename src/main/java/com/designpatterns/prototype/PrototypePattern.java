package com.designpatterns.prototype;

public class PrototypePattern {
	/*
	 * 1. create the Object class by impl Cloneable
	 * 2. override the clone method and provoide logic to clone the same object
	 * 3. store in static Map<String, Object> to implement cache not to crete multiple times
	 */
	
	public static void main(String[] args) {
		CarInsurance carInsurance = new CarInsurance("123", "Ghifari", "A1B2C3");
		InsurancePolicy carInsClone = carInsurance.clone();
		HomeInsurance homeInsurance = new HomeInsurance("456", "ABudhar", "4000");
		InsurancePolicy homeInsClone = homeInsurance.clone();
	}
}
