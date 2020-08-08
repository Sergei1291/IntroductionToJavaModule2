package by.epamtc.module2.main;

/*
 * Написать методы, проверяющие, являются ли данные три числа взаимно простыми.
 */

public class DecompositionArr06 {

	public static void main(String[] args) {

		int[] array = { 25, 36, 187 };

		if (checkCoprime(array)) {
			System.out.println("numbers are coprime");
		} else {
			System.out.println("numbers are not coprime");
		}

	}

	private static boolean checkCoprime(int[] arrCheck) {

		int i;
		int valueNOD = 1;
		int[] arrNOD = new int[arrCheck.length];

		arrNOD[0] = findNOD(arrCheck[0], arrCheck[arrCheck.length - 1]);

		for (i = 1; i < arrNOD.length; i++) {
			arrNOD[i] = findNOD(arrCheck[i], arrCheck[i - 1]);
		}

		for (i = 0; i < arrNOD.length; i++) {
			valueNOD *= arrNOD[i];
		}

		if (valueNOD == 1) {
			return true;
		}
		return false;
	}

	private static int findNOD(int valOne, int valTwo) {

		int valNOD = 1;
		int quantity;
		int[] arrElem;
		int[] arrNOD;

		quantity = findQuantitySimpleDividers(valOne);
		arrElem = createArrSimpleDividers(valOne, quantity);
		quantity = findQuantitySimpleDividers(valTwo);
		arrNOD = createArrSimpleDividers(valTwo, quantity);

		for (int k = 0; k < arrElem.length; k++) {

			for (int j = 0; j < arrNOD.length; j++) {
				if (arrElem[k] == arrNOD[j]) {
					valNOD = valNOD * arrElem[k];
					arrElem[k] = 1;
					arrNOD[j] = 1;
				}
			}

		}

		return valNOD;
	}

	private static int findQuantitySimpleDividers(int value) {

		int quantity = 0;
		int i = 2;

		do {
			if ((value % i) == 0) {
				value = value / i;
				quantity++;
			} else {
				i++;
			}
		} while (i <= value);

		return quantity;
	}

	private static int[] createArrSimpleDividers(int elem, final int SIZE) {

		int[] arrSD = new int[SIZE];
		int j = 0;
		int i = 2;

		if (elem == 1) {
			arrSD = new int[1];
			arrSD[0] = 1;
		}

		do {
			if ((elem % i) == 0) {
				arrSD[j] = i;
				elem = elem / i;
				j++;
			} else {
				i++;
			}
		} while (i <= elem);

		return arrSD;
	}

}