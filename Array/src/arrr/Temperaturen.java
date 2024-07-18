package arrr;

public class Temperaturen {

	public static void main(String[] args) {
		// Temperaturen für 3 Städte und je 7 Tage
		double[][] temperatures = {
				{20.5, 22.3, 19.8, 21.0, 23.1, 20.4, 18.7}, // Stadt 1
				{15.5, 17.2, 16.3, 14.8, 15.7, 16.0, 14.9}, // Stadt 2
				{25.1, 26.3, 24.8, 25.7, 26.0, 24.5, 25.0}  // Stadt 3
		};
		
	
		//Berechnen + Ausgabe der durschnittlichen Temperaturen für jede Stadt
		for (int city = 0; city < temperatures.length; city++) {
			double sum = 0;
			for (int day = 0; day < temperatures[city].length; day++) {
				sum += temperatures[city][day];
			}
			double average = sum / temperatures[city].length;
			System.out.printf("Die durchschnittliche Temperatur für Stadt %d beträgt: %.1f°C%n", city + 1, average);
		}
	}

}
