package arrr;

public class Delete {

	public static void main(String[] args) {
		
	int[] arr = {3, 4, 1, 9, -5, 4};
		
		System.out.print("Feld: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		int valueToDelete = 9;

		int[] newArr = deleteArrayElement(arr, valueToDelete);
		
		System.out.print("  Neues Feld: ");
		for (int num: newArr) {
			System.out.print(num + " ");
		}
	}

	public static int[] deleteArrayElement(int[] a, int w) {
		int indexToDelete = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == w) {
				indexToDelete = i;
				break;
			}
		}
		
		if (indexToDelete == -1) {
			return a;
		}
		
		int[] newArray = new int[a.length -1];
		System.arraycopy(a, 0, newArray, 0, indexToDelete);
		System.arraycopy(a, indexToDelete + 1, newArray, indexToDelete, a.length - indexToDelete - 1);
		
		return newArray;
	}
	
}
