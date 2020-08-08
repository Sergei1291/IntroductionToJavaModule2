package by.epamtc.module2.main;

/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
 * цифр и т.д. Сколько таких действий нужно произвести, чтобы получился нуль?
 * При решении задачи использовать декомпозицию.
 */

public class DecompositionArr17 {

	public static void main(String[] args) {

		int valueN = 150;
		int valueHelp;
		int counter = 0;

		valueHelp = valueN;

		while (valueHelp != 0) {
			valueHelp = processNumber(valueHelp);
			counter++;
			System.out.println(valueHelp);
		}

		System.out.println("\n" + "quantity operations = " + counter);

	}

	private static int processNumber(int val) {

		int valHelp = val;

		while (valHelp > 0) {
			val -= (valHelp % 10);
			valHelp = valHelp / 10;
		}

		return val;
	}

}