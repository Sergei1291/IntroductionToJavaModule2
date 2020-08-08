package by.epamtc.module2.main;

/*
 * Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать методы
 * вычисления его площади, если угол между сторонами длинной X и Y - прямой.
 */

public class DecompositionArr09 {

	public static void main(String[] args) {

		double x = 10;
		double y = 30;
		double z = 20;
		double t = 40;

		double areaQuadrangle;

		if (exist(x, y, z, t)) {
			areaQuadrangle = findArea(x, y, z, t);
			System.out.printf("Area quadrangle = %.3f.", areaQuadrangle);
		} else {
			System.out.println("Quadrangle does not exist.");
		}

	}

	private static boolean exist(double x, double y, double z, double t) {

		double d = findDiagonal(x, y);

		return (d < (t + z)) && (t < (d + z)) && (z < (t + d));
	}

	private static double findDiagonal(double x, double y) {

		return Math.sqrt(x * x + y * y);
	}

	private static double findArea(double x, double y, double z, double t) {

		double d = findDiagonal(x, y);
		double area1 = findAreaRightTriangle(x, y);
		double area2 = findAreaTriangle(d, z, t);

		return area1 + area2;
	}

	private static double findAreaRightTriangle(double a, double b) {

		return (0.5 * a * b);
	}

	private static double findAreaTriangle(double a, double b, double c) {

		double p = (a + b + c) / 2;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return area;
	}

}