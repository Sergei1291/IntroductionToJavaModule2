package by.epamtc.module2.main;

/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами.
 */

public class Array06 {

	public static void main(String[] args) {

		int valueN = 15;

		double sum = 0;
		double[] array;

		array = new double[valueN];

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

		for (int i = 1; i < array.length; i++) {
			if (isSimpleNumber(i + 1)) {
				sum += array[i];
			}
		}

		System.out.printf("sum elements, index = simple number, = %.1f", sum);

	}

	private static boolean isSimpleNumber(int val) {

		int i = 2;

		while (i < val) {
			if (val % i == 0) {
				return false;
			}
			i++;
		}

		return true;
	}

}