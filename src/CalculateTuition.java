/*
Requirements Analysis (English Description)
Create a program that allows a student to calculate
how much tuition they must pay for a semester at 
community college.  The program will ask the user 
for the cost of one credit at a community college.
Then the program will ask the user for the number
of credits they are taking at the community college.
The program will calculate the tuition.  The program will
end by printing the cost of one credit, the number
of credits the student is taking, and the tuition the 
student will owe for this semester.  


Design (Algorithm)
1. Ask the user for the cost of one credit
2. Save the cost of one credit
3. Ask the user for the number of credits
4. Save the number of credits
5. Calculate the tuition by multiplying cost of one credit and number of credits
6. Print the tuition
7. End
*/

//Implementation

import java.util.Scanner;

public class CalculateTuition {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cost of one credit?: $");
		double creditCost = sc.nextDouble();
		System.out.print("Number of credits?: ");
		int creditTime = sc.nextInt();
		double creditSum = creditCost * (double)creditTime; // expllicit type casting
		
		System.out.println("Cost of one credit is: $" + creditCost);
		System.out.println("Number of credit is: " + creditTime);
		System.out.println("Tuition is: $" + creditSum);
		sc.close();
	}
}

//Testing

//javac CalculateTuition.java
//java CalculateTuition
