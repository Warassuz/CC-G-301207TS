package arrr;

public class Swap {

	public static void main(String[] args) {
		int[] feld = {4, 2, 10, 3, -5, 0, 17};
 		
		System.out.print("Feld: ");
		for (int num : feld) {
			System.out.print(num + " ");
		}
		
	System.out.println();
	
	int param1 = 3;
	int param2 = 5;
	
	System.out.println("Parameter 1: " + param1);
	System.out.println("Parameter 2: " + param2);

	
	swap(feld, param1, param2);
	
	System.out.print("Neues Feld: ");
	for (int num : feld) {
		System.out.print(num + " ");
	}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
}
