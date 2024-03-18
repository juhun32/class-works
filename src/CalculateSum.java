/*
Multi liine Comment
Requirements Analysis (English Description)
Create a program that allows a user to add two numbers together
The program will ask the user for the first number.
Then the program will ask the user for the second number.
The program will calculate the sum and print the sum to the screen.

Design (Algorithm)
CalculateSum
1. Ask the user for the first number
2. Save the first number
3. Ask the user for the second number
4. Save the second number
5. Calculate the sum of the two numbers
6. Print the Sum
7. END
*/

// Implementation

import java.util.Scanner;

public class CalculateSum {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("The sum is: " + sum);

		sc.close();
	}
}

// Testing
// javac CalculateSum.java (compile the program)
// java CalculateSum (run the program)