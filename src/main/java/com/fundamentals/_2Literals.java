package com.fundamentals;

public class _2Literals {
	public static void main(String[] args) {
//		Literal is the constant assigned to a variable
//		int a = 10;
//		10 -> Literal
//		 a -> variable
//		int -> keyword
		
		/*
		 * Literal Types
		 * 
		 * 1.Intergral/Integer Literals -> int,char,long,byte,char
		 * 2.Floating point Literals -> float (23.324f), double (423.56/435.56D)
		 * 3.Boolean Literals -> boolean (true/false)
		 * 4.String Literals  -> String ("str"/"32"/"324.645")
		 * 
		 * For Readalblity After 7 Version introduces "_" for literals
		 * Compiler will remove the "_" and assign to the variable (Internally)
		 * 
		 */
			int count = 3_234_345;
			System.out.println(count);
			double count1 = 31_34_345.24_35;
			System.out.println(count1);
	}
}
