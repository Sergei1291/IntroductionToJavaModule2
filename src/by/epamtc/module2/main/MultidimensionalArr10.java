package by.epamtc.module2.main;

/*
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class MultidimensionalArr10 {

	public static void main(String[] args) {

		int[][] array = createArray(8);

		int counter = 0;
		int[] arrNew;

		printArray(array);

		for (int i = 0; i < array.length; i++) {
			if (array[i][i] > 0) {
				counter++;
			}
		}

		arrNew = new int[counter];
		counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i][i] > 0) {
				arrNew[counter] = array[i][i];
				counter++;
			}
		}

		System.out.print("\nElements of diagonal > 0: ");

		for (int i = 0; i < arrNew.length; i++) {
			System.out.print(arrNew[i] + "; ");
		}

	}

	private static int[][] createArray(final int SIZE) {

		int[][] arrNew = new int[SIZE][SIZE];

		for (int i = 0; i < SIZE; i++) {

			for (int j = 0; j < SIZE; j++) {
				if (Math.random() > 0.5) {
					arrNew[i][j] = (int) (10 * Math.random());
				} else {
					arrNew[i][j] = (int) (-10 * Math.random());
				}
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