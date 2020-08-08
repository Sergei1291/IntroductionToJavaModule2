package by.epamtc.module2.main;

/*
 * Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */

public class MultidimensionalArr13 {

	public static void main(String[] args) {

		int[][] array;

		array = createArray(10, 4);

		printArray(array);
		System.out.print("\n");

		sortColumnMinMax(array);
		printArray(array);
		System.out.print("\n");

		sortingColumnMaxMin(array);
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

	private static void sortColumnMinMax(int[][] arrSort) {

		int valueSort;

		for (int j = 0; j < arrSort[0].length; j++) {

			for (int i = 0; i < (arrSort.length - 1); i++) {

				for (int k = (i + 1); k < arrSort.length; k++) {
					if (arrSort[i][j] > arrSort[k][j]) {
						valueSort = arrSort[i][j];
						arrSort[i][j] = arrSort[k][j];
						arrSort[k][j] = valueSort;
					}
				}

			}

		}

	}

	private static void sortingColumnMaxMin(int[][] arrSort) {

		int valueSort;

		for (int j = 0; j < arrSort[0].length; j++) {

			for (int i = 0; i < (arrSort.length - 1); i++) {

				for (int k = (i + 1); k < arrSort.length; k++) {
					if (arrSort[i][j] < arrSort[k][j]) {
						valueSort = arrSort[i][j];
						arrSort[i][j] = arrSort[k][j];
						arrSort[k][j] = valueSort;
					}
				}

			}

		}

	}

}