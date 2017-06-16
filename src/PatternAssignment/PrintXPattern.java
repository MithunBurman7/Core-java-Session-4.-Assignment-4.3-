package PatternAssignment;

public class PrintXPattern {

	public static void main(String[] args) {

		int size = 6;

		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (row == col || row + col == size - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
