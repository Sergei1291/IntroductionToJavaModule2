package by.epamtc.module2.main;

/*
 * Написать методы для нахождения НОД четырех натуральных чисел.
 */

public class DecompositionArr02 {

	public static void main(String[] args) {

		int[] array;

		array = createArray(4);

		printArray(array);
		System.out.println("NOD = " + findNOD(array));

	}

	private static int[] createArray(final int SIZE) {

		int[] arrNew = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			arrNew[i] = (int) (80 * Math.random());
		}

		return arrNew;
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "; ");
		}

		System.out.println();

	}

	private static int findNOD(int[] arr) {

		int valNOD = arr[0];
		int quantity;
		int[] arrElem;
		int[] arrNOD;

		for (int i = 1; i < arr.length; i++) {
			quantity = findQuantitySimpleDividers(arr[i]);
			arrElem = createArrSimpleDividers(arr[i], quantity);
			quantity = findQuantitySimpleDividers(valNOD);
			arrNOD = createArrSimpleDividers(valNOD, quantity);
			valNOD = 1;

			for (int k = 0; k < arrElem.length; k++) {

				for (int j = 0; j < arrNOD.length; j++) {
					if (arrElem[k] == arrNOD[j]) {
						valNOD = valNOD * arrElem[k];
						arrElem[k] = 1;
						arrNOD[j] = 1;
					}
				}

			}

		}

		return valNOD;
	}

	private static int findQuantitySimpleDividers(int value) {

		int quantity = 0;
		int i = 2;

		do {
			if ((value % i) == 0) {
				value = value / i;
				quantity++;
			} else {
				i++;
			}
		} while (i <= value);

		return quantity;
	}

	private static int[] createArrSimpleDividers(int elem, final int SIZE) {

		int[] arrSD = new int[SIZE];
		int j = 0;
		int i = 2;

		if (elem == 1) {
			arrSD = new int[1];
			arrSD[0] = 1;
		}

		do {
			if ((elem % i) == 0) {
				arrSD[j] = i;
				elem = elem / i;
				j++;
			} else {
				i++;
			}
		} while (i <= elem);

		return arrSD;
	}

}