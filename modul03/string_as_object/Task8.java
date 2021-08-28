package by.jonline.modul03.string_as_object;

import java.util.Scanner;

//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
//Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class Task8 {

	public static void main(String[] args) {
		String str;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String longWord = "";
		int max = 0;

		System.out.println("Введите слова через пробел (чтобы завершить ввод, введите \"!\"): ");
		while (!sc.next().equals("!")) {
			str = sc.next();
			if (str.length() > max) {
				max = str.length();
				longWord = str;
			}
		}

		System.out.println("Максимально длинное слово - " + longWord);
	}

}