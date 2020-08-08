package by.epamtc.module2.main;

/*
 * Найдите наибольший элемент матрицы и замените все нечетные элементы на него.
 */

public class MultidimensionalArr15 {

	public static void main(String[] args) {

		int[][] array;
		int maxElem;

		array = createArray(5, 10);
		maxElem = array[0][0];

		printArray(array);
		System.out.println();

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				if (maxElem < array[i][j]) {
					maxElem = array[i][j];
				}
			}

		}

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				if ((array[i][j] % 2) == 1) {
					array[i][j] = maxElem;
				}
			}

		}

		printArray(array);

	}

	private static int[][] createArray(final int LINE, final int COLUMN) {

		int[][] arrNew = new int[LINE][COLUMN];

		for (int i = 0; i < arrNew.length; i++) {

			for (int j = 0; j < arrNew[i].length; j++) {
				arrNew[i][j] = (int) (100 * Math.random());
			}

		}

		return arrNew;
	}

	private static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "; ");
			}

			System.out.println();
		}

	}

}