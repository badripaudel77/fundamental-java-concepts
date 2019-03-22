package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("...d");
		Matcher m = p.matcher("ASId");
		boolean isTrue = m.matches();
		System.out.println("Matching the fourth char in pattern : " + isTrue);//returns true as fourth char is d

		
		System.out.println("Matching against the name : " + Pattern.matches("[badri]", "b"));//returns true

		System.out.println("Matching the digits : " + Pattern.matches("\\d", "1"));//returns true as \\d represents any single digit

		System.out.println("Matching the Non digits : " + Pattern.matches("\\D", "s"));// returns true \\D any single
		// non digit
	
		if("hello"=="hello") {
			System.out.println("hello !");
		}
		else 
			System.out.println("kllll");
		
		if("hello".equals("hello")) {
			System.out.println("wow! ");
		}
		else {System.out.println(" lol sorry");
		}
		}
	}


