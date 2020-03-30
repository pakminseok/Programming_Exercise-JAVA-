package com.pakminseok.ex;

public class Email {
	private String email;
	
	public Email(String fullName, String companyName) {
		String[] name = fullName.split(" ");

		String firstName = name[0].toLowerCase();
		String lastName = name[name.length-1].replace("-", "").toLowerCase();
		
		email = lastName + "_" + firstName +"@"+companyName+".com";
	}
	
	public String getEmail() {
		return email;
	}
}
