package by.epamtc.module2.main;

/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто
 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
 * них.
 */

public class Array09 {

	public static void main(String[] args) {

		int frequency;
		int maxFreq;
		int min;
		int[] array = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 3, 4, 3, 2, 1 };
		int[] arrayFrequency;

		arrayFrequency = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			frequency = 0;

			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					frequency++;
				}
			}

			arrayFrequency[i] = frequency;
		}

		maxFreq = arrayFrequency[0];
		min = array[0];

		for (int i = 1; i < arrayFrequency.length; i++) {
			if (arrayFrequency[i] > maxFreq) {
				maxFreq = arrayFrequency[i];
				min = array[i];
			}
			if ((arrayFrequency[i] == maxFreq) && (array[i] < min)) {
				min = array[i];
			}
		}

		System.out.println(min);

	}

}