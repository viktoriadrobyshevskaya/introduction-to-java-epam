package by.jonline.modul02.array2;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		int n = 5;
		int[][] arr = new int[n][n];

		fill(arr);
		print(arr);
		System.out.println("------");
		for (int i = 1; i < arr.length; i = i + 2) {
			if (arr[0][i] > arr[n - 1][i]) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[j][i] + " ");
				}
			}
			System.out.println(" ");
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
