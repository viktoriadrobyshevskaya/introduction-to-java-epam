package by.jonline.modul02.array2;

import java.util.Arrays;
import java.util.Random;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {

	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];

		fill(arr);
		print(arr);

		System.out.println("---строки по возрастанию----");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				Arrays.sort(arr[i]);
			}
		}
		print(arr);

		System.out.println("---строки по убыванию----");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][n - 1 - j];
				arr[i][n - 1 - j] = temp;
			}
		}
		print(arr);
	}

	public static void fill(int[][] arr) {
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = ran.nextInt(35);
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