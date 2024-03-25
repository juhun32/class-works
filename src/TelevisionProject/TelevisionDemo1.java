package TelevisionProject;




public class TelevisionDemo1 {
	public static void main(String[] args) {
		Television tv1 = new Television("RCA", 0);
		System.out.println("TV1 Brand: " + tv1.getBrand());
		System.out.println("TV1 Power: " + tv1.getPower());
		
		Television tv2 = new Television();
		System.out.println("TV2 Brand: " + tv2.getBrand());
		System.out.println("TV2 Power: " + tv2.getPower());		
		
		Television tv3 = new Television("Sony");
		System.out.println("TV3 Brand: " + tv3.getBrand());
		System.out.println("TV3 Power: " + tv3.getPower());		

		Television tv4 = new Television(2);
		System.out.println("TV4 Brand: " + tv4.getBrand());
		System.out.println("TV4 Power: " + tv4.getPower());		
		
	}
}
