package by.epamtc.module2.main;

/*
 * Написать методы для вычисления суммы факториалов всех нечетных чисел от 1 до
 * 9.
 */

public class DecompositionArr07 {

	public static void main(String[] args) {

		int n = 9;
		int sum;

		sum = findSumOfFactorials(n);
		System.out.println("sum 1! + 3! + 5! + 7! + 9! = " + sum);

	}

	private static int findSumOfFactorials(int valueN) {

		int i = 1;
		int sum = 0;

		while (i <= valueN) {
			sum = sum + findFactorial(i);
			i += 2;
		}

		return sum;
	}

	private static int findFactorial(int valF) {

		int factorial = 1;

		for (int i = 2; i <= valF; i++) {
			factorial *= i;
		}

		return factorial;
	}

}