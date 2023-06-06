package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface CredentialService {
public String generateEmailAddress(String firstname, String lastname, String department); 

public String generatePassword();

public void showCredentials(Employee e1);
}
	


