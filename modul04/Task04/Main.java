package by.jonline.modul04.Task04;

import java.util.Scanner;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте данные в массив
из пяти злементов типа Train, добавьте возможность сортировки злементов массива по номерам поездов. Добавьте возможность вывода
информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения, причем
поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
*/

public class Main {

	public static void main(String[] args) {
		Train[] trains = new Train[5];

		trains[0] = new Train("Minsk", 25, 12.15);
		trains[1] = new Train("Mosсow", 27, 11.42);
		trains[2] = new Train("Mosсow", 21, 20.05);
		trains[3] = new Train("Minsk", 28, 18.05);
		trains[4] = new Train("Kiev", 23, 11.10);

		sortNumberTrain(trains);
		printInformation(trains);
		sortCityName(trains);

	}

	public static void sortNumberTrain(Train[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[i].getNumberTrain() > arr[j].getNumberTrain()) {
					Train tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				j++;
			}
		}
	}

	public static void printInformation(Train[] arr) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Доступые номера поездов: ");
		for(Train q : arr) {
			System.out.print(q.getNumberTrain() + " ");
		}
		System.out.println("\nВведите номер поезда: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Неверный ввод. Введите номер поезда: ");
		}
		x = sc.nextInt();

		Train train = new Train();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i].getNumberTrain()) {
				train = arr[i];
				count++;
			}
		}

		if (count == 1) {
			System.out.println("Поезд N" + train.getNumberTrain() + " отправляется в " + train.getCityName() + " в "
					+ train.getTime());
		} else {
			System.out.println("К сожалению, поезда с таким номером не существует.");
		}

	}

	public static void sortCityName(Train[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				boolean sorted = false;
				String train = arr[i].getCityName().toLowerCase();
				String train2 = arr[j].getCityName().toLowerCase();

				if (train.equals(train2)) {
					if (arr[i].getTime() > arr[j].getTime()) {
						Train tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				} else if (train.charAt(0) > train2.charAt(0)) {
					Train tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				} else if (train.charAt(0) == train2.charAt(0)) {
					int k = 0;
					while (k < Math.min(train.length(), train2.length()) && train.charAt(k) == train2.charAt(k)) {
						k++;
					}

					if (k < Math.min(train.length(), train2.length()) && sorted == false
							&& train.charAt(k) > train2.charAt(k)) {
						Train tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
						sorted = true;
					}
				}
			}
		}
	}
}
