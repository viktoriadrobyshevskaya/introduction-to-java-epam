package by.jonline.modul04.Task07;

import java.awt.Point;

// Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления 
// площади, периметра и точки пересечения медиан.  

public class Main {

	public static void main(String[] args) {
		Point a = new Point(2, 1);
		Point b = new Point(2, 6);
		Point c = new Point(8, 4);

		Triangle triangle = new Triangle(a, b, c);

		if (triangle.isValidTriangle(triangle)) {
			System.out.println("Периметр треугольника = " + triangle.calculatePerimeter(triangle));
			System.out.println("Площадь треугольника = " + triangle.calculateSquare(triangle));
			System.out.println("Точка пересечения медиан - {" + triangle.calculateMedian(triangle)[0] + ", "
					+ triangle.calculateMedian(triangle)[1] + "}");

		}
	}
}
