/*
Requirements Analysis (English Description)

Create a Java program to calculate the total amount due for an item purchased at a store in
Northern Virginia. The total amount due is the cost of the item plus the sales tax. A user should
be asked to enter the cost of the item. The program should apply a 5 percent sales tax to the
item. Then the program should display to the user the calculated sales tax along with the total
cost including the sales tax.

Design (Algorithm)
1. Ask the user for the cost of item purchased
2. Save the cost of item purchased
3. Calculate the tax
4. Calculate and save the total amount due
5. Print the total amount due
6. End
*/

//Implementation


import java.util.Scanner;

public class ProgrammingAssignment1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cost of item purchased: $");
		double itemCost = sc.nextDouble();
		double tax = itemCost * 0.05;	
		double totalDue = itemCost + tax;
		
		System.out.println("Total Due is: $" + totalDue);
		sc.close();
	}
}


// Testing

// javac PA1.java
// java PA1