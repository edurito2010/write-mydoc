package com.docm.business;

import javax.persistence.EntityManager;

import com.docm.model.*;

public class BusinessManager {
	public void createEmployee(String firstName, String lastName, String zipCode) {
		
		EntityManager manager = JPAUtility.getEntityManager();
		manager.getTransaction().begin();
		
		Employee employee = new Employee();
		EmployeeLocation location = new EmployeeLocation();
		location.setZipCode(zipCode);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setEmployeeLocation(location);
		manager.persist(employee);
		manager.getTransaction().commit();
		
		
	}

}
