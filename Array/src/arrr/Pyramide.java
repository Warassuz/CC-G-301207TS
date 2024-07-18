package arrr;

import java.util.Scanner;

public class Pyramide {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Nach Höhe der Pyramide fragen
		System.out.print("Geben Sie die gewünschte Höhe der Pyramide ein: ");
		int height = scanner.nextInt();
		
		// Pyramide aus Sternen drucken
		printStarPyramid(height);
	}
	
	public static void printStarPyramid(int height) {
		for (int i = 1; i <= height; i++) {
			// Leerzeichen drucken
			for (int j = height - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Sterne drucken
			for (int k = 0; k < (2 * i -1); k++) {
				System.out.print("*");
			}
			// Neue Zeile für die nächste Stufe der Pyramide
			System.out.println();
		}
	}

}
