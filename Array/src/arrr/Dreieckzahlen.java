package arrr;

public class Dreieckzahlen {

	public static void main(String[] args) {
		//Maximale Grenze für die Dreieckszahlen
		int max = 5;
		printCenteredTriangleNumbers(max);
	}
	
	public static void printCenteredTriangleNumbers(int max) {
		// Breite der Konsole für die Zentrierung
		int consoleWidth = 40;
		// Berechne Dreieckszahl von 1 bis max, erstelle Berechnungszeichenfolge
		for (int n = 1; n <= max; n++) {
			int triangleNumber = n * (n + 1) / 2;
			String calculation = getTriangleCalculation(n) + " = " + triangleNumber;
		// Drucke die zentrierte Ausgabe
			printCentered(calculation, consoleWidth);
		}
	}

	public static String getTriangleCalculation(int n) {
		// Berechnungszeichenfolge für die Dreieckszahl n
		StringBuilder calculation = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				calculation.append(i);
			} else {
				calculation.append(" + ").append(i);
			}
		}
		return calculation.toString();
	}
	
	public static void printCentered(String text, int width) {
		// Berechne den nötigen Abstand um die Zeichenfolge in der Mitte der Konsole 
		// anzuzeigen und druck die richtige Zeichenfolge
		int padding = (width - text.length()) / 2;
		for (int i = 0; i < padding; i++) {
			System.out.print(" ");
		}
		System.out.println(text);
	}
}
