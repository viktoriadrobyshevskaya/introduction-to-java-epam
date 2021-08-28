package by.jonline.module05.Task03;

import by.jonline.module05.Task03.Calendar.Date;

public class View {

	public static void printDate(Calendar calendar) {
		System.out.println("Праздники, которые мы сохранили в календаре: ");

		for (Date cal : calendar.getDates()) {
			System.out.println(cal.getInfo());
		}

	}

}
