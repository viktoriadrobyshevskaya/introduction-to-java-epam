package by.jonline.modul01.branch;

import java.util.Scanner;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. 

public class Task3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;

		System.out.println("Введите координаты трех точек: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x3 = sc.nextInt();
		y3 = sc.nextInt();

		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.printf("Точки расположены на одной прямой");
		} else
			System.out.printf("Точки не принадлежат одной прямой");
	}
}
