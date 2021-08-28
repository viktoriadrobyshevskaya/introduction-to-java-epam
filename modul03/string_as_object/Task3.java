package by.jonline.modul03.string_as_object;

import java.util.Scanner;

//Проверить, является ли заданное слово палиндромом.

public class Task3 {

	public static void main(String[] args) {
		String str;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово: ");
		str = sc.next();

		boolean isPalindrom = false;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				isPalindrom = false;
			} else {
				isPalindrom = true;
			}
		}
		if (isPalindrom == true) {
			System.out.println("Это слово палиндром");
		} else {
			System.out.println("Это Не слово палиндром");
		}

	}
}
