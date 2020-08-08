package by.epamtc.module2.main;

import java.util.Scanner;

/*
 * Сформировать случайную матрицу mxn, состоящую из нулей и единиц, причем в
 * каждом столбце число единиц равно номеру столбца.
 */

public class MultidimensionalArr14 {

	public static void main(String[] args) {

		int mSize;
		int nSize;
		int[][] array;

		do {
			mSize = readScanner("Input size m: ");
		} while (mSize < 0);

		do {
			nSize = readScanner("Input size n <= m: ");
		} while ((nSize < 0) || (mSize < nSize));

		array = createArray(mSize, nSize);

		printArray(array);

	}

	private static int readScanner(String message) {

		int value;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print(message);

		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}

		value = scan.nextInt();

		return value;
	}

	private static int[][] createArray(final int LINE, final int COLUMN) {

		int lineRand;
		int counter1;
		int counter2;
		int[][] arrNew = new int[LINE][COLUMN];

		for (int j = 0; j < COLUMN; j++) {
			counter1 = 0;

			while (counter1 < (j + 1)) {
				lineRand = (int) (LINE * Math.random());
				arrNew[lineRand][j] = 1;
				counter1++;
				counter2 = 0;

				for (int i = 0; i < arrNew.length; i++) {
					if (arrNew[i][j] == 1) {
						counter2++;
					}
				}

				if (counter2 < counter1) {
					counter1--;
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