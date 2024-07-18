package arrr;

class TreeKnot {
	int value;
	TreeKnot left, right;
	
	TreeKnot(int item) {
		value = item;
		left = right = null;
	}
	
	//Rekursive Berechnung der Höhe des Baumes:
	public static int heightTree(TreeKnot root) {
		//Für den Fall, dass TreeKnot gleich Null ist:
		if (root == null) {
			return 0;
		}
		//Rekursiv: Berechnung der Höhe des linken und rechten Teilbaums
		int leftHeight = heightTree(root.left);
		int rightHeight = heightTree(root.right);
		
		//Rückgabe der größeren Höhe + 1
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
public static void main(String[] args) {
	TreeKnot root = new TreeKnot(1);
	root.left = new TreeKnot(2);
	root.right = new TreeKnot(3);
	root.left.left = new TreeKnot(4);
	root.left.right = new TreeKnot(5);
	root.right.left = new TreeKnot(6);
	root.right.right = new TreeKnot(7);
	// Ergebnis Baumhöhe 4, mit einer weiteren Verzweigung:
	root.left.left.right = new TreeKnot(8);
	
	int height = heightTree(root);
	System.out.println("Die Höhe des Baumes ist: " + height);
}
}
