package com.fundamentals;

public class _3NumberSystem {
	public static void main(String[] args) {
		/*
		 * Introduced in Java 7
		 * 
		 * Number System: To Represent the Number in PL, Number System is used.
		 * 
		 * Types:
		 * 	1.Binary  	   - [Base - 2]
		 *  2.Octal        - [Base - 8]
		 *  3.Decimal 	   - [Base - 10]
		 *  4.HexaDecimal  - [Base - 16]
		 *  
		 *  All the above Number System were in Java, Default is Decimal Number System
		 * 
		 *
		 * Binary Number System:
		 * ---------------------
		 * Alphabets: 0's and 1's
		 * Prefix : 0b (or) 0B
		 * 																	*/
			 int a  = 0b10;
			 System.out.println(a);//Decimal Eq -> 2pow1 + 0pow1
			 int ab  = 0B10;
			 System.out.println(ab);
	    /*
	     * Octal Number system:
	     * -------------------
	     * Alphabets : 0,1,2,3,4,5,6,7
	     * Prefix : 0 (zero)
	     */
			 int oct = 01324;
			 System.out.println(oct);
			 int ocatal = 07346;
			 System.out.println(ocatal);
		 /*
		  * Decimal Number system: (default)
		  * -------------------
		  * Alphabets : 0,1,2,3,4,5,6,7,8,9
		  * Prefix : no prefix required
		  */
			 int dec = 324520;
			 System.out.println(dec);
			 int decimal = 3010;
			 System.out.println(decimal);
		 /*
		  * Hexa Decimal Number system: (default)
		  * -------------------
		  * Alphabets : 0,1,2,3,4,5,6,7,8,9, a, b, c, d, e, f
		  * Prefix : 0x / 0X
		  */
		 int hex = 0x10;
		 System.out.println(hex);
		 int hexdecimal = 0x7FFFFFFF;//max Limit 
		 System.out.println(hexdecimal);//integers max value
		 /*
		  * Note : whenever we declare a number system jvm and compiler convert the 
		  * 	   respective number system to decimal number.
		  * eg:
		  */
		 int binaryy = 0b10; //decimal value ->2
		 int hexadecimall = 0x10;// decimal value -> 16
		 int output = binaryy + hexadecimall;
		 System.out.println("output--> "+output);
		 int output2 = 0b10 + 0x10;
		 System.out.println("output2 --> "+output2);
		 
		 /*
		  * Q) Find Number System
		  * 
		  */
		 
		 int a1 = 010;//Octal
		 int a2 = 0b10;//binary
		 int a3 = 0x10;//hexadecimal
		 int a4 = 10;//decimal
		 System.out.println(a1+a2+a3+a4);
	}
}
