package by.jonline.modul01.branch;

// Даны два угла треугольника(в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;

		System.out.println("Введите угол а: ");
		a = scanner.nextInt();
		System.out.println("Введите угол b: ");
		b = scanner.nextInt();

		if ((a + b) < 180) {
			System.out.println("Треугольник существует");

			if (a == 90 || b == 90 || a + b == 90) {
				System.out.println("Треугольник прямоугольный");
			}

		} else
			System.out.println("Треугольника не существует");
	}
}
