package by.epamtc.module2.main;

/*
 * Дана последовательность действительных чисел a_1, a_2...a_n. Заменить все ее
 * члены, больше данного Z, этим числом. Подсчитать количество замен.
 */

public class Array02 {

	public static void main(String[] args) {

		double valueZ = 300;

		int enumerator = 0;
		double[] array = new double[10];

		for (int i = 0; i < array.length; i++) {
			if (Math.random() > 0.5) {
				array[i] = 1000 * Math.random();
			} else {
				array[i] = -1000 * Math.random();
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%.1f; ", array[i]);
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (array[i] > valueZ) {
				enumerator++;
				array[i] = valueZ;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%.1f; ", array[i]);
		}
		System.out.println();

		System.out.println("Number of replacements = " + enumerator);

	}

}