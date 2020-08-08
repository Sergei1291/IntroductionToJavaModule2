package by.epamtc.module2.main;

/*
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но
 * больше других элементов).
 */

public class DecompositionArr05 {

	public static void main(String[] args) {

		int[] arrayA;
		int maxArrayA;
		int indexPreMaxArrayA;

		arrayA = createArrayA(10);
		maxArrayA = findMaxElemArr(arrayA);
		indexPreMaxArrayA = findIndexPreMaxElemArr(arrayA, maxArrayA);

		printArray(arrayA);

		if (indexPreMaxArrayA != (-1)) {
			System.out.println(arrayA[indexPreMaxArrayA]);
		} else {
			System.out.println("All elements equal to each other");
		}

	}

	private static int[] createArrayA(final int SIZE) {

		int[] arrNew = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			arrNew[i] = (int) (20 * Math.random());
		}

		return arrNew;
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "; ");
		}

		System.out.println();

	}

	private static int findMaxElemArr(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

	private static int findIndexPreMaxElemArr(int[] arr, int maxArr) {

		int indexPreMax = -1;
		int i;

		for (i = 0; i < arr.length; i++) {
			if (arr[i] < maxArr) {
				indexPreMax = i;
			}
		}

		if (indexPreMax != (-1)) {

			for (i = 0; i < arr.length; i++) {
				if ((arr[i] > arr[indexPreMax]) && (arr[i] < maxArr)) {
					indexPreMax = i;
				}
			}

		}

		return indexPreMax;
	}

}