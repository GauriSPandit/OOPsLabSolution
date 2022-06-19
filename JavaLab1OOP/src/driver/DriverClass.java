package driver;

import java.util.Scanner;

import model.Employee;
import service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		
		CredentialService credentialService = new CredentialService();
		Employee newEmployee = new Employee("Sahil", "Pandit");
		
		Scanner sc = new Scanner(System.in);
		
		int inputDepartment =0;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1: Technical");
		System.out.println("2: Admin");
		System.out.println("3: Human Resource");
		System.out.println("4: Legal");
		
		inputDepartment = sc.nextInt();
		
		String department=new String();
		switch(inputDepartment) {
		  case 1:
			  department = "Technical";
			  break;
		  case 2:
			  department = "Admin";
			  break;
		  case 3:
			  department = "HumanResource";
			  break;
		  case 4:
			  department = "Legal";
			  break;
		  default:
			  System.out.println("Invalid Input");	
			  return ;
		}
		
	String password = credentialService.generatePassword();
	String email = credentialService.generateEmailAddress(newEmployee.getFirstName(),newEmployee.getLastName(),department);
	
	credentialService.showCredentials(newEmployee.getFirstName(), email, password);

	}

}
