package com.greatlearning.appmain;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		
		// Employee class object
		// user input for firstName, lastName, department
		// (Technical, Admin, Human Resource, Legal)
		// Scanner
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter first Name");
		String firstName= scanner.next();
		
		System.out.println("Enter Last Name");
		String lastName= scanner.next();
		System.out.println("Enter Department");
		System.out.println("Enter department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		int choice= scanner.nextInt();
		String email= null;
		String password= null;
		CredentialService credentialService= new CredentialService();
		if(choice==1) {
			Employee emp= new Employee(firstName, lastName, "technical");
			email=credentialService.generateEmail(firstName, lastName, "technical");
			password=credentialService.generatePassword();
			credentialService.showCreds(emp, email, password);
		}else if(choice==2) {
			Employee emp= new Employee(firstName, lastName, "Admin");
			email= credentialService.generateEmail(firstName, lastName, "Admin");
			password=credentialService.generatePassword();
			credentialService.showCreds(emp, email, password);
		}else if(choice==3) {
			Employee emp= new Employee(firstName, lastName, "Human Resources");
			email= credentialService.generateEmail(firstName, lastName, "Human Resources");
			password=credentialService.generatePassword();
			credentialService.showCreds(emp, email, password);
		}else if(choice==4) {
			Employee emp= new Employee(firstName, lastName, "Legal");
			email= credentialService.generateEmail(firstName, lastName, "Legal");
			password=credentialService.generatePassword();
			credentialService.showCreds(emp, email, password);
		}else {
			System.out.println("enter valid input");
		}
		//Employee employee= new Employee();
		
	}
	
	
	}

