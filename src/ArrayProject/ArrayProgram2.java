package ArrayProject;


public class ArrayProgram2 {
	public static void main(String[] args) {
		int [] a = {1,2,3}; 
		int [] b = {3,4,5};
		
		a = b;
		a[1] = 19;
		System.out.println(b[1]);
		
	}

}
