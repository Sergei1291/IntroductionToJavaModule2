package by.epamtc.module2.main;

/*
 * Дано натуральное число N. Написать методы для формирования массива,
 * элементами которого являются цифры числа N.
 */

public class DecompositionArr10 {

	public static void main(String[] args) {

		int n = 47679;
		int[] array;

		array = createArray(n);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "; ");
		}

	}

	private static int[] createArray(int valN) {

		int lengthArr = 0;
		int valHelp = valN;
		int[] array;
		int i = 0;

		while ((valHelp) != 0) {
			lengthArr++;
			valHelp = valHelp / 10;
		}

		array = new int[lengthArr];
		valHelp = valN;

		while (i < lengthArr) {
			array[lengthArr - i - 1] = valHelp % 10;
			valHelp = valHelp / 10;
			i++;
		}

		return array;
	}

}