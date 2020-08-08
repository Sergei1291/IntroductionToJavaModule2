package by.epamtc.module2.main;

/*
 * Сформировать квадратную матрицу порядка n по правилу: A[I, J] = sin((I^2 -
 * J^2) / N). И подсчитать количество положительных элементов в ней.
 */

public class MultidimensionalArr07 {

	public static void main(String[] args) {

		int sizeN = 6;

		int counter = 0;
		double[][] array;
		double valueSin;

		array = new double[sizeN][sizeN];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				valueSin = (i + 1) * (i + 1) - (j + 1) * (j + 1);
				valueSin = Math.toRadians(valueSin / sizeN);
				array[i][j] = Math.sin(valueSin);
			}

		}

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%.3f; ", array[i][j]);
			}

			System.out.println();
		}

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > 0) {
					counter++;
				}
			}

		}

		System.out.println("\nQuantity elements > 0 = " + counter);

	}

}