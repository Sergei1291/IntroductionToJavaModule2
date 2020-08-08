package by.epamtc.module2.main;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
 * больше последнего.
 */

public class MultidimensionalArr01 {

	public static void main(String[] args) {

		int[][] array;
		int counter = 0;

		array = createArray(3, 11);

		printArray(array);

		while (counter < array[0].length) {
			if (array[0][counter] > array[array.length - 1][counter]) {
				printColumn(array, counter);
			}
			counter += 2;
		}

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

	private static void printColumn(int[][] arr, int column) {

		System.out.print("\nColumn " + (column + 1) + ": ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][column] + "; ");
		}

	}

}