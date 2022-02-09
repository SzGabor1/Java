package csomag;

public class Ikerprim {

	public static void main(String[] args) {
		
		for (int i = 1; i < 100; i++) {
			
			for (int j = i+1; j < 100; j++) {
				
				if(ikerprim(i,j)){
					System.out.println("Ikerprim: " + i + " " + j);
				}
				
			}
			
		}
		

	}

	private static boolean ikerprim(int szam1, int szam2) {
		
		if(prim(szam1) && prim(szam2) && kulonbseg(szam1,szam2)==2){
			return true;
		}
			
		
		return false;
	}

	private static int kulonbseg(int szam1, int szam2) {
		
		return Math.abs(szam1-szam2);
	}

	private static boolean prim(int szam1) {
		
		for(int i = 2; i <= (szam1/2); i++){
			if(szam1 % i == 0){
				return false;
			}
			
		}
		return true;
	}

}
