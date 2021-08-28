package by.jonline.modul02.decomp;

import java.util.Arrays;
import java.util.Scanner;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не больше чем N.

public class Task12 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число К: ");
		int k = sc.nextInt();
		System.out.println("Введите число N: ");
		int n = sc.nextInt();

		int[] a = new int[6];

		fill(a, n, k);
		System.out.println(Arrays.toString(a));
	}

	public static void fill(int[] arr, int n, int k) {
		int a;
		for (int i = 0; i < arr.length; i++) {
			a = (int) Math.round(Math.random() * n);
			if (sum(a) < k) {
				arr[i] = a;
			}
		}
	}

	public static int sum(int a) {
		int sum = 0;
		while (a != 0) {
			sum = sum + (a % 10);
			a = a / 10;
		}
		return sum;
	}

}
