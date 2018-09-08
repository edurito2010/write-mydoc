package com.docm.bean;

import java.io.Serializable;

public class EmployeeBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6564285383286956134L;
	private String firstName;
	private String lastName;
	private String zipCode;
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public EmployeeBean()
	{
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
