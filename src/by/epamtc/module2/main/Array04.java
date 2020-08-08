package by.epamtc.module2.main;

/*
 * Даны действительные числа a_1, a_2...a_n. Поменять местами наибольший и
 * наименьший элементы.
 */

public class Array04 {

	public static void main(String[] args) {

		double[] arrayMaxMin;
		double[] array = new double[10];

		for (int i = 0; i < array.length; i++) {
			if (Math.random() > 0.5) {
				array[i] = 100 * Math.random();
			} else {
				array[i] = -100 * Math.random();
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%.1f; ", array[i]);
		}
		System.out.println();

		arrayMaxMin = new double[] { array[0], 0, array[0], 0 };

		for (int i = 1; i < array.length; i++) {
			if (array[i] > arrayMaxMin[0]) {
				arrayMaxMin[0] = array[i];
				arrayMaxMin[1] = i;
			}
			if (array[i] < arrayMaxMin[2]) {
				arrayMaxMin[2] = array[i];
				arrayMaxMin[3] = i;
			}
		}

		array[(int) arrayMaxMin[1]] = arrayMaxMin[2];
		array[(int) arrayMaxMin[3]] = arrayMaxMin[0];

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%.1f; ", array[i]);
		}

	}

}