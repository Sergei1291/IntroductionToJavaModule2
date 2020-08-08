package by.epamtc.module2.main;

/*
 * На плоскости заданы своими координатами n точек. Написать методы,
 * определяющие, между какими из пар точек самое большое расстояние. Координаты
 * точек занести в массив.
 */

public class DecompositionArr04 {

	public static void main(String[] args) {

		int n = 5;
		int[][] arrayPoints;
		double[][] arrayDistance;
		double maxDistance;

		arrayPoints = createArrayCoordinatesPoints(n);
		arrayDistance = findDistancePoints(arrayPoints);
		maxDistance = findMaxElemArray(arrayDistance);

		printIntArray(arrayPoints);
		printDoubleArray(arrayDistance);

		for (int i = 0; i < (arrayDistance.length - 1); i++) {

			for (int j = (i + 1); j < arrayDistance[i].length; j++) {
				if (arrayDistance[i][j] == maxDistance) {
					System.out.print("max Distance points: " + (i + 1) + " & " + (j + 1));
				}
			}

		}

	}

	private static int[][] createArrayCoordinatesPoints(final int SIZE) {

		int[][] arrNew = new int[SIZE][2];

		for (int i = 0; i < SIZE; i++) {

			for (int j = 0; j < 2; j++) {
				if (Math.random() > 0.5) {
					arrNew[i][j] = (int) (10 * Math.random());
				} else {
					arrNew[i][j] = (int) (-10 * Math.random());
				}
			}

		}

		return arrNew;
	}

	private static double[][] findDistancePoints(int[][] points) {

		double[][] arrDistPoints = new double[points.length][points.length];
		int x;
		int y;

		for (int i = 0; i < (points.length - 1); i++) {

			for (int j = (i + 1); j < points.length; j++) {
				x = points[i][0] - points[j][0];
				y = points[i][1] - points[j][1];
				arrDistPoints[i][j] = Math.sqrt(x * x + y * y);
			}

		}

		return arrDistPoints;
	}

	private static void printIntArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "; ");
			}

			System.out.println();
		}

	}

	private static void printDoubleArray(double[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%.3f; ", arr[i][j]);
			}

			System.out.println();
		}

	}

	private static double findMaxElemArray(double[][] array) {

		double max = 0;

		for (int i = 0; i < (array.length - 1); i++) {

			for (int j = (i + 1); j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}

		}

		return max;
	}

}