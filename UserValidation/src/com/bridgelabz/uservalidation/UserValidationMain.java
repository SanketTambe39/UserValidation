package com.bridgelabz.uservalidation;

import java.util.Scanner;

public class UserValidationMain {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		UserValidationService service = new UserValidationImpl();
		User user = new User();
		
		System.out.println("Enter First name");
		user.setFirstName(scanner.next());
		service.checkFirstName(user.getFirstName());

		System.out.println("Enter Last name");
		user.setLastName(scanner.next());
		service.checkLastName(user.getLastName());

		System.out.println("Enter Email address");
		user.setEmail(scanner.next());
		service.checkEmailAddress(user.getEmail());	
		
		System.out.println("Enter Phone number along with country code");
		user.setMobileNumber(scanner.nextLine());
		service.checkPhoneNumber(user.getMobileNumber());
		scanner.close();
		
	}
}
