package by.epamtc.module2.main;

/*
 * Сортировка Шелла. Дан массив чисел. Требуется упорядочить его по ВОЗРАСТАНИЮ.
 * Сравниваются два соседних элемента. Если a_i<=a_(i+1), то продвигаются на
 * один элемент вперед. Если a_i>a_(i+1), то производится перестановка и
 * сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */

public class SortingArr6 {

	public static void main(String[] args) {

		int[] array;

		array = createArray(8);

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

	private static void sortArray(int[] array) {

		int i = 0;
		int value;

		while ((i + 1) < array.length) {
			if (array[i] > array[i + 1]) {
				value = array[i];
				array[i] = array[i + 1];
				array[i + 1] = value;
				if (i != 0) {
					i--;
				}
			} else {
				i++;
			}
		}

	}

}