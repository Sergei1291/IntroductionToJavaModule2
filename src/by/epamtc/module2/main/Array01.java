package by.epamtc.module2.main;

/*
 * В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые
 * кратны данному K.
 */

public class Array01 {

	public static void main(String[] args) {

		int valueN = 10;
		int valueK = 5;

		int sum = 0;
		int[] arrayA;

		arrayA = new int[valueN];

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) (1000 * (Math.random()));
		}

		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + "; ");
		}
		System.out.println();

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % valueK == 0) {
				sum += arrayA[i];
			}
		}

		System.out.printf("Array's Elements sum Multiple %d = %d", valueK, sum);

	}

}