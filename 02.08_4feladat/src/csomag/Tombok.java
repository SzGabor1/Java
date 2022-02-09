package csomag;

import java.text.DecimalFormat;

public class Tombok {

	public static void main(String[] args) {

		int n = 10;
		int[] tomb = new int[n];

		feltolt(tomb);

		kiir(tomb);
		double avg = atlag(tomb);
		
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("");
		if (avg == -1) {
			System.out.println("Nem volt paros szam");
			
		}else{
			System.out.println("Az atlag: " + df.format(avg));
		}
		
		
		System.out.println("A legnagyobb: " + legnagyobb(tomb));
		
	kiirforditva(tomb);

	}

	private static int legnagyobb(int[] tomb) {
		
		int max = tomb[0];
		
		for (int i = 0; i < tomb.length; i++) {
			if(max < tomb[i]){
				max = tomb[i];
						
			}
			
		}
		
		return max;
	}

	private static void feltolt(int[] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = (int) (Math.random() * 50 + 1);
		}
	}

	private static void kiir(int[] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			System.out.print(" " + tomb[i]);
		}
	}
	
	private static void kiirforditva(int[] tomb) {
		for (int i = tomb.length - 1 ; i >= 0; i--) {
			System.out.print(" " +tomb[i]);
		}
	}
	

	private static double atlag(int[] tomb) {

		double ertek = 0;
		double db = 0;
		for (int i = 0; i < tomb.length; i++) {
			if(tomb[i]%2 == 0){
				ertek = ertek + tomb[i];
				db++;
			}
		}
		if(db == 0){
		
		return -1;
		}
		ertek = ertek / db;
		return ertek;
	}

}
