import java.util.Scanner;

public class AddFiveNumbers { 
   public static void main(String [] args) {
      Scanner keyboard = new Scanner(System.in);
      
      int total = 0;
      
      for(int n = 1; n <= 5; n++) {
         System.out.println("Enter number " + n + ": "); 
         int number = keyboard.nextInt();
         total = total + number;
      }
      System.out.println("The total of all five numbers is: " + total);
   }
}