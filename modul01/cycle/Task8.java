package by.jonline.modul01.cycle;

import java.util.Scanner;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 

public class Task8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sr = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Введите число а: ");
		a = sr.nextInt();
		System.out.println("Введите число b: ");
		b = sr.nextInt();

		int[] arr = new int[10];

		while (a != 0) {
			arr[a % 10]++;
			a /= 10;
		}

		while (b != 0) {
			if (arr[b % 10] != 0) {
				System.out.print(b % 10);
			}
			b /= 10;
		}
	}
}
