package by.jonline.module05.Task04.main;

import java.util.List;
import java.util.Scanner;

import by.jonline.module05.Task04.bean.Treasure;
import by.jonline.module05.Task04.logic.DragonCaveLogic;

public class Menu {

	public static void printMenu() {
		DragonCaveLogic dragonCaveLogic = new DragonCaveLogic();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x;

		System.out.println("ДРАКОН И СОКРОВИЩА:\n" + "1 - Просмотреть все сокровища;\n"
				+ "2 - Выбрать самое дорогое по стоимости сокровище;\n" + "3 - Выбрать сокровища на заданную сумму;\n"
				+ "4 - Закончить работу.");

		while (sc.hasNextInt()) {
			x = sc.nextInt();
			if (x < 5 && x > 0) {
				if (x == 1) {
					printList(dragonCaveLogic.getAllTreasures());
				} else if (x == 2) {
					printList(dragonCaveLogic.getTheMostExpensiveTreasure());
				} else if (x == 3) {
					printList(dragonCaveLogic.getValuableTreasuresByCost());
				} else if (x == 4) {
					System.out.println("Пещера закрыта.");
					break;
				}
			} else {
				System.out.println("Некорректный выбор. Попробуйте еще раз: ");
			}
		}
	}

	public static void printList(List<Treasure> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + 1 + ".");
			System.out.println(list.get(i));
		}

	}

}
