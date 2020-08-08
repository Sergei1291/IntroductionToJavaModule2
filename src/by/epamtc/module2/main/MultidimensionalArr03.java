package by.epamtc.module2.main;

/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class MultidimensionalArr03 {

	public static void main(String[] args) {

		int kLine = 3;
		int pColumn = 2;

		int[][] array;

		array = createArray(4, 7);

		printArray(array);

		if ((kLine <= array.length) && (pColumn <= array[0].length)) {
			printLine(array, kLine);
			printColumn(array, pColumn);
		} else {
			System.out.println("Incorrect input");
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

	private static void printLine(int[][] arr, int line) {

		System.out.print("\n" + line + " line: ");

		for (int i = 0; i < arr[line].length; i++) {
			System.out.print(arr[line - 1][i] + "; ");
		}

	}

	private static void printColumn(int[][] arr, int column) {

		System.out.print("\n" + column + " column: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][column - 1] + "; ");
		}

	}

}