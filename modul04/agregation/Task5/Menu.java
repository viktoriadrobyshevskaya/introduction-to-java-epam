package by.jonline.modul04.agregation.Task5;

import java.util.List;
import java.util.Scanner;

public class Menu {
	public static void printMenu(List<TouristPackage> list) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choise = "";

		System.out.println("Выберите действие (введите число): " + "\n1. Сортировать по цене. "
				+ "\n2. Сортировать по количеству дней." + "\n3. Показать все доступные путевки без сортировки.");

		choise = sc.nextLine();
		switch (choise) {
		case "1":
			TouristPackegeLogic.sortByPrice(list);
			printList(list);
			break;

		case "2":
			TouristPackegeLogic.sortByNumberOfDays(list);
			printList(list);
			break;

		case "3":
			printList(list);
			break;
		default:
			System.out.println("Вы ввели некоректное значение\n");
		}

	}

	public static void printList(List<TouristPackage> list) {
		System.out.println("Доступные туристические путевки: ");
		for (TouristPackage x : list) {
			System.out.println(x);
		}
	}
}
