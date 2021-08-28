package by.jonline.modul04.Task10;

/*	Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
*/

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

public class AirlineList {
	private int count;
	private Airline[] airlines;

	public AirlineList(int count, Airline[] airlines) {
		super();
		this.count = count;
		this.airlines = airlines;
	}

	public AirlineList() {
		super();
		int randomcount = 6;
		Airline[] airlines = new Airline[randomcount];
		airlines[0] = new Airline("Лондон", 111, "Boeing-747", LocalTime.of(19, 35), DayOfWeek.MONDAY);
		airlines[1] = new Airline("Париж", 165, "TU-154", LocalTime.of(18, 20), DayOfWeek.TUESDAY);
		airlines[2] = new Airline("Париж", 180, "Boeing-747", LocalTime.of(10, 45), DayOfWeek.FRIDAY);
		airlines[3] = new Airline("Рим", 110, "Boeing-747", LocalTime.of(10, 40), DayOfWeek.MONDAY);
		airlines[4] = new Airline("Севилья", 201, "TU-154", LocalTime.of(11, 05), DayOfWeek.THURSDAY);
		airlines[5] = new Airline("Лондон", 131, "TU-154", LocalTime.of(22, 10), DayOfWeek.MONDAY);

		new AirlineList(randomcount, airlines);

		this.count = randomcount;
		this.airlines = airlines;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Airline[] getAirlines() {
		return airlines;
	}

	public void setAirlines(Airline[] airlines) {
		this.airlines = airlines;
	}

	@Override
	public String toString() {
		return "AirlineList [count=" + count + ", airlines=" + Arrays.toString(airlines) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(airlines);
		result = prime * result + count;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirlineList other = (AirlineList) obj;
		if (!Arrays.equals(airlines, other.airlines))
			return false;
		if (count != other.count)
			return false;
		return true;
	}

}
