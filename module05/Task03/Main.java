package by.jonline.module05.Task03;

import by.jonline.module05.Task03.Calendar.Date;

// Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях.

public class Main {

	public static void main(String[] args) {
		Calendar calendar = new Calendar();

		Date newYear = new Date("01.01.2021", TypeOfDay.HOLIDAY);
		Date weekDay = new Date("04.01.2021", TypeOfDay.WEEKDAY);
		Date easter = new Date("02.05.2021", TypeOfDay.WEEKEND);
		Date holiday = new Date("08.03.2021", TypeOfDay.HOLIDAY);
		
		calendar.addDate(newYear);
		calendar.addDate(easter);
		calendar.addDate(holiday);
		calendar.removeDate(weekDay);
		
		View.printDate(calendar);;

	}

}
