package com.pakminseok.ex;

public class User {
	private String fullName;
	private Email userEmail;
	
	public User(String fullName) {
		this.fullName = fullName;
		userEmail = new Email(fullName);
	}
	
	public void PrintEmail() {
		System.out.println(userEmail.getEmail());
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getUserEmail() {
		return userEmail.getEmail();
	}
	
	public void setUserEmail(int numbering, String compayName) {
		userEmail.setEmail(numbering, compayName);
	}
}
