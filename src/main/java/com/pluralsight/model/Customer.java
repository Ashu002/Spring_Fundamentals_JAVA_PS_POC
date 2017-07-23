package com.pluralsight.model;

/**
 * Created by ashutosh on 23/7/17.
 */


public class Customer {

	private String firstName;
	private String lastName;

	public Customer(){

	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
