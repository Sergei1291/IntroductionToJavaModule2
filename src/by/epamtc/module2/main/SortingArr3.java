package by.epamtc.module2.main;

/*
 * Сортировка выбором. Дана последовательность чисел. Требуется переставить
 * элементы так, чтобы они были расположены по УБЫВАНИЮ. В массиве, начиная с
 * первого, выбирается наибольший элемент и ставится на место первого, а первый
 * - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
 */

public class SortingArr3 {

	public static void main(String[] args) {

		int[] array;

		array = createArray(10);

		printArray(array);
		sortArray(array);
		printArray(array);

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

		int max;
		int indexMaxElem;
		int valueSort;

		for (int i = 0; i < (arr.length - 1); i++) {
			indexMaxElem = i;
			max = arr[i];

			for (int j = (i + 1); j < arr.length; j++) {
				if (max < arr[j]) {
					max = arr[j];
					indexMaxElem = j;
				}
			}

			valueSort = arr[i];
			arr[i] = arr[indexMaxElem];
			arr[indexMaxElem] = valueSort;
		}

	}

}