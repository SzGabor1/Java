package csomag;


public class PiErteke {

	public static void main(String[] args) {
		
		double pi = 0;
		double szamlalo = 1;
		double nevezo= 1;
		
		
		double x = Math.PI;
		
		for (int i = 1; i < 1000; i++) {
			
		
			
			
			if(i % 2 == 0){
				pi = pi - (szamlalo / nevezo);
			}else {
				pi = pi + (szamlalo / nevezo);
			}
				
			nevezo += 2;
			
		}

		System.out.println("A pi: " + 4 * pi + " a generalt cuc:   " + x);
		
	}

}
