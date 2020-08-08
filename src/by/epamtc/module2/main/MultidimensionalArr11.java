package by.epamtc.module2.main;

/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
 * матрицу и номера строк, в которых число 5 встречается три и более раз.
 */

public class MultidimensionalArr11 {

	public static void main(String[] args) {

		int[][] array;
		int[] counter;
		int j;

		array = createArray(10, 20);
		counter = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			j = 0;

			while ((counter[i] < 3) && (j < array[i].length)) {
				if (array[i][j] == 5) {
					counter[i] += 1;
				}
				j++;
			}

		}

		printArray(array);

		System.out.print("numbers line - ");

		for (int i = 0; i < counter.length; i++) {
			if (counter[i] == 3) {
				System.out.print((i + 1) + "; ");
			}
		}

	}

	private static int[][] createArray(final int LINE, final int COLUMN) {

		int[][] arrNew = new int[LINE][COLUMN];

		for (int i = 0; i < arrNew.length; i++) {

			for (int j = 0; j < arrNew[i].length; j++) {
				arrNew[i][j] = (int) (16 * Math.random());
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