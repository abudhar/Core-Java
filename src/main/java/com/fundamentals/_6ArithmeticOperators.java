package com.fundamentals;

public class _6ArithmeticOperators {
	public static void main(String[] args) {
		/*
		 * + --> Addition
		 * - --> Subratiction
		 * * --> Multiplication
		 * / --> Division
		 * % --> Module
		 * ++ -->Increment Operator 
		 * -- -->Decrement Operator 
		 */
		
		int a = 10;
		int b = 10;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a * b);
		System.out.println(a % b);
//		Increment: incrementing var by 1
		System.out.print("Pre Increment: ");
//		Pre Increment
		a = 5;
		System.out.println(++a);
		a = 5;
//		Post Increment
		System.out.print("Post Increment: ");
		System.out.println(a++);
//		Decrement: Decresing var by 1
//		Pre Decrement
		b = 5;
		System.out.print("Pre Decrement: ");
		System.out.println(--b);
//		Post Decrement
		b = 5;
		System.out.print("Post Decrement: ");
		System.out.println(b--);
		
//		EX: 1
		a = 10;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(a);
		
		System.out.println("----------------");
//		Ex: 2
		a  = 10;
		System.out.println(++a + --a);
//	 	Ex:3
		a = 5;
		System.out.println("++a + a-- * --a + a++");
		System.out.println("---------------------");
		System.out.println("6   + 6   *  4   + 3");
		System.out.println("-------------------");
		System.out.println("6   +    24     + 3");
		System.out.println("-------------------");
		System.out.println("30       +        3");
		System.out.println("-------------------");
		System.out.println(++a + a-- * --a + a++);
	
	}
	
}
