package by.jonline.modul02.decomp;

import java.util.Arrays;
import java.util.Scanner;

/* Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 */

public class Task8 {

	public static void main(String[] args) {
		int[] arr = new int[7];

		fill(arr);
		System.out.println(Arrays.toString(arr));

		int num = number(arr);
		System.out.println("Сумма = " + sum(arr, num));
	}

	public static void fill(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * 50);
		}
	}

	public static int number(int[] arr) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num;
		while (true) {
			System.out.println("Введите число: ");
			num = sc.nextInt();
			if (num >= arr.length) {
				System.out.println("Число больше длинны массива.");
			} else {
				return num;
			}
		}
	}

	public static int sum(int[] arr, int num) {
		int sum = 0;
		for (int i = 0; i < 3; i++, num++) {
			if (num >= arr.length) {
				num = 0;
			}
			sum = sum + arr[num];
		}
		return sum;
	}
}
