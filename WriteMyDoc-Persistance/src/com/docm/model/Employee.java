package com.docm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Employee database table.
 * This class was generated from the table
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	public Employee() {
	}

	public Employee(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		setFirstName(firstName);
		setLastName(lastName);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}