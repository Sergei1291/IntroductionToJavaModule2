package by.epamtc.module2.main;

/*
 * Заданы два одномерных массива с различным количеством элементов и натуральное
 * число K. Объединить их в один массив, включив второй массив между K-м и
 * (K+1)-м элементами первого, при этом не используя дополнительный массив.
 */

public class SortingArr1 {

	public static void main(String[] args) {

		int sizeOne = 6;
		int sizeTwo = 8;
		int valueK = 3;

		int[] array1;
		int[] array2;
		int[] arrayResult;

		if ((valueK <= sizeOne) && (valueK >= 0)) {
			array1 = createArray(sizeOne);
			array2 = createArray(sizeTwo);
			arrayResult = new int[array1.length + array2.length];

			printArray(array1);
			printArray(array2);

			for (int i = 0; i < arrayResult.length; i++) {
				if (i < valueK) {
					arrayResult[i] = array1[i];
				} else if ((i >= valueK) && (i < (valueK + array2.length))) {
					arrayResult[i] = array2[i - valueK];
				} else {
					arrayResult[i] = array1[i - array2.length];
				}
			}

			printArray(arrayResult);

		} else {
			System.out.println("incorrect value K");
		}

	}

	private static int[] createArray(final int SIZE) {

		int[] arrNew = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			arrNew[i] = (int) (10 * Math.random());
		}

		return arrNew;
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "; ");
		}

		System.out.println();

	}

}