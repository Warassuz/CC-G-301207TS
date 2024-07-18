package arrr;

public class Rekurs1 {
	
		//Rekursive Funktion, die die Summe der Elemente berechnet:
		public static int sumArray(int[] array, int index) {
		//Stellt sicher, dass die Rekursion stoppt, wenn das Ende des Arrays ereeicht ist:
		if (index == array.length) {
			return 0;
		}
		//Addiert das aktuelle Array-Element zum Ergebnis des nächsten rekursiven Aufrufs:
		return array[index] + sumArray(array, index + 1);
	}

	public static void main(String[] args) {
		int[] numbers = {1, 3, 16};
		int sum = sumArray(numbers, 0);
		System.out.println("Die Summe der Elemente im Array ist: " + sum);
	}

}