package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialServiceImpl implements CredentialService{
	
@Override
//Method to generate email Id as per requirement
public String generateEmailAddress(String firstname, String lastname, String department) {
	return firstname.toLowerCase() + lastname.toLowerCase() + "@" + department + ".gl.com";
}

@Override
//Method to generate passsword as per requirement
public String generatePassword() {
	Random rn = new Random();
    String password="";
    for(int i=1; i<=8; i++){
        int value = rn.ints(33, 126).findAny().getAsInt();
        password += String.valueOf((char)value);
    }
    return password;
}

@Override
//Method to display Credentials of the candidate
public void showCredentials(Employee e1) {
	System.out.println("Dear " + e1.getFirstname() + " your generated credentials are as follows");
	System.out.println("Email    ------>" + e1.getEmail());
	System.out.println("Password ------>" + e1.getPassword());
}

public String generateEmailAddress(Employee emp1, String department) {
	return emp1.getFirstname().toLowerCase() + emp1.getLastname().toLowerCase() + "@" + department + ".gl.com";
}	

}
