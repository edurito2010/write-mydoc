package com.docm.business;

import javax.persistence.EntityManager;

import com.docm.model.*;

public class BusinessManager {
	public void createEmployee(String firstName, String lastName) {
		
		EntityManager manager = JPAUtility.getEntityManager();
		manager.getTransaction().begin();
		
		Employee employee = new Employee(firstName,lastName);
		manager.persist(employee);
		manager.getTransaction().commit();
		
		JPAUtility.close();
		
		
	}

}
