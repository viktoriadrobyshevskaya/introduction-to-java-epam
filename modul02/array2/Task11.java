package by.jonline.modul02.array2;

import java.util.Random;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. 
//Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class Task11 {

	public static void main(String[] args) {
		int n = 10;
		int m = 20;
		int[][] arr = new int[n][m];

		fill(arr);
		print(arr);

		System.out.println("Номера строк, в которых цифра 5 встречается 3 и более раз:");
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.println(i);
			}
			count = 0;
		}
	}

	public static void fill(int[][] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = r.nextInt(15);
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
