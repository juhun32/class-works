
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