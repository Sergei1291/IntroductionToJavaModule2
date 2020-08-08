package by.epamtc.module2.main;

/*
 * Даны действительные числа a_1, a_2...a_2n. Найти max(a_1 + a_2n, a_2 +
 * a_2n-1...).
 */

public class Array07 {

	public static void main(String[] args) {

		int valueN = 5;

		double max;
		double[] array;

		array = new double[2 * valueN];

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

		max = array[0] + array[2 * valueN - 1];

		for (int i = 1; i < valueN; i++) {
			if (max < (array[i] + array[2 * valueN - i - 1])) {
				max = array[i] + array[2 * valueN - i - 1];
			}
		}

		System.out.printf("max = %.1f", max);

	}

}