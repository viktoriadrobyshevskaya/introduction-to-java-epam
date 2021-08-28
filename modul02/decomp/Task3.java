package by.jonline.modul02.decomp;

import java.util.Scanner;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Task3 {

	public static void main(String[] args) {
		int a;
		double s;

		a = enter();
		s = areaTriangle(a) * 6;

		System.out.println("Площадь шестиугольника = " + s);
	}

	public static double areaTriangle(int a) {
		double str;
		str = (Math.sqrt(3) / 4) * Math.pow(a, 2);
		return str;
	}

	public static int enter() {
		int val;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Вы ввели не число. Введите число а: ");
		}
		val = sc.nextInt();

		return val;
	}
}
