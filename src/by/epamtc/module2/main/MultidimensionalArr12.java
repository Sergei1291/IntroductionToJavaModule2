package by.epamtc.module2.main;

/*
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class MultidimensionalArr12 {

	public static void main(String[] args) {

		int[][] array;

		array = createArray(4, 10);

		printArray(array);
		System.out.print("\n");

		sortLineMinMax(array);
		printArray(array);
		System.out.print("\n");

		sortLineMaxMin(array);
		printArray(array);

	}

	private static int[][] createArray(final int LINE, final int COLUMN) {

		int[][] arrNew = new int[LINE][COLUMN];

		for (int i = 0; i < LINE; i++) {

			for (int j = 0; j < COLUMN; j++) {
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

	private static void sortLineMinMax(int[][] arrSort) {

		int valueSort;

		for (int i = 0; i < arrSort.length; i++) {

			for (int j = 0; j < (arrSort[i].length - 1); j++) {

				for (int k = (j + 1); k < arrSort[i].length; k++) {
					if (arrSort[i][j] > arrSort[i][k]) {
						valueSort = arrSort[i][j];
						arrSort[i][j] = arrSort[i][k];
						arrSort[i][k] = valueSort;
					}
				}

			}

		}

	}

	private static void sortLineMaxMin(int[][] arrSort) {

		int valueSort;

		for (int i = 0; i < arrSort.length; i++) {

			for (int j = 0; j < (arrSort[i].length - 1); j++) {

				for (int k = (j + 1); k < arrSort[i].length; k++) {
					if (arrSort[i][j] < arrSort[i][k]) {
						valueSort = arrSort[i][j];
						arrSort[i][j] = arrSort[i][k];
						arrSort[i][k] = valueSort;
					}
				}

			}

		}

	}

}