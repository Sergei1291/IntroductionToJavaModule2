package by.epamtc.module2.main;

/*
 * Даны дроби p_1/q_1...p_n/q_n (p_i, q_i - натуральные числа). Составить
 * программу, которая приводит эти дроби к общему знаменателю и упорядочивает их
 * в порядке возрастания.
 */

public class SortingArr8 {

	public static void main(String[] args) {

		int size = 5;
		int denominator;
		int valueSort;
		int[] arrayP;
		int[] arrayQ;

		arrayP = createArray(size);
		arrayQ = createArray(size);

		System.out.print("arrayP: ");
		printArray(arrayP);
		System.out.print("arrayQ: ");
		printArray(arrayQ);

		denominator = arrayQ[0];

		for (int i = 1; i < arrayQ.length; i++) {

			denominator = findNOK(denominator, arrayQ[i]);
			System.out.println(denominator);
		}

		System.out.println();

		for (int i = 0; i < arrayP.length; i++) {
			arrayP[i] *= denominator / arrayQ[i];
			System.out.println(arrayP[i] + "/" + denominator);
		}

		System.out.println();

		for (int i = 0; i < (arrayP.length - 1); i++) {

			for (int j = (i + 1); j < arrayP.length; j++) {
				if (arrayP[i] > arrayP[j]) {
					valueSort = arrayP[i];
					arrayP[i] = arrayP[j];
					arrayP[j] = valueSort;
				}
			}

			System.out.println(arrayP[i] + "/" + denominator);
		}

		System.out.println(arrayP[arrayP.length - 1] + "/" + denominator);

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