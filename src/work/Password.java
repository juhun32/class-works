package work;

/*
Requirement Analysis (English Description)

Create a program that checks whether a user has entered the correct password.
If the password is correct tell the user that they have access to their account.
If the user enters the incorrect password tell them their password is incorrect 
and give them a second chance to enter their password.
If they enter the correct password the second time tell they have access to 
their account otherwise tell them they have run out of chances and to contact 
the helpdesk. The password for the user is test123, but do not tell the user 
that this is the password.
*/

import java.util.Scanner;

public class Password{
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		final String PASSWORD = "test123";
		
		System.out.print("enter the password: ");
		String userPassword = sc.next();
		
		if (userPassword.equals(PASSWORD))
			System.out.println("You have access to your account");
		else {
			System.out.println("Password is incorrect");
			System.out.print("enter the password again: ");
			userPassword = sc.next();
			
			if (userPassword.equals(PASSWORD))
				System.out.println("You have access to your accout");
			else {
				System.out.println("Access denied, contact the helpdesk");
			}
		}

		sc.close();
	}
}