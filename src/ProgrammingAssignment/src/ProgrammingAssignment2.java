/*
Create a program that calculates the y value of a linear equation given the slope (m), the x value,
and the y-intercept (b) in the following equation: y=mx+b. The user will enter the values of the
slope, the x value, and the y-intercept. The program will then determine the value of y using the
equation. This program should display the computed value of y.
*/


import java.util.Scanner;

public class ProgrammingAssignment2 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("value of the slope? : ");
		double slopeVal = sc.nextDouble();
		System.out.print("value of x? : ");
		double xVal = sc.nextDouble();
		System.out.print("value of y-intercept? : ");
		double bVal = sc.nextDouble();
		
		double result = slopeVal * xVal + bVal;
		System.out.println("y = " + result);

		sc.close();
	}
}