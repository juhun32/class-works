/*
Decision / Branching / Selection / Conditional
- check for invalid input
- treat different situations differently
- differently inputs may lead to different outputs such that some outputs maybe skipped
- allow the compute to make a decision

*/

/*
Create a program that allows a user to calculate how much tuition they owe for one semester of
community college. The user will be asked for the number of credits they are taking this
semester. The user will then be asked if they are an in-state student. In-state students are
charged $100.00 dollars per credit, but out-of-state students are charged $200.00 dollars per
credit. The program should end by displaying the number of credits the student is taking,
whether they are an in-state student or out-of-state student, the cost per credit, and the tuition the
student owes for this semester.
*/
package ProgrammingAssignment;

import java.util.Scanner;

public class ProgrammingAssignment3 {
	public static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
	double total;
	
	System.out.print("Number of credits? : ");
	int numCredits = sc.nextInt();

	System.out.print("Are you in-state student? Y/N: ");
	String stateStudent = sc.next();

	if (stateStudent.equals("Y")) {
		total = 100 * (double) numCredits;
		
		System.out.println("You are in-state student");
		System.out.println("Your number of credit(s): " + numCredits);
		System.out.println("Your tuition per credit is: $100.00");
		System.out.println("Your tuition is: $" + total);
	} else {
		total = 200 * (double) numCredits;
		
		System.out.println("You are out-of-state student");
		System.out.println("Your number of credit(s): " + numCredits);
		System.out.println("Your tuition per credit is: $200.00");
		System.out.println("Your tuition is: $" + total);
	}
	
	sc.close();
	}
}