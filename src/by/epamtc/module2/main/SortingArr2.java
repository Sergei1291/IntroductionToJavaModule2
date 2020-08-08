package by.epamtc.module2.main;

/*
 * Даны две последовательности a_1<=a_2...<=a_n и b_1<=b_2...<=b_m. Образовать
 * новую последовательность чисел так, чтобы она тоже была неубывающей.
 * Дополнительный массив не использовать.
 */

public class SortingArr2 {

	public static void main(String[] args) {

		int[] arr1;
		int[] arr2;
		int[] result;

		arr1 = createArray(6);
		arr2 = createArray(8);
		result = new int[arr1.length + arr2.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = i < arr1.length ? arr1[i] : arr2[i - arr1.length];
		}

		sortArray(result);

		printArray(arr1);
		printArray(arr2);
		printArray(result);

	}

	private static int[] createArray(final int SIZE) {

		int[] arrNew = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			arrNew[i] = (int) (10 * Math.random());
		}

		return arrNew;
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "; ");
		}

		System.out.println();

	}

	private static void sortArray(int[] arr) {

		int valueSort;

		for (int i = 0; i < (arr.length - 1); i++) {

			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					valueSort = arr[j];
					arr[j] = arr[i];
					arr[i] = valueSort;
				}
			}

		}

	}

}