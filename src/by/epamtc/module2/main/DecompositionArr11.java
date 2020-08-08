package by.epamtc.module2.main;

/*
 * Написать методы, определяющие, в каком из данных двух чисел больше цифр.
 */

public class DecompositionArr11 {

	public static void main(String[] args) {

		int valueOne = 46709;
		int valueTwo = 4376;
		int lengthOne;
		int lengthTwo;

		lengthOne = findValueLength(valueOne);
		lengthTwo = findValueLength(valueTwo);

		if (lengthOne > lengthTwo) {
			System.out.println("in the first num > in the second num");
		} else if (lengthOne < lengthTwo) {
			System.out.println("in the second num > in the first num");
		} else {
			System.out.println("in both numbers the number of digits matches");
		}

	}

	private static int findValueLength(int valN) {

		int length = 0;
		int valHelp = valN;

		while ((valHelp) != 0) {
			length++;
			valHelp = valHelp / 10;
		}

		return length;
	}

}