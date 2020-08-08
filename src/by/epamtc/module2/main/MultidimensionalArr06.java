package by.epamtc.module2.main;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу (n - четное).
 */

public class MultidimensionalArr06 {

	public static void main(String[] args) {

		int sizeN = 13;

		int counter1 = 0;
		int counter2 = 1;
		int[][] array;

		sizeN = (sizeN / 2) * 2;
		array = new int[sizeN][sizeN];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				if ((j >= counter1) && (j <= (array[i].length - 1 - counter1))) {
					array[i][j] = 1;
				}
			}

			if (counter2 < (array.length / 2)) {
				counter1++;
				counter2++;
			} else if (counter2 == (array.length / 2)) {
				counter2++;
			} else {
				counter1--;
				counter2++;
			}
		}

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "; ");
			}

			System.out.println();
		}

	}

}