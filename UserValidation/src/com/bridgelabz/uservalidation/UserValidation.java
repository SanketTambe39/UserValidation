package com.bridgelabz.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {

	public static void main(String[] args) 
	{
		String firstName ="Firstname";
		checkFirstName(firstName);
		String lastName ="Lastname";
		checkLastName(lastName);
	}
	private static void checkLastName(String lastName) {
		boolean IsMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(lastName).matches();
		if(IsMatched)
		{
			System.out.println("Last name is correct");
		}
		else 
		{
			System.out.println("Larst name is invalid");
		}
	}
	private static void checkFirstName(String firstName) 
	{
		boolean IsMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(firstName).matches();
		if(IsMatched)
		{
			System.out.println("First name is correct");
		}
		else 
		{
			System.out.println("First name is invalid");
		}
	}
}
