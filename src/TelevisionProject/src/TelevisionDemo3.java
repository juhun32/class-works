
import java.util.Scanner;
public class TelevisionDemo3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the brand of your television?");
		String brand = keyboard.nextLine();
		
		Television myTV = new Television(brand);
		int option;
		
		do {
			System.out.println("Press 1 to turn tv on or off");
			System.out.println("Press 2 to see whether tv is on or off");
			System.out.println("Press 3 to end the program");
			option = keyboard.nextInt();
			
			if(option == 1) {
				System.out.println("Press true to turn on or Press false to turn off");
				boolean newPower = keyboard.nextBoolean();
				myTV.setPower(newPower);
			}
			else if(option == 2) {
				boolean power = myTV.getPowerAsBoolean();
				if(power == false) {
					System.out.println("The tv is off");
				}
				else {
					System.out.println("The tv is on");
				}
			}
			else if(option == 3) {
				System.out.println("Thank you for using the program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 3);
		

		keyboard.close();
	}

}
