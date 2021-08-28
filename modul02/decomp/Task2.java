package by.jonline.modul02.decomp;

import java.util.Scanner;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int nodABCD;

		a = enter();
		b = enter();
		c = enter();
		d = enter();

		nodABCD = nod(nod(nod(a, b), c), d);

		System.out.println(String.format("НОД(%d, %d, %d, %d)=%d", a, b, c, d, nodABCD));

	}

	public static int enter() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int val;

		System.out.println("Введите натуральное число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Неверный ввод. Введите натуральное число: ");
		}
		val = sc.nextInt();

		return val;
	}

	public static int nod(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return nod(b, a % b);
		}
	}
}
