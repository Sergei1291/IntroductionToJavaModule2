package by.epamtc.module2.main;

/*
 * Два простых числа называются близнецами, если они отличаются друг от друга на
 * 2. Найти и напечатать все пары близнецов из отрезка [n, 2n], где n - заданное
 * натуральное число > 2. Для решения задачи использовать декомпозицию.
 */

public class DecompositionArr13 {

	public static void main(String[] args) {

		int valueN = 200;
		int[][] arrayTwin;

		arrayTwin = findTwin(valueN);

		printArr(arrayTwin);

	}

	private static int[][] findTwin(int valN) {

		int value = valN;
		int enumerator = 0;
		int[][] arrTwin;

		while ((value + 2) <= (2 * valN)) {
			if (checkSimpleNumber(value) && checkSimpleNumber(value + 2)) {
				enumerator++;
			}
			value++;
		}

		arrTwin = new int[enumerator][2];
		value = valN;
		enumerator = 0;

		while ((value + 2) <= (2 * valN)) {
			if (checkSimpleNumber(value) && checkSimpleNumber(value + 2)) {
				arrTwin[enumerator][0] = value;
				arrTwin[enumerator][1] = (value + 2);
				enumerator++;
			}
			value++;
		}

		return arrTwin;
	}

	private static boolean checkSimpleNumber(int value) {

		int i = 2;

		if (value == 1) {
			return false;
		}

		while (value > i) {
			if (value % i == 0) {
				return false;
			}
			i++;
		}

		return true;
	}

	private static void printArr(int[][] arrPrint) {

		for (int i = 0; i < arrPrint.length; i++) {

			for (int j = 0; j < arrPrint[i].length; j++) {
				System.out.print(arrPrint[i][j] + "; ");
			}

			System.out.println();
		}

	}

}