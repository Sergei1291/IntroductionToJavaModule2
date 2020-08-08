package by.epamtc.module2.main;

/*
 * Даны целые числа a_1, a_2...a_n. Вывести на печать только те числа, для
 * которых a_i > i.
 */

public class Array05 {

	public static void main(String[] args) {

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			if (Math.random() > 0.5) {
				array[i] = (int) (10 * (Math.random()));
			} else {
				array[i] = (int) (-10 * (Math.random()));
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "; ");
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (array[i] > (i + 1)) {
				System.out.println("elements's index = " + (i + 1) + "; array's element = " + array[i]);
			}
		}

	}

}