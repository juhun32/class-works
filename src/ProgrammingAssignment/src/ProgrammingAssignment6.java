
import java.util.Scanner;

public class ProgrammingAssignment6 {
   public static void main (String [] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("enter age: ");
      int age = sc.nextInt();
      
      System.out.print("suggested rating: G");
      
      if (age < 0) {
         System.out.println("error");
      }
      
      if (age > 5) {
         System.out.print(", PG");
      }
      
      if (age >= 13) {
         System.out.print(", PG-13");
      }
      
      if (age >= 17) {
         System.out.print(", R");
      }
      
      System.out.println();
      System.out.println("anyone under 17 years of age will be able to a purchase ticket for a rated R movie with an accompanying adult");
      
      sc.close();
   }
}