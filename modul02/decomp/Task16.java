package by.jonline.modul02.decomp;

import java.util.Scanner;

// Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры. 
//Определить также, сколько четных цифр в найденой сумме. Использовать декомпозицию.

public class Task16 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите n: ");
		int n = sc.nextInt();

		System.out.println("Сумма всех " + n + "-значных чисел, содержащих нечетные цифры = " + sum(n));
		System.out.println("B этом числе количество четных цифр - " + count(n));
	}

	public static int countNum(int x) {
		int count = 0;
		while (x != 0) {
			count++;
			x = x / 10;
		}
		return count;
	}

	public static boolean isOdd(int x) {
		while (x != 0) {
			if ((x % 10) % 2 != 0) {
				x = x / 10;
			} else {
				return false;
			}
		}
		return true;
	}

	public static int sum(int n) {
		int sum = 0;
		for (int x = 0; x < 20000000; x++) {
			if (countNum(x) == n && isOdd(x)) {
				sum += x;
			}
		}
		return sum;
	}

	public static int count(int n) {
		int count = 0;
		int sum = sum(n);
		while (sum != 0) {
			if ((sum % 10) % 2 == 0) {
				count++;
			}
			sum /= 10;
		}
		return count;
	}

}
