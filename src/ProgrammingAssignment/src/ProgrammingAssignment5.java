
import java.util.Scanner;

public class ProgrammingAssignment5 {
   public static void main (String [] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("yearly income?: ");
      double yIncome = sc.nextDouble();
      
      if (yIncome >= 0 && yIncome <= 10000) {
         System.out.println("tax rate: 10%");
         System.out.println("tax estimate: " + yIncome * 0.1);
      }
      else if (yIncome > 10000 && yIncome <= 50000) {
         System.out.println("tax rate: 20%");
         System.out.println("tax estimate: " + yIncome * 0.2);
      }
      else if (yIncome > 50000 && yIncome <= 100000) {
         System.out.println("tax rate: 30%");
         System.out.println("tax estimate: " + yIncome * 0.3);
      }
      else if (yIncome > 100000) {
         System.out.println("tax rate: 20%");
         System.out.println("tax estimate: " + yIncome * 0.4);
      }
      else {
         System.out.println("estimate failed");
      }
      
      sc.close();
   }
}