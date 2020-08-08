package by.epamtc.module2.main;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn,
 * составленная из чисел 1, 2, 3... n^2 так, что суммы по каждому столбцу,
 * каждой строке и каждой из двух больших диагоналей равны между собой.
 * Построить такой квадрат.
 */

public class MultidimensionalArr16 {

	public static void main(String[] args) {

		int n = 4;

		int nn = n * n;
		int[] arrayLine = new int[nn];
		int[][] arraySquare = new int[n][n];
		int amount = 0;
		int valHelp;

		for (int i = 0; i < nn; i++) {
			arrayLine[i] = i + 1;
			amount += (i + 1);
		}

		amount = amount / n;

		while (arrayLine[0] != 0) {

			do {
				valHelp = 0;
				sortArray(arrayLine);

				for (int i = 0; i < n; i++) {
					valHelp += arrayLine[i];
				}

			} while (valHelp != amount);

			createArraySquare(arrayLine, arraySquare);
			if (compareValues(arraySquare, amount)) {
				printArraySquare(arraySquare);
			}
		}

	}

	private static void sortArray(int[] arr) { // Algorithm Naraiany.

		int valHelp;
		int middle;
		int i;
		int j;

		i = arr.length - 2;

		while ((i >= 0) && (arr[i] > arr[i + 1])) {
			i--;
		}

		if (i == -1) {
			arr[0] = 0;
			return;
		}
		j = arr.length - 1;

		while (arr[j] < arr[i]) {
			j--;
		}

		valHelp = arr[j];
		arr[j] = arr[i];
		arr[i] = valHelp;
		middle = (i + arr.length + 1) / 2;

		for (int k = (i + 1), m = (arr.length - 1); k < middle; k++, m--) {
			valHelp = arr[k];
			arr[k] = arr[m];
			arr[m] = valHelp;
		}

	}

	private static void createArraySquare(int[] arr, int[][] arrSquare) {

		int counter = 0;

		for (int i = 0; i < arrSquare.length; i++) {

			for (int j = 0; j < arrSquare[i].length; j++) {
				arrSquare[i][j] = arr[counter];
				counter++;
			}

		}

	}

	private static boolean compareValues(int[][] arrSquare, int valCompare) {

		int size = arrSquare.length;
		int diagonalOne = 0;
		int diagonalTwo = 0;
		int valHelp;

		for (int i = 0; i < size; i++) {
			diagonalOne += arrSquare[i][i];
			diagonalTwo += arrSquare[i][size - 1 - i];
		}

		if ((diagonalOne != valCompare) || (diagonalTwo != valCompare)) {
			return false;
		}

		for (int i = 0; i < size; i++) {
			valHelp = 0;

			for (int j = 0; j < size; j++) {
				valHelp += arrSquare[i][j];
			}

			if (valHelp != valCompare) {
				return false;
			}
		}

		for (int j = 0; j < size; j++) {
			valHelp = 0;

			for (int i = 0; i < size; i++) {
				valHelp += arrSquare[i][j];
			}

			if (valHelp != valCompare) {
				return false;
			}
		}

		return true;
	}

	private static void printArraySquare(int[][] arrSquare) {

		for (int i = 0; i < arrSquare.length; i++) {
			System.out.print("[");

			for (int j = 0; j < arrSquare[i].length; j++) {
				System.out.print(arrSquare[i][j] + " ");
			}

			System.out.print("]\n");
		}

		System.out.print("\n");

	}

}