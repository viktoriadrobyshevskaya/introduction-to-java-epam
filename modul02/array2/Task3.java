package by.jonline.modul02.array2;

import java.util.Random;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {
	public static void main(String[] args) {
		int n = 5;
		int[][] arr = new int[n][n];

		fill(arr);
		print(arr);

		int k = 2;
		int p = 4;

		System.out.println("--строка--");
		for (int i = 0; i < arr.length; i++) {
			if (i == k) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();

		System.out.println("--столбец--");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (j == p)
					System.out.print(arr[i][j] + " ");
			}
		}
	}

	public static void fill(int[][] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = r.nextInt(10);
			}
		}
	}

	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
