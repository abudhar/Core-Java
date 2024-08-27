package com.introduction;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8475946224598243302L;
	public String name;
	public String id;
	public String salary;
	public String gender;

	public Employee() {
	}

	public Employee(String id) {
	}

	public Employee(String id, String name) {
	}

	public Employee(String id, String name, String salary) {
	}

	public Employee(String id, String name, String salary, String gender) {
	}

	public void add(String id, String name, String salary, String gender) {
	}

	public void update(String id, String name, String salary, String gender) {
	}

	public void search(String name) {
	}

	public void delete(String id) {

	}

}