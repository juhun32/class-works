
import java.util.Scanner;

public class ProgrammingAssignment4 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
      System.out.println("218+/435 votes needed to pass the House");
		int numRepr = sc.nextInt();

		if (numRepr >= 218) {
			System.out.println("number of pass vote from the House: " + numRepr);
         
         System.out.println("51+/100 votes needed to pass the US Senate");
         int numSena = sc.nextInt();
         
         if (numSena >= 51) {
            System.out.println("number of pass vote from the Senate: " + numSena);
            
            System.out.println("President of the US can sign or veto the bill proposed");
            String siVe = sc.next();
            
            if (siVe.equals("sign")) {
               System.out.println("The president signed the bill proposed and the bill became a law");
                      
            }
            else {
               System.out.println("The president veto'd the bill proposed");
               
               System.out.println("290+/435 votes needed to override the president's veto");
               int numReprVeto = sc.nextInt();
               
               if (numReprVeto >= 290) {
                  System.out.println("number of pass vote from the House: " + numRepr);
         
                  System.out.println("67+/100 votes needed to pass the US Senate");
                  int numSenaVeto = sc.nextInt();
                  
                  if (numSenaVeto >= 67) {
                     System.out.println("the veto was overridden and the bill became a law without president's signature");
                  }
                  else {
                     System.out.println("the veto was not overruled from the Senate and did not become a law");

                  }
               }
               else {
                  System.out.println("the veto was not overruled from the House and did not become a law");
               }
            }
         }  
         else {
            System.out.println("the bill did not pass the Senate and did not become a law");
         }
		} 
		else {
			System.out.println("the bill did not pass the House and did not become a law");
		}
		
		sc.close();
	}
}