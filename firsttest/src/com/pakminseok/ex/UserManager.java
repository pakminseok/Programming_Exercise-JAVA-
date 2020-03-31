package com.pakminseok.ex;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class UserManager {
	public static void main(String[] args) {
		HashMap<String, Integer> emailList = new HashMap<String, Integer>();
		ArrayList<User> users = new ArrayList<User>();
		
		Scanner sc = new Scanner(System.in);
		int numOfUser = sc.nextInt();
		sc.nextLine();
		
		while(numOfUser-- > 0)
		{
			User user = new User(sc.nextLine());
			
			if(emailList.containsKey(user.getUserEmail()))
				emailList.put(user.getUserEmail(), emailList.get(user.getUserEmail())+1);
			else
				emailList.put(user.getUserEmail(), 1);
			
			user.setUserEmail(emailList.get(user.getUserEmail()), "cocoa");
			users.add(user);
		}
		
		for(User user : users)
			user.PrintEmail();
	}	
}
