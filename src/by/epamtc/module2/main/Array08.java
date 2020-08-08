package by.epamtc.module2.main;

/*
 * Дана последовательность целых чисел a_1, a_2...a_n. Образовать новую
 * последовательность, выбросив из исходной те члены, которые равны min(a_1,
 * a_2...a_n).
 */

public class Array08 {

	public static void main(String[] args) {

		int[] array = new int[15];
		int min;
		int j = 0;

		for (int i = 0; i < array.length; i++) {
			if (Math.random() > 0.5) {
				array[i] = (int) (5 * (Math.random()));
			} else {
				array[i] = (int) (-5 * (Math.random()));
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "; ");
		}
		System.out.println();

		min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			array[i - j] = array[i];
			if (array[i] == min) {
				j++;
			}
		}

		for (int i = (array.length - j); i < array.length; i++) {
			array[i] = 0;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "; ");
		}

	}

}