package by.epamtc.module2.main;

/*
 * Написать методы для нахождения наибольшего общего делителя и наименьшего
 * общего кратного двух натуральных чисел. HOK(A,B) = A*B/HOD(A,B).
 */

public class DecompositionArr01 {

	public static void main(String[] args) {

		int valueA = 24;
		int valueB = 60;

		if ((valueA > 0) && (valueB > 0)) {
			System.out.println("NOK = " + findNOK(valueA, valueB));
			System.out.println("NOD = " + findNOD(valueA, valueB));
		} else {
			System.out.println("Incorrect input");
		}

	}

	private static int findNOK(int value1, int value2) {

		int quantity;
		int[] arrSimDiv1;
		int[] arrSimDiv2;
		int valueNOK;

		quantity = findQuantitySimpleDividers(value1);
		arrSimDiv1 = createArrSimpleDividers(value1, quantity);
		quantity = findQuantitySimpleDividers(value2);
		arrSimDiv2 = createArrSimpleDividers(value2, quantity);
		valueNOK = findValueNOK(arrSimDiv1, arrSimDiv2);

		return valueNOK;
	}

	private static int findNOD(int value1, int value2) {

		return (value1 * value2) / (findNOK(value1, value2));
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

	private static int findValueNOK(int[] arrA, int[] arrB) {

		int valueNOK = 1;

		for (int i = 0; i < arrA.length; i++) {
			valueNOK *= arrA[i];

			for (int j = 0; j < arrB.length; j++) {
				if (arrA[i] == arrB[j]) {
					arrA[i] = 1;
					arrB[j] = 1;
				}
			}

		}

		for (int j = 0; j < arrB.length; j++) {
			valueNOK *= arrB[j];
		}

		return valueNOK;
	}

}