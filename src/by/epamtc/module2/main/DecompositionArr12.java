package by.epamtc.module2.main;

/*
 * Даны натуральные числа K и N. Написать методы формирования массива A,
 * элементами которого являются числа, сумма цифр которых равна K и которые не
 * больше N.
 */

public class DecompositionArr12 {

	public static void main(String[] args) {

		int valueK = 12;
		int valueN = 300;
		int[] array;

		array = createArray(valueK, valueN);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "; ");
		}

	}

	private static int[] createArray(int valK, int valN) {

		int sum;
		int counter = 0;
		int[] arrNew;
		int j = 0;

		for (int i = 1; i <= valN; i++) {
			sum = findSumOfDigits(i);
			if (sum == valK) {
				counter++;
			}
		}

		if (counter == 0) {
			arrNew = new int[] { 0 };
			return arrNew;
		}

		arrNew = new int[counter];

		for (int i = 1; i <= valN; i++) {
			sum = findSumOfDigits(i);
			if (sum == valK) {
				arrNew[j] = i;
				j++;
			}
		}

		return arrNew;
	}

	private static int findSumOfDigits(int val) {

		int sum = 0;

		while (val > 0) {
			sum += (val % 10);
			val = val / 10;
		}

		return sum;
	}

}