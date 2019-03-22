package com.regex;

public class ValidationOP {

	public void validateEmail(String email) {
		int emailLen = email.length();
		
		if(emailLen<8) {
			System.out.println("Email lenght not valid");
		}
		
		else if((email.indexOf("@")==0) ) {
			
			System.out.println("Invalid \"@\" position");
		}
		
		else if((email.indexOf(".")==0)) {
			
			System.out.println("Invalid \".\" position");
		}
		else if (!((email.endsWith(".com") || email.endsWith(".in")))) {
			System.out.println("Email must end with \".com\"" +" " +"or"+"\".in\"");
			
		}
		
		else if(!(email.contains("@"))) {
			
			System.out.println("Please insert \"@\" in the email");
		}
		
		else {
			
			System.out.println("Email matched successfully");
		}
		
	}
	
	public void validPhone(String  phone) {
		
		if(phone.length()!=10) {
			System.out.println("Phone number's lenght must be 10");
		}
		
		else if(!phone.startsWith("9")){
			System.out.println("Phone numbers must start with \"9\" ");
		}
		
		else if(!((phone.indexOf("8")==1)||phone.indexOf("7")==1)) {
			System.out.println("Number at second position is not valid, please check again");
		}
		else {
			
			System.out.println("Phone numbers matched successfully");
		}
	}
	
}
