package by.epamtc.module2.main;

/*
 * Вычислить площадь правильного шестиугольника со стороной a, используя метод
 * вычисления площади треугольника.
 */

public class DecompositionArr03 {

	public static void main(String[] args) {

		double lengthA = 5.5;
		double areaHexagon;

		areaHexagon = findAreaHexagon(lengthA);
		System.out.printf("area hexagon = %.3f \n", areaHexagon);

	}

	private static double findAreaHexagon(double sideLength) {

		return 6 * findAreaTriangle(sideLength);
	}

	private static double findAreaTriangle(double sideLength) {

		return 0.5 * Math.pow(sideLength, 2) * Math.sin(Math.toRadians(60));
	}

}