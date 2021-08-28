package by.jonline.modul02.array2;

import java.util.Random;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить столбец содержит максимальную сумму.

public class Task9 {

	public static void main(String[] args) {
		int n = 5;
		int[][] arr = new int[n][n];

		fill(arr);
		print(arr);

		int sum = 0;
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum = sum + arr[j][i];
			}
			if (sum > maxSum) {
				maxSum = sum;
			}
			System.out.println("Сумма по столбцу " + i + " = " + sum);
			sum = 0;
		}
		System.out.println("Максимальная сумма по столбцам " + maxSum);
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
