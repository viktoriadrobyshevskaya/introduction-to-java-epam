package by.jonline.modul04.Task07;

import java.awt.Point;

// Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления 
// площади, периметра и точки пересечения медиан.  

public class Triangle {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double distance(Point a, Point b) {
		double distance;
		distance = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
		return distance;
	}

	public boolean isValidTriangle(Triangle triangle) {
		double side = distance(a, b);
		double side2 = distance(b, c);
		double side3 = distance(c, a);

		if ((side + side2) > side3 || (side2 + side3) > side || (side3 + side) > side2) {
			return true;
		}
		return false;
	}

	public double calculatePerimeter(Triangle tr) {
		return (distance(a, b) + distance(b, c) + distance(c, a));
	}

	public double calculateSquare(Triangle tr) {
		double perimetr = calculatePerimeter(tr);
		double halfPerimeter = perimetr / 2;
		double square = Math.sqrt(halfPerimeter * (halfPerimeter - distance(a, b)) * (halfPerimeter - distance(b, c))
				* (halfPerimeter - distance(c, a)));
		return square;
	}

	public double[] calculateMedian(Triangle tr) {
		double[] points = new double[2];
		double x;
		double y;
		x = (a.getX() + b.getX() + c.getX()) / 3;
		y = (a.getY() + b.getY() + c.getY()) / 3;
		points[0] = x;
		points[1] = y;
		return points;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
}