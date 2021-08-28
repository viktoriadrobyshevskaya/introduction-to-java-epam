package by.jonline.modul04.Task10;

/*	Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline {
	private String destination;
	private int flightNumber;
	private String type;
	private LocalTime time;
	private DayOfWeek dayOfWeek;

	public Airline() {
		super();
		new Airline("Лондон", 111, "Boeing-747", LocalTime.of(12, 0), DayOfWeek.MONDAY);
	}

	public Airline(String destination, int flightNumber, String type, LocalTime time, DayOfWeek dayOfWeek) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.type = type;
		this.time = time;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", type=" + type + ", time="
				+ time + ", dayOfWeek=" + dayOfWeek + "]";
	}

}