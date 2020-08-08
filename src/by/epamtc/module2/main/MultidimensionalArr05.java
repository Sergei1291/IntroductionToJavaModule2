package by.epamtc.module2.main;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу (n - четное).
 */

public class MultidimensionalArr05 {

	public static void main(String[] args) {

		int sizeN = 11;
		int[][] array;

		sizeN = (sizeN / 2) * 2;
		array = new int[sizeN][sizeN];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < (array[i].length - i); j++) {
				array[i][j] = i + 1;
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