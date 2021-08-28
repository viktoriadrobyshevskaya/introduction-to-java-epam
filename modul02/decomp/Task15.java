package by.jonline.modul02.decomp;

import java.util.Scanner;

//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1245, 5678).
//Использовать декомпозицию.

public class Task15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите n: ");
		int n = sc.nextInt();

		print(n);

	}

	public static int count(int x) {
		int count = 0;
		while (x != 0) {
			count++;
			x = x / 10;
		}
		return count;
	}

	public static void print(int n) {
		for (int x = 0; x < Integer.MAX_VALUE; x++) {
			if (count(x) == n && isIncreases(x)) {
				System.out.println(x);
			}
		}
	}

	public static boolean isIncreases(int x) {
		while (x != 0) {
			if ((x % 10) > ((x / 10) % 10)) {
				x = x / 10;
			} else {
				return false;
			}
		}
		return true;
	}
}
