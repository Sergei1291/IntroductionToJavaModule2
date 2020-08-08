package by.epamtc.module2.main;

/*
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
 * в нем отрицательных, положительных и нулевых элементов.
 */

public class Array03 {

	public static void main(String[] args) {

		int valueN = 10;

		int[] arrayQuantity = { 0, 0, 0 };
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

		for (double value : array) {
			if (value < 0) {
				arrayQuantity[0]++;
			} else if (value == 0) {
				arrayQuantity[1]++;
			} else {
				arrayQuantity[2]++;
			}
		}

		System.out.println("elements < 0 - " + arrayQuantity[0]);
		System.out.println("elements = 0 - " + arrayQuantity[1]);
		System.out.println("elements > 0 - " + arrayQuantity[2]);

	}

}