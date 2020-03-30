package com.pakminseok.ex;

public class User {
	private String fullName;
	private Email userEmail;
	
	public User(String fullName, String companyName) {
		this.fullName = fullName;
		userEmail = new Email(fullName, companyName);
	}
	
	public void PrintEmail() {
		System.out.print(userEmail.getEmail());
	}
}
