package by.epamtc.module2.main;

/*
 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведенных в степень n, равна самому числу. Найти все
 * числа Армстронга от 1 до K. При решении задачи использовать декомпозицию.
 */

public class DecompositionArr14 {

	public static void main(String[] args) {

		int valueK = 1100;

		for (int i = 1; i < valueK; i++) {
			if (checkArmstrongsNumber(i)) {
				System.out.println(i + " - chislo Armstronga");
			}
		}

	}

	private static boolean checkArmstrongsNumber(int valArm) {

		int counter = 0;
		int valHelp = valArm;
		int[] arrNumOfDigits;

		while (valHelp > 0) {
			counter++;
			valHelp = valHelp / 10;
		}

		arrNumOfDigits = new int[counter];
		valHelp = valArm;
		counter = 0;

		while (valHelp > 0) {
			arrNumOfDigits[counter] = valHelp % 10;
			counter++;
			valHelp = valHelp / 10;
		}

		for (int i = 0; i < counter; i++) {
			valHelp += Math.pow(arrNumOfDigits[i], counter);
		}

		return (valHelp == valArm);
	}

}