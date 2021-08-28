package by.jonline.modul01.cycle;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

public class Task7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int m;
		int n;

		System.out.println("Введите диапазон чисел:: ");

		m = scanner.nextInt();
		n = scanner.nextInt();

		while (m <= n) {

			System.out.print(m + " делится на: ");

			for (int x = 1; x <= m; x++) {

				if (m % x == 0 && x != m && x != 1) {
					System.out.print(x + ", ");
				}

			}

			System.out.println();
			m++;
		}
	}
}
