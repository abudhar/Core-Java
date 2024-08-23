package com.introduction;

public class _05Operator_Overloading_Java_cpp {
	/*
	 * Polymorphism : poly is greek word (many), Morphism means (Structures/forms)
	 * 
	 * A thing is Existed in more than one form is called Polymorphism
	 * 
	 * Advantage: Flexiblity
	 * 
	 * Type: 
	 * 
	 * 1.Static : polymorphism is existed in compile time is know as Static Polymorphism eg: Overloading 
	 *	Type of Overloading:
	 * 		method Overloading-> method with same Name multiple Parameters
	 */
		void overloadMethod() {
			System.out.println("method with no parameter");
		}
		void overloadMethod(String param) {
			System.out.println("method with 1 parameter");
		}
		void overloadMethod(String param, String param2) {
			System.out.println("method with 2 parameter");
		}
		
		public static void main(String[] args) {
			_05Operator_Overloading_Java_cpp cls = new _05Operator_Overloading_Java_cpp();
			cls.overloadMethod();
			cls.overloadMethod("One");
			cls.overloadMethod("one", "two");
		}
		
	
	 /*  operator Overloading -> declaring operator with more than one functionality
	  *  
	  *  Why not used?
	  *  -rarely used
	  *  -confusing
	  *  NOte: Java is defined operator overloading implicity(internally) as fixed funtionalities
	  *  it didn't provided user to overload. eg: +,*,% etc..
	  * 
	  */
		int a = 10, b = 20;
		int c = a + b;
		
		String str1 = "abc", str2 = "efg";
		String str = str1 + str2;
	
	/* 
	 * 2.Dynamic : polymorphism is existed in runtime is know as Dynamic Polymorphism eg: Overridding 
	 *  
	 */
	
}
