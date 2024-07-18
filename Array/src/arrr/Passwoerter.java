package arrr;

public class Passwoerter {

	public static void main(String[] args) {
		//Array mit Passwörtern
		String[] passwoerter = {"Pass1234", "12345", "ABC22", "$uP3rP@SsW0r7"};
		
		//Überprüfung jedes Passwortes und Ausgabe des Ergebnisses:
		for (String passwort: passwoerter ) {
			if (isStrong(passwort)) {
				System.out.printf("Das Passwort %s ist stark.%n", passwort);
			} else {
				System.out.printf("Das Passwort %s ist schwach.%n", passwort);
			}
		}
	}

		//Methode zur Überprüfung
	public static boolean isStrong(String password) {
		//Überprüfung der Länge
		if (password.length() < 8) {
			return false;
		}
		
		boolean hasLetter = false;
		boolean hasDigit = false;
		
		//Überprüfung nach Buchstaben und Zahlen
		for (char ch : password.toCharArray()) {
			if (Character.isLetter(ch)) {
				hasLetter = true;
			} else if (Character.isDigit(ch)) {
				hasDigit = true;
			}
		//Wenn beides gefunden wurde, ist das Passwort stark
			if (hasLetter && hasDigit) {
				return true;
			}
		}
		//Falls nicht beide Bedingungen erfüllt sind
		return false;
	}
}
