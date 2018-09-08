package com.docm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EMPLOYEE_LOCATION database table.
 * 
 */
@Entity
@Table(name="EMPLOYEE_LOCATION")
@NamedQuery(name="EmployeeLocation.findAll", query="SELECT e FROM EmployeeLocation e")
public class EmployeeLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;

	@Column(name="zip_code")
	private String zipCode;

	//bi-directional one-to-one association to Employee
	@OneToOne(mappedBy="employeeLocation")
	private Employee employee;

	public EmployeeLocation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}