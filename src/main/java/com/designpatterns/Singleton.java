package com.designpatterns;

public class Singleton {
	

	/* 
	 * 1. creating static object of the class
	 * 2. creating private constructor
	 * 3. creating instance based on request 
	 * 
	 * /

	/* 1. creating static object of the class */
	private static Singleton instance = null;

	/* 2. creating private constructor */
	private Singleton() {

	}

	/* 3. creating instance based on request */
	public static Singleton getInstance() {
		return instance == null ? new Singleton() : instance;
	}
}
