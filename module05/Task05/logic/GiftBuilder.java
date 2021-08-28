package by.jonline.module05.Task05.logic;

import java.util.Scanner;

import by.jonline.module05.Task05.bean.Color;
import by.jonline.module05.Task05.bean.Gift;
import by.jonline.module05.Task05.bean.Packing;
import by.jonline.module05.Task05.bean.PackingType;
import by.jonline.module05.Task05.bean.Sweetness;
import by.jonline.module05.Task05.bean.SweetnessType;

public class GiftBuilder {

	public Gift createGif() {
		SweetnessType type = makeChoiseSweetness();
		PackingType packing = makeChoisePacking();
		Color color = makeChoiseColor();

		Gift gift = new Gift(new Sweetness(type), new Packing(packing, color));

		return gift;
	}

	public SweetnessType makeChoiseSweetness() {
		System.out.println("ПОДАРКИ.\nВыберите сладости, которые хотите положить в подарок: \n1. Пирожные." + "\n2. Конфеты."
				+ "\n3. Печенье." + "\n4. Завершить работу.");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number;

		while (sc.hasNextInt()) {
			number = sc.nextInt();
			if (number > 0 && number < 5) {

				if (number == 1) {
					return SweetnessType.BISCUITS;
				} else if (number == 2) {
					return SweetnessType.CANDIES;
				} else if (number == 3) {
					return SweetnessType.COOKIES;
				} else if (number == 4) {
					System.out.println("До свидания!");
					break;
				}

			} else {
				System.out.println("Некорректный ввод. Попробуйте еще раз.");
			}
		}
		return null;
	}

	public PackingType makeChoisePacking() {
		System.out.println("Выберите тип упаковки: \n1. " + PackingType.BOX.getType() + "\n2. "
				+ PackingType.PACKET.getType() + "\n3. Завершить работу.");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number;

		while (sc.hasNextInt()) {
			number = sc.nextInt();
			if (number > 0 && number < 4) {
				if (number == 1) {
					return PackingType.BOX;
				} else if (number == 2) {
					return PackingType.PACKET;
				} else if (number == 3) {
					System.out.println("До свидания!");
					break;
				}
			} else {
				System.out.println("Некорректный ввод. Попробуйте еще раз.");
			}
		}
		return null;
	}

	public Color makeChoiseColor() {
		System.out.println("Выберите цвет упаковки: \n1. Зеленый." + "\n2. Красный."
				+ "\n3. Голубой." + "\n4. Завершить работу.");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number;

		while (sc.hasNextInt()) {
			number = sc.nextInt();
			if (number > 0 && number < 5) {

				if (number == 1) {
					return Color.GREEN;
				} else if (number == 2) {
					return Color.RED;
				} else if (number == 3) {
					return Color.BLUE;
				} else if (number == 4) {
					System.out.println("До свидания!");
					break;
				}

			} else {
				System.out.println("Некорректный ввод. Попробуйте еще раз.");
			}
		}
		return null;
	}
}
