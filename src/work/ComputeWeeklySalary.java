package work;

/*
Requirements Analysis (English Description)

Create a program that allows an employee to calculate their weekly salary.
This program will ask the user for the hours they have worked this week.
Then the program will ask the user for their hourly rate. 
Any employee who works more than 40 hrs in a week is given a $500 dollar bonus.
This program should print their bonus if they have one and their weekly salary.
This program does not need to check the hours worked or hourly rate is a valid number.
*/

import java.util.Scanner;

public class ComputeWeeklySalary {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Worked hours?: ");
		int workHrs = sc.nextInt();
		System.out.print("Hourly rate?: $");
		double hourRate = sc.nextDouble();
		double bonus = 0;		

		if (workHrs > 40) {
			bonus = 500;
			System.out.println("Bonus: $" + bonus);
		}
		
		double salary = (double)workHrs * hourRate + bonus;
		
		System.out.println("Weekly Salary: $" + salary);
		sc.close();
	}
}