package arrr;

import java.util.Scanner;

public class Rekurs2 {
		
		//Rekursive Funktion zur Umkehr des Strings:
		public static String reverseString(String s) {
			//Falls der String leer oder nur ein Zeichen ist:
			if (s.isEmpty()) {
				return s;
			}
			//Rekursiv: Letztes Zeichen + Umkehrung des restlichen Strings
			//substring erzeugt eine neue Zeichenkette, die alle Zeichen ab dem 2. Zeichen[1] enthält
			//charAt(0) gibt das erste Zeichen der Zeichenkette aus
			//Beispiel: "Hello" -> reverseString("ello") + 'H' und nach Beendigung isEmpty, Rückgabe s.
			return reverseString(s.substring(1)) + s.charAt(0);
		}
		
		public static void main(String[] args) {
			//Optionaler Scanner zur Eingabe eines Textes:
			Scanner scanner = new Scanner(System.in);
			System.out.println("Geben Sie ein Wort ein, um es zu invertieren: ");
			String original = scanner.nextLine();
			scanner.close();
			
			//String umkehren
			String reversed = reverseString(original);
			System.out.println("Der umgekehrte String ist: " + reversed);
		}
}