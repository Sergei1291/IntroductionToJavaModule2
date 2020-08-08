package by.epamtc.module2.main;

/*
 * Сортировка обменами. Дана последовательность чисел. Требуется переставить
 * числа в порядке ВОЗРАСТАНИЯ. Сравниваются два соседних числа. Если a_i >
 * a_(i+1), то делается перестановка. Так продолжается до тех пор, пока все
 * элементы не станут расположены в порядке возрастания. Составить алгоритм
 * сортировки, подсчитывая при этом количество перестановок.
 */

public class SortingArr4 {

	public static void main(String[] args) {

		int[] array;
		int valueSort;
		int counter = 0;

		array = createArray(8);

		printArray(array);

		for (int i = 0; i < (array.length - 1); i++) {

			for (int j = 0; j < (array.length - 1 - i); j++) {
				if (array[j] > array[j + 1]) {
					valueSort = array[j];
					array[j] = array[j + 1];
					array[j + 1] = valueSort;
					counter++;
				}
			}

		}

		printArray(array);
		System.out.print("Quantity replacement = " + counter);

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

}