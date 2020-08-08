package by.epamtc.module2.main;

/*
 * Написать программу, определяющую сумму n-значных чисел, содержащих только
 * нечетные цифры. Определить также сколько четных цифр в заданной сумме. При
 * решении задачи использовать декомпозицию.
 */

public class DecompositionArr16 {

	public static void main(String[] args) {

		int valueN = 3;
		int valA;
		int sum = 0;
		int quantity;

		valA = (int) (Math.pow(10, valueN - 1));

		for (int i = valA; i < valA * 10; i++) {
			if (checkNumber(i)) {
				sum += i;
				System.out.println(i + "; " + sum);
			}
		}

		quantity = findQuantityEvenDigits(sum);

		System.out.println("sum = " + sum);
		System.out.println("quantity even digits of the sum = " + quantity);

	}

	private static boolean checkNumber(int value) {

		while (value > 0) {
			if (((value % 10) % 2) == 0) {
				return false;
			}
			value = value / 10;
		}

		return true;
	}

	private static int findQuantityEvenDigits(int value) {

		int counter = 0;
		int valHelp = value;

		while (valHelp > 0) {
			if ((valHelp % 2) == 0) {
				counter++;
			}
			valHelp = valHelp / 10;
		}

		return counter;
	}

}