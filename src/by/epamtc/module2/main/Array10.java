package by.epamtc.module2.main;

/*
 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из
 * него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание. дополнительный массив не использовать.
 */

public class Array10 {

	public static void main(String[] args) {

		int valueN = 9;

		int[] array;

		array = new int[valueN];

		for (int i = 0; i < array.length; i++) {
			if (Math.random() > 0.5) {
				array[i] = (int) (20 * (Math.random()));
			} else {
				array[i] = (int) (-20 * (Math.random()));
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "; ");
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (i < ((array.length + 1) / 2)) {
				array[i] = array[2 * i];
			} else {
				array[i] = 0;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "; ");
		}

	}

}