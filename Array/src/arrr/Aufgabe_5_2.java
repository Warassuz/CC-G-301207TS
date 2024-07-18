package arrr;

import java.util.Arrays;

public class Aufgabe_5_2 {

	public static void main(String[] args) {
		
		int[] feld1 = new int[20];
		int[] feld2 = new int[20];
		
		for (int i = 0; i < feld1.length; i++) {
			feld1[i] = (int) (Math.random() * 100) * 2;
		}
		
		for (int i = 0; i < feld2.length; i++) {
			feld2[i] = (int) (Math.random() * 100);
		}
		
		Arrays.sort(feld2);
		
		System.out.println("Feld 1 (gerade Zufallszahlen): " + Arrays.toString(feld1));
		System.out.println("Feld 2 (aufsteigend sortierte Zuffalszahlen): " + Arrays.toString(feld2));
	}

}
