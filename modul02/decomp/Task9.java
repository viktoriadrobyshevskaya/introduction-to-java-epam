package by.jonline.modul02.decomp;

import java.util.Scanner;

//Даны числа X, Y, Z, Т - длины сторон четырехугольника.
//Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Task9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите Х: ");
		int x = sc.nextInt();
		System.out.println("Введите Y: ");
		int y = sc.nextInt();
		System.out.println("Введите Z: ");
		int z = sc.nextInt();
		System.out.println("Введите T: ");
		int t = sc.nextInt();

		System.out.println("Площадь четырехугольника = " + square(x, y, z, t));
	}	

	public static double square(int x, int y, int z, int t) {
		return squareRectTriangle(x, y) + squareTriangle(z, t, diagonal(x, y));
	}

	public static double diagonal(int x, int y) {
		double diag = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return diag;
	}

	public static double squareRectTriangle(int x, int y) {
		return (x * y) / 2;
	}

	public static double squareTriangle(int z, int t, double diagonal) {
		double p = (z + t + diagonal) / 2;
		double dosquareTriangle = Math.sqrt(p * (p - z) * (p - t) * (p - diagonal));
		return dosquareTriangle;
	}

}
