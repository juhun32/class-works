
import java.util.Scanner;

public class ProgrammingAssignment7 {
   public static void main (String [] args) {
      Scanner sc = new Scanner(System.in);
      
      final int PIN = 1234;
      int i = 0;
      
      System.out.print("enter your PIN: ");
      int userPIN = sc.nextInt();
      
      
      while (i < 2) {
         if (userPIN == PIN) {
            System.out.println("successfully accessed the account");
            break;
         } else {
            i++;
            System.out.print("error, enter PIN again: ");
            userPIN = sc.nextInt();
         }
      }
      
      if (i == 2) {
         System.out.println("access restricted");
      }
      sc.close();
   }
}