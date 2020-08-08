package by.epamtc.module2.main;

/*
 * Сортировка вставками. Дана последовательность чисел. Требуется переставить
 * числа в порядке ВОЗРАСТАНИЯ. Пусть a_1...a_i - упорядоченная
 * последовательность. Берется следующее число a_(i+1) и вставляется в
 * последовательность так, чтобы новая последовательность была также
 * возрастающей. Процесс продолжается до тех пор, пока все элементы не будут
 * перебраны. Место помещения очередного элемента в отсортированную часть
 * производить с помощью двоичного поиска, который оформить в виде отдельной
 * функции.
 */

public class SortingArr5 {

	public static void main(String[] args) {

		int[] array;

		array = createArray(10);

		printArray(array);
		sortArray(array);

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

		int index;
		int elem;

		for (int i = 1; i < arr.length; i++) {
			index = findIndexBinarySearch(arr, i);
			elem = arr[i];

			for (int j = i; j != index; j--) {
				arr[j] = arr[j - 1];
			}

			arr[index] = elem;
			printArray(arr);
		}

	}

	private static int findIndexBinarySearch(int[] arr, int indexSort) {

		int minIndex = 0;
		int maxIndex = (indexSort + 1);

		do {
			int numElem = (minIndex + maxIndex) / 2;
			if (arr[indexSort] >= arr[numElem - 1]) {
				minIndex = numElem;
			} else {
				maxIndex = numElem;
			}
		} while ((maxIndex - minIndex) != 1);

		return (maxIndex - 1);
	}

}