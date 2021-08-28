package by.jonline.modul02.decomp;

import java.util.Scanner;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task6 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int nod;

		System.out.println("Введите числа: ");
		a = enter();
		b = enter();
		c = enter();

		nod = nod(nod(a, b), c);

		System.out.println(String.format("Являются ли числа %d, %d, %d взаимопростыми? - %b", a, b, c, isTrue(nod)));

	}

	public static int enter() {
		int val;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Неверный ввод. Введите число: ");
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

	public static boolean isTrue(int nod) {
		if (nod == 1) {
			return true;
		} else {
			return false;
		}
	}
}