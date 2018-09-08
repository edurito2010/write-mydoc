package com.docm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EMPLOYEE database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	//bi-directional one-to-one association to EmployeeLocation
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="EMPLOYEE_LOCATION_ID")
	private EmployeeLocation employeeLocation;

	public Employee() {
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

	public EmployeeLocation getEmployeeLocation() {
		return this.employeeLocation;
	}

	public void setEmployeeLocation(EmployeeLocation employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

}