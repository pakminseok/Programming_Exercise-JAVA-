package com.pakminseok.ex;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		
		User user = new User(userName, "kokoa");
		user.PrintEmail();
	}
	
}
