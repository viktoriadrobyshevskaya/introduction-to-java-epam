package by.jonline.modul02.decomp;

import java.util.Scanner;

//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до К. Использовать декомпозицию.

public class Task14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число К: ");
		int k = scanner.nextInt();

		System.out.println("Числа Армстронга от 1 до " + k + ": ");
		isArmstrong(k);

	}

	public static int count(int i) {
		int n = 0;
		while (i != 0) {
			n++;
			i = i / 10;
		}
		return n;
	}

	public static int sum(int i) {
		int sum = 0;
		int n = count(i);
		while (i != 0) {
			int temp = (i % 10);
			sum = sum + (int) Math.pow(temp, n);
			i = i / 10;
		}
		return sum;
	}

	public static void isArmstrong(int k) {
		for (int i = 1; i <= k; i++) {
			if (sum(i) == i) {
				System.out.print(i + " ");
			}
		}
	}
}
