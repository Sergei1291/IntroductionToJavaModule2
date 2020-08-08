package by.epamtc.module2.main;

/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class MultidimensionalArr02 {

	public static void main(String[] args) {

		int size = 10;
		int[][] array;

		array = createArray(size, size);

		printArray(array);
		printDiagonal(array);

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

	private static void printDiagonal(int[][] arr) {

		System.out.print("\nDiagonal: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + "; ");
		}

	}

}