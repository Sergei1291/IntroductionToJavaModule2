package by.epamtc.module2.main;

import java.util.Scanner;

/*
 * В числовой матрице поменять местами два любых столбца, т.е. все элементы
 * одного столбца поставить на соответствующие им позиции другого, а элементы
 * второго переставить в первый. Номера столбцов вводит пользователь с
 * клавиатуры.
 */

public class MultidimensionalArr08 {

	public static void main(String[] args) {

		int column = 10;
		int columnA;
		int columnB;
		int valueHelp;
		int[][] array;

		columnA = read("Input number > 0 and <= " + column + ": ", column);
		columnB = read("Input number < 0 and <= " + column + ": ", column);

		array = createArray(4, column);
		printArray(array);

		for (int i = 0; i < array.length; i++) {
			valueHelp = array[i][columnA - 1];
			array[i][columnA - 1] = array[i][columnB - 1];
			array[i][columnB - 1] = valueHelp;
		}

		System.out.println();
		printArray(array);

	}

	private static int read(String message, int column) {

		int value;

		do {
			value = readScanner(message);
		} while ((value < 1) || (value > column));

		return value;
	}

	private static int readScanner(String message) {

		int value;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print(message);

		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}

		value = scan.nextInt();

		return value;
	}

	private static int[][] createArray(final int LINE, final int COLUMN) {

		int[][] arrNew = new int[LINE][COLUMN];

		for (int i = 0; i < arrNew.length; i++) {

			for (int j = 0; j < arrNew[i].length; j++) {
				arrNew[i][j] = (int) (10 * Math.random());
			}

		}

		return arrNew;
	}

	private static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "; ");
			}

			System.out.println();
		}

	}

}