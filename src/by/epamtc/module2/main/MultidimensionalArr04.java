package by.epamtc.module2.main;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу (n - четное).
 */

public class MultidimensionalArr04 {

	public static void main(String[] args) {

		int sizeN = 9;
		int[][] array;

		array = new int[sizeN][sizeN];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				if ((i % 2) == 0) {
					array[i][j] = j + 1;
				} else {
					array[i][j] = array.length - j;
				}
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