package by.jonline.modul02.decomp;

import java.util.Scanner;

/* Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
   НОК(a,b) = (a*b)/НОД(a,b)
 */

public class Task1 {

	public static void main(String[] args) {
		int a;
		int b;

		a = enter();
		b = enter();

		System.out.println("Наибольший общий делитель: " + nod(a, b));
		System.out.println("Наименьшее общее кратное: " + nok(a, b));
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

	public static int nok(int a, int b) {
		int nok = (a * b) / nod(a, b);
		return nok;
	}
}
