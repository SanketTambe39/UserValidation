package com.bridgelabz.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to User Registration");
		String firstName ="Firstname";
		checkFirstName(firstName);
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
