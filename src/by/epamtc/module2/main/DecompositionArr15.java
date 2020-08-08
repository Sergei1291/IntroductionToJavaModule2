package by.epamtc.module2.main;

/*
 * Найти все натуральные n-значные числа, цифры в которых образуют строго
 * возрастающую последовательность (например 1248). При решении задачи
 * использовать декомпозицию.
 */

public class DecompositionArr15 {

	public static void main(String[] args) {

		int valueN = 3;
		int valA;
		int[] arrayDigitsOfNum;

		valA = (int) (Math.pow(10, --valueN));

		for (int i = valA; i < valA * 10; i++) {
			arrayDigitsOfNum = createArrayDigitsOfNum(i);
			if (checkNumber(arrayDigitsOfNum)) {
				System.out.println(i);
			}
		}

	}

	private static int[] createArrayDigitsOfNum(int value) {

		int counter = 0;
		int valHelp = value;

		while (valHelp > 0) {
			counter++;
			valHelp = valHelp / 10;
		}

		int[] arrDigitsOfNum = new int[counter];
		valHelp = value;
		counter = 0;

		while (valHelp > 0) {
			arrDigitsOfNum[counter] = valHelp % 10;
			counter++;
			valHelp = valHelp / 10;
		}

		return arrDigitsOfNum;
	}

	private static boolean checkNumber(int[] arrCheck) {

		for (int i = 1; i < arrCheck.length; i++) {
			if (arrCheck[i - 1] <= arrCheck[i]) {
				return false;
			}
		}

		return true;
	}

}