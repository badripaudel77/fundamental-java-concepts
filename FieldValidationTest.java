package com.regex;

public class FieldValidationTest {

	public static void main(String[] args) {

		ValidationOP validObj = new ValidationOP();
		validObj.validateEmail("badripaudel@gmail.com");
		
		System.out.println("-------------------------");
	
		validObj.validPhone("9867622377");
		
		System.out.println("-------------------------");

	}

}
