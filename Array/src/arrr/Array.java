package arrr;

public class Array {

	public static void main(String[] args) {
	
		int[] zahlen = {1, 2, 3, 4, 5};
		int summe = 0;
		
		for (int gesamt: zahlen) {
			summe += gesamt;
		}
		
		System.out.println("Die Summe der Zahlen im Array ist: " + summe);
		
	}

}
