package arrr;

public class Vollkommen {

	public static void main(String[] args) {
		// Bestimme alle vollkommenen Zahlen <= 500
		findPerfectNumbers(500);
	}
	
		// Untersuche alle Zahlen von 1 bis zur angegebenen Grenze
	public static void findPerfectNumbers(int limit) {
		for (int n = 1; n <= limit; n++) {
			int sumOfDivisors = 0;
			
		//Bestimme alle Teiler von n und summiere sie
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sumOfDivisors += i;
			}
		}
		// Prüfe ob die Summe der Teiler das Doppelte von n ist
		if (sumOfDivisors == 2 * n) {
			System.out.println(n + " ist eine vollkommene Zahl.");
		}
		}
	}

}
