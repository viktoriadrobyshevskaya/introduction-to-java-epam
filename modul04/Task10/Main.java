package by.jonline.modul04.Task10;

import java.util.List;

/*	Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
	Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
	Задать критерии выбора данных и вывести эти данные на консоль.

	Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

	Найти и вывести:
	a) список рейсов для заданного пункта назначения;
	b) список рейсов для заданного дня недели;
	c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

public class Main {

	public static void main(String[] args) {
		AirlineList airlineList = new AirlineList();
		Airline[] airlines = airlineList.getAirlines();

		List<Airline> arr = AirlineLogic.outputFlightsByDayOfWeek(airlines);
		AirlineLogic.printList(arr);
		AirlineLogic.outputByTime(arr);

		List<Airline> arr2 = AirlineLogic.outputFlightsByDestination(airlines);
		AirlineLogic.printList(arr2);

	}

}
