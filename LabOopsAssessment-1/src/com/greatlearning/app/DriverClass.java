package com.greatlearning.app;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialServiceImpl;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DriverClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstname = scan.nextLine();
		System.out.println("Enter last name");
		String lastname = scan.nextLine();
		Employee emp1 = new Employee();
		emp1.setFirstname(firstname);
		emp1.setLastname(lastname);
		String department="";
		CredentialServiceImpl cr = new CredentialServiceImpl();
		
		System.out.println("Please enter department from following\n");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1: department = "tech";
			emp1.setEmail(cr.generateEmailAddress(firstname, lastname, department));
			
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
		
		emp1.setPassword(cr.generatePassword());
		cr.showCredentials(emp1);
		
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" + "(?=.*[-+_!@#$%^&*., ?]).+$";
		
		Pattern p = Pattern.compile(regex);
		 Matcher m = p.matcher(cr.generatePassword());
		 if (m.matches())
		            System.out.println("Valid Password");
		        else
		            System.out.println("inValid Password");
			
		
		
	
		
	}

}
