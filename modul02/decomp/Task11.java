package by.jonline.modul02.decomp;

import java.util.Scanner;

//Написать метод (методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число А: ");
		int a = sc.nextInt();
		System.out.println("Введите число B: ");
		int b = sc.nextInt();

		if (count(a) > count(b)) {
			System.out.println("В числе А больше цифр, чем в числе В.");
		} else if (count(a) < count(b)) {
			System.out.println("В числе B больше цифр, чем в числе A.");
		} else {
			System.out.println("В числах А и В равное количество цифр.");
		}
	}

	public static int count(int x) {
		int count = 0;
		while (x != 0) {
			count++;
			x = x / 10;
		}
		return count;
	}

}
