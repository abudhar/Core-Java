package com.introduction;

import java.util.Stack;

public class _01History {
	
	public static void main(String[] args) {
		
	/*
	 * Java - 1991, James Gosling
	 * 
	 * Criteria:
	 * 	I.Simple Programming Language
	 *  II.Tight Coded PL
	 *  III.Architecture Neutral PL
	 *  
	 *  I.Simple Programming Language
	 *  -> Low Execution Time -> Output will be faster (eg. channel changing)
	 *  -> Low Memory -> Cost will Reduce (eg. RAM)
	 *  -> Low Power Consumption -> Maintanance will be low (eg. Remote battery)
	 *  
	 *  II.TightCoded Programming Language
	 *  
	 *  In C,
	 *  
	 *  For Stack Operation we need to right too much lines of Coding, ex.
	 *  
	 *  Stack,
	 *  
	 *  Push -> 20 LOC (Lines of Code)
	 *  Pop  -> 20 LOC 
	 *  Peek -> 20 LOC
	 *  --------------
	 *  Total ->60 LOC
	 *  --------------
	 *
	 *  But in Java,
	 * 
	 */
		Stack<Integer> stack = new Stack<>();
		stack.push(12);
		stack.push(13);
		stack.push(14);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	/*
	 * III. Arch Neutral
	 * 
	 * -> it can be compatible for every hardware
	 * 
	 * 1992, Dec Created Programming Language (GREEN)
	 * 
	 * tried to name as OAK.
	 * 
	 * and Named as JAVA.
	 * 
	 * First Product of JAVA : *7 (star 7) Remote Controller
	 * 
	 * from 1993 to 1994 mid no one purchased. it failed.
	 * 
	 * 1994 mid Marc andersson created brwoser named Mosaic -> sold to Netscafe
	 * 
	 * 1995 -> Java created HOT Java (Browser). A Successfull Product
	 * 
	 * its created using Applet.
	 * 
	 * 1996 Jan 23, Introduced JAVA (JDK) 1.0
	 * 
	 * 	1.JDK 1.0
	 *  2.JDK 1.1
	 *  4.JDK 1.2 ---> Major Enhancements
	 *  5.JDK 1.3
	 *  6.JDK 1.4
	 *  7.JDK 1.5 ---> Major Enhancements
	 *  8.JAVA6 [Maintained By Sun Microsystem]
	 *	----------------------------------------
	 *	ORACLE Corporation Accumulated the Sun Microsystem
	 *	----------------------------------------
	 *  9.JAVA7
	 *  10.JAVA8 ---> Major Enhancements
	 *  11.JAVA9
	 *  12.JAVA10 ---> Short Term Support
	 *  13.JAVA11 ---> Long Term Support
	 * 
	 * 
	 */
		
	}

}
