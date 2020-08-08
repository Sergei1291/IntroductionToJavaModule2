package by.epamtc.module2.main;

/*
 * Пусть даны две неубывающие последовательности чисел. Требуется указать те
 * места, на которые нужно вставлять элементы второй послетовательности в первую
 * последовательность так, чтобы новая последовательность оставалась
 * неубывающей.
 */

public class SortingArr7 {

	public static void main(String[] args) {

		int[] arrayA;
		int[] arrayB;

		arrayA = createArray(7);
		arrayB = createArray(5);

		sortArray(arrayA);
		sortArray(arrayB);
		printArray(arrayA);
		printArray(arrayB);

		for (int i = 0; i < arrayB.length; i++) {

			for (int j = 0; j < (arrayA.length - 1); j++) {
				if ((arrayB[i] <= arrayA[j + 1]) && (arrayB[i] >= arrayA[j])) {
					System.out.println("A" + (j + 1) + " <= B" + (i + 1) + " <= A" + (j + 2));
				}
			}

			if (arrayB[i] <= arrayA[0]) {
				System.out.println("B" + (i + 1) + " <= A1");
			}
			if (arrayB[i] >= arrayA[arrayA.length - 1]) {
				System.out.println("A" + arrayA.length + " <= B" + (i + 1));
			}

		}

	}

	private static int[] createArray(final int SIZE) {

		int[] arrNew = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			arrNew[i] = (int) (30 * Math.random());
		}

		return arrNew;
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "; ");
		}

		System.out.println();

	}

	private static void sortArray(int[] arrS) {

		int valueSort;

		for (int i = 0; i < (arrS.length - 1); i++) {

			for (int j = 0; j < (arrS.length - 1 - i); j++) {
				if (arrS[j] > arrS[j + 1]) {
					valueSort = arrS[j];
					arrS[j] = arrS[j + 1];
					arrS[j + 1] = valueSort;
				}
			}

		}

	}

}