package by.jonline.modul04.Task09;

import java.util.Scanner;

/* 
Найти и вывести:
a) список книг заданного автора
b) список книг, выпущенных заданным издательством
c) список книг, выпущенных после заданного года
*/

public class BookLogic {

	public static void findByAuthor(Book[] arr) {
		String author;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите фамилию автора: ");
		author = sc.next();

		System.out.println("Книги этого автора: ");
		for (Book x : arr) {
			if (x.getAuthor().equalsIgnoreCase(author)) {
				System.out.println("\"" + x.getName() + "\"");
			}
		}
	}

	public static void findByPublisher(Book[] arr) {
		String publisher;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите название издательства: ");
		publisher = sc.next();

		System.out.println("Книги этого издательства: ");
		for (Book x : arr) {
			if (x.getPublisher().equalsIgnoreCase(publisher)) {
				System.out.println(x.getName() + ", автор " + x.getAuthor());
			}
		}
	}

	public static void findByYear(Book[] arr) {
		int year;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите год: ");
		year = sc.nextInt();

		boolean isIt = false;
		System.out.println("Книги, выпущенные после " + year + " года: ");
		for (Book x : arr) {
			if (x.getYear() > year) {
				isIt = true;
				System.out.println(x.getName() + ", автор " + x.getAuthor());
			}
		}
		if (isIt == false) {
			System.out.println("К сожалению, книг выпущенных после заданного года нет.");
		}
	}
}
