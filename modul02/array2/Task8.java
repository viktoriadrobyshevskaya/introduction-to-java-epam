package by.jonline.modul02.array2;

import java.util.Random;
import java.util.Scanner;
/*
		 В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
		 на соответствующие им позиции другого, а его элементы второго переместить в первый.
		 Номера столбцов вводит пользователь с клавиатуры.
*/

public class Task8 {

	public static void main(String[] args) {
		int n = 5;
		int[][] arr = new int[n][n];

		fill(arr);
		print(arr);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите номер первого столбца: ");
		int a = sc.nextInt();
		System.out.println("Введите номер первого столбца: ");
		int b = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (i == a) {
				for (int j = 0; j < arr[0].length; j++) {
					int temp = arr[j][i];
					arr[j][i] = arr[j][b];
					arr[j][b] = temp;
				}
			}
		}
		print(arr);
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
