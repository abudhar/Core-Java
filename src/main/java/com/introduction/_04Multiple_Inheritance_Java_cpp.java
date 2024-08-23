package com.introduction;

public class _04Multiple_Inheritance_Java_cpp {
	/*
	 * 7 Features of OOPL Concepts in Java
	 * 
	 * 1. class
	 * 2. object
	 * 3. encapsulation
	 * 4. polymorphism
	 * 5. abstraction
	 * 6. inheritance
	 * 7. Message Passing
	 * 
	 * Inheritance : relationship between class, it provoides code reusablity by providing method and objects 
	 * from parent to child class
	 * 
	 * Type: 
	 * 	Basic:
	 *  ---------
	 * 	1. single : it will provoide variables and method from only one parent class to multiple sub class */
			class Parent {
				int a;
				void parentMethod() {
					
				}
			}
			
			class SubClass1 extends Parent{
				public SubClass1() {
					super();
					super.a = 15;
					super.parentMethod();
				}
			}
			
			class SubClass2 extends Parent {
				public SubClass2() {
					super();
					super.a = 15;
					super.parentMethod();
				}
			}
	
	
	/*  2. multiple: multiple parent class and single subclass */
			class ParentClass1 {
				int a;
				void parentMethod() {
					
				}
			}
			
			class ParentClass2 {
				int a;
				void parentMethod() {
					
				}
			}
//			JVM will confuse which method to pick (ambiguity)
//			class SubClass extends ParentClass1, ParentClass2 {
//				public SubClass() {
//					super();
//					super.a = 15;
//					super.parentMethod();
//				}
//			}
			
	
	 /* 
	 *  Advanced:
	 *  ---------
	 *  3. multilevel
	 *  4. Hierarchial
	 *  5. Hybrid Inheritance
	 * 
	 * 
	 *
	 * 
	 */
	
	
}
