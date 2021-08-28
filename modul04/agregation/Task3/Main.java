package by.jonline.modul04.agregation.Task3;

import java.util.Arrays;

// Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
// столицу, количество областей, площадь, областные центры.

public class Main {

	public static void main(String[] args) {
		String[] reg = { "Гомель", "Минск", "Витебск", "Гродно", "Могилев", "Брест" };

		State state = new State("Беларусь", "Минск", 6, reg, 207.6);

		System.out.println(state.getStateName());
		System.out.println(state.getCapital());
		System.out.println(state.getNumberRegion());
		System.out.println(Arrays.toString(state.getRegions()));
		System.out.println(state.getStateSquare());

	}
}