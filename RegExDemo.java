package com.regex;

import java.util.regex.Pattern;

public class RegExDemo {
	public static void emaiValid() {

		String email = "badripaudel77@gmail.com";

		if (!((email.endsWith(".com")) || (email.endsWith(".in")))) {

			System.out.println("email did not match\n------------------------");
		}
		
		if(email.length()<8) {
			System.out.println("email length is not valid");
		}
		else {

			System.out.println("email matched thanks\n-----------------------------");
		}
	}

	public static void nextEmailValid() {
		String email = "paudelbadri404@gmail.com";
		int emailLen = email.length();

		if(!email.contains("@")) {
			
			System.out.println("please insert the @ in email to make it valid");
		}

		else if ((email.indexOf("@") ==1)) {

			System.out.println("invalid @ position");
		}
      
		else {
			System.out.println("email matche successfully");
		}
	}

	public static void main(String[] args) {
		emaiValid();

		nextEmailValid();
	}
}
