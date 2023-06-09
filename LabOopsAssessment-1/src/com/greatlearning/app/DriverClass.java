package com.greatlearning.app;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialServiceImpl;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DriverClass {
	public static void main(String[] args) {
		//Initializing scanner class for taking input
		Scanner scan = new Scanner(System.in);
		
		//Taking input of First Name and Last Name of the candidate
		System.out.println("Enter first name");
		String firstname = scan.nextLine();
		System.out.println("Enter last name");
		String lastname = scan.nextLine();
		
		//Creating object for class Employee parameterized constructor
		Employee emp1=new Employee(firstname,lastname);
		
		//Creating object for class Employee non parameterized constructor
		Employee emp2 = new Employee();
		
		//Setting First Name and Last Name of the candidate in class Employee
		emp2.setFirstname(firstname);
		emp2.setLastname(lastname);
		
		// Initialization of variables
		String department="";
		String genpass="";
		Pattern p; 
		Matcher m;
		
		//Creating object for the class CredentialServiceImpl
		CredentialServiceImpl cr = new CredentialServiceImpl();
		
		System.out.println("Please enter department from following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice = scan.nextInt();
		
		//To check the input department name of the candidate and allot credentials accordingly.
		switch(choice) {
		case 1: department = "tech";
		//emp1.setEmail(cr.generateEmailAddress(firstname, lastname, department));
		emp1.setEmail(cr.generateEmailAddress(emp1, department));		
		break;
			
		case 2: department = "admin";
		emp1.setEmail(cr.generateEmailAddress(firstname, lastname, department));
		break;
		
		case 3: department = "hr";
		emp1.setEmail(cr.generateEmailAddress(firstname, lastname, department));
		break;
		
		case 4: department = "legal";
		emp1.setEmail(cr.generateEmailAddress(firstname, lastname, department));
		
		default: System.out.println("Kindly enter valid input");
		}
		
		
		//To get the password as per requirement after loop check
		do {
		
			genpass = cr.generatePassword();
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" + "(?=.*[-+_!@#$%^&*., ?]).+$";
		
		 p = Pattern.compile(regex);
		 m = p.matcher(genpass);
		}while (!m.matches());
		          
		//Setting the password obtained after check as per norms 
		emp1.setPassword(genpass);
		
		//Display of credentials for the given candidate
		 cr.showCredentials(emp1);
			
		
		
	
		
	}

}
