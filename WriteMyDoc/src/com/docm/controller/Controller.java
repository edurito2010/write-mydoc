package com.docm.controller;
import com.docm.business.BusinessManager;

public class Controller {
	
	public void saveEmployeeData(String firstName, String lastName, String zipCode) {
		BusinessManager bm = new BusinessManager();
		bm.createEmployee(firstName, lastName, zipCode);
		
	}

}
