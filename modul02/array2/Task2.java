package by.jonline.modul02.array2;

import java.util.Random;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {

	public static void main(String[] args) {
		int n = 5;
		int[][] arr = new int[n][n];

		fill(arr);
		print(arr);

		System.out.println("--первая диагональ--");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("--вторая диагональ--");
		int j = n - 1;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i][j] + " ");
			j--;
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
