package ProgrammingAssignment;




import java.util.Scanner;

public class ProgrammingAssignment8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean cre1 = false;
		boolean cre2 = false;
		boolean cre3 = false;
		boolean cre4 = false;
		
		while (true) {
			System.out.print("Age?: ");
			int userAge = sc.nextInt();
			
			if (userAge >= 18) {
				cre1 = true;
			}
			
			System.out.print("Citizen of the US? (Y/N): ");
			String userCit = sc.next();
			
			if (userCit.equals("Y")) {
				cre2 = true;
			}
			
			System.out.print("Resident of a state? (Y/N): ");
			String userRes = sc.next();
			
			if (userRes.equals("Y")) {
				cre3 = true;
			}
			
			System.out.print("Registered to vote in your state? (Y/N): ");
			String userReg = sc.next();
			
			if (userReg.equals("Y")) {
				cre4 = true;
			}
			
			if (cre1 == true && cre2 == true && cre3 == true && cre4 == true ) {
				System.out.println("You are eligible to vote");
			} else {
				System.out.println("Your are not eligible to vote");
				
				if (!cre1) {
					System.out.println("You are under 18");
				}
				if (!cre2) {
					System.out.println("You are not a citizen of the US");
				}
				if (!cre3) {
					System.out.println("You are not a resident of a state");
				}
				if (!cre4) {
					System.out.println("You are not registered");
				}
			}
			
			System.out.println("Restart (Y/N)");
			String res = sc.next();
			if (res.equals("N")) {
				break;
			}
		}
		sc.close();
	}
}
