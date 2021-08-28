package by.jonline.modul02.decomp;

import java.util.Arrays;
import java.util.Scanner;

//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

public class Task10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число: ");
		int x = sc.nextInt();

		int count = count(x);
		int[] arr = new int[count];

		fill(arr, x);
		System.out.println(Arrays.toString(arr));

	}

	// Вычисляем длинну массива
	public static int count(int x) {
		int count = 0;
		while (x != 0) {
			count++;
			x = x / 10;
		}
		return count;
	}

	public static void fill(int[] arr, int x) {
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = x % 10;
			x = x / 10;
		}
	}
}
