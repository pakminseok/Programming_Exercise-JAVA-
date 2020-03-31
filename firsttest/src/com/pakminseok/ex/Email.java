package com.pakminseok.ex;

public class Email {
	private String email;
	
	public Email(String fullName) {
		String[] name = fullName.split(" ");

		String firstName = name[0].toLowerCase();
		String lastName = name[name.length-1].replace("-", "").toLowerCase();
		
		email = lastName + "_" + firstName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(int numbering, String compayName) {
		if(numbering > 1)
			email += Integer.toString(numbering);
		email += "@" + compayName + ".com";
	}
}
