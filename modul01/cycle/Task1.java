package by.jonline.modul01.cycle;

import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа. 

public class Task1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int x;

		x = scanner.nextInt();

		int sum = 0;
		for (int i = x; i >= 1; i--) {
			sum = sum + i;
		}

		System.out.println(sum);
	}
}
