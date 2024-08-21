package com.designpatterns.factoryDesign;

public class FactoryDesign {

	public static void main(String[] args) {
		
		
		/* Design:
		 * 1.create abstract class with common methods and objects
		 * 2.extend as many class as want under factory
		 * 3.use super keyword to access the Parent Factory
		 */
		
		
		Insurance insurance = InsuranceFactory.getInsurance("CAR");
		System.out.println(insurance.getInsuranceType());
		System.out.println(insurance.getInsuranceCost());
		System.out.println("------------------------------");
		insurance = InsuranceFactory.getInsurance("BIKE");
		System.out.println(insurance.getInsuranceType());
		System.out.println(insurance.getInsuranceCost());
		System.out.println("------------------------------");
		insurance = InsuranceFactory.getInsurance("BOAT");
		System.out.println(insurance.getInsuranceType());
		System.out.println(insurance.getInsuranceCost());
		System.out.println("------------------------------");
	}

}
