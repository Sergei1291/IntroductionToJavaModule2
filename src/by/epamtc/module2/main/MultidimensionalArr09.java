package by.epamtc.module2.main;

/*
 * Задана матрица неотрицательных чисел. Подсчитать сумму элементов в каждом
 * столбце. Определить, какой столбец содержит максимальную сумму.
 */

public class MultidimensionalArr09 {

	public static void main(String[] args) {

		int max;
		int[][] array;
		int[] arrSumColumn;

		array = createArray(4, 10);
		arrSumColumn = new int[array[0].length];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				arrSumColumn[j] += array[i][j];
			}

		}

		printArray(array);
		System.out.println();

		for (int i = 0; i < arrSumColumn.length; i++) {
			System.out.print(arrSumColumn[i] + "; ");
		}

		System.out.println();

		max = arrSumColumn[0];

		for (int i = 0; i < arrSumColumn.length; i++) {
			if (max < arrSumColumn[i]) {
				max = arrSumColumn[i];
			}
		}

		for (int i = 0; i < arrSumColumn.length; i++) {
			if (max == arrSumColumn[i]) {
				System.out.println("number column with max sum = " + (i + 1));
			}
		}

	}

	private static int[][] createArray(final int LINE, final int COLUMN) {

		int[][] arrNew = new int[LINE][COLUMN];

		for (int i = 0; i < arrNew.length; i++) {

			for (int j = 0; j < arrNew[i].length; j++) {
				arrNew[i][j] = (int) (10 * Math.random());
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