package com.introduction;

public class _03Pointer_Java_Cpp {
	/*
	 * Pointers are the variable that store the memory location of another variable.
	 * in C/CPP,
	 * 
	 * int a = 10; --it will be stored on 1010 (memory address)
	 * *p; -- it will create a memory to store the address
	 * p = &a; --&a will provoide the memory addres of int
	 * 
	 * Pointer variable are recogonized and initialized in compilation time
	 * 
	 * Q) why pointer weren't present in java?
	 * 
	 * A) 
	 * 1. Memory allocation in c/cpp are in compile time as (static memory allocation) whereas in Java its 
	 * 	  Allocating memory ate runtime (dynamic memory allocation).
	 * 2. C/Cpp are Platform dependent means it will allocate the memory at runtime in a pc and it will read from the same.
	 * 	  Since Java is Platform independent it create that memory at runtime only we cannot get the address unless until it allocation.
	 * 3. Pointer is not secure because it expose address if it expose the address we can manipulate the data
	 * 4. Pointers were complex, but java is simple programming language
	 * 
	 * 	Diagram : Object memory Allocation in Java.png
	 * 
	 */
}
