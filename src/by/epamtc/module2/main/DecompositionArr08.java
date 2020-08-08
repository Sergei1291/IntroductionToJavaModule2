package by.epamtc.module2.main;

/*
 * Задан массив D. Определить сумму трех последовательно расположенных элементов
 * массива, с номерами от К до М.
 */

public class DecompositionArr08 {

	public static void main(String[] args) {

		int sum;
		int valueK = 2;
		int valueM = 5;
		int[] arrayD;

		arrayD = createArray(10);

		printArray(arrayD);

		if (valueK > valueM) {
			System.out.println("Incorrect num of element");
		}

		for (int i = valueK; i <= valueM; i++) {
			if (((i + 2) <= arrayD.length) && (i > 0)) {
				sum = findSumOfThreeElem(arrayD, i);
				System.out.println("sum arr[" + i + ", " + (i + 1) + ", " + (i + 2) + "] = " + sum);
			} else {
				System.out.println("Incorrect num of element");
			}
		}

	}

	private static int[] createArray(final int SIZE) {

		int[] arrNew = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			arrNew[i] = (int) (30 * Math.random());
		}

		return arrNew;
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "; ");
		}

		System.out.println();

	}

	private static int findSumOfThreeElem(int[] arr, int numM) {

		return arr[numM - 1] + arr[numM] + arr[numM + 1];
	}

}