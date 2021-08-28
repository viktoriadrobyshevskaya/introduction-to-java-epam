package by.jonline.modul04.Task10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 	Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

public class AirlineLogic {

	public static List<Airline> outputFlightsByDestination(Airline[] arr) {
		String destination;
		List<Airline> sortByDestination = new ArrayList<Airline>();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите пунк назначения: ");
		destination = scanner.next();

		boolean isIt = false;
		for (Airline x : arr) {
			if (x.getDestination().equalsIgnoreCase(destination)) {
				isIt = true;
				sortByDestination.add(x);
			}
		}
		if (isIt == false) {
			System.out.println("К сожалению, такого пункта назначения нет в списке.");
		}

		return sortByDestination;
	}

	public static List<Airline> outputFlightsByDayOfWeek(Airline[] arr) {
		int day;
		List<Airline> sortByDay = new ArrayList<Airline>();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задайте день недели цифрой (1-7): ");
		day = scanner.nextInt();

		boolean isIt = false;
		for (Airline x : arr) {
			if (x.getDayOfWeek().getValue() == day) {
				isIt = true;
				sortByDay.add(x);
			}
		}
		if (isIt == false) {
			System.out.println("К сожалению, в этот день нет рейсов.");
		}

		return sortByDay;
	}

	public static void printList(List<Airline> list) {
		for (Airline x : list) {
			System.out
					.print(String.format("Рейс N%d. Пункт назначения - %s.", x.getFlightNumber(), x.getDestination()));
			System.out.println(" Время вылета - " + x.getTime());
		}
	}

	public static void outputByTime(List<Airline> list) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x;
		int y;

		System.out.print("Задайте время для сортировки. Часы: ");
		x = sc.nextInt();
		System.out.print("Минуты: ");
		y = sc.nextInt();
		LocalTime time = LocalTime.of(x, y);
		System.out.println("Рейсы для заданного дня недели, время вылета для которых больше заданного: ");

		boolean isIt = false;
		for (Airline airline : list) {
			if (airline.getTime().isAfter(time)) {
				isIt = true;
				System.out.print(String.format("Рейс N%d. Пункт назначения - %s.", airline.getFlightNumber(),
						airline.getDestination()));
				System.out.println(" Время вылета - " + airline.getTime());
			}
		}

		if (isIt == false) {
			System.out.println("К сожалению, в это время нет рейсов.");
		}
	}

}
