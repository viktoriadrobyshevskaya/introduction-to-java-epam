package by.jonline.modul01.branch;

import java.util.Random;

// Вычислить значение функции

public class Task5 {

	public static void main(String[] args) {
		Random r = new Random();

		int x = r.nextInt(5);
		double f = 0;

		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
		} else if (x > 3) {
			f = 1 / (Math.pow(x, 3) + 6);
		}
		
		System.out.println(f);
	}
}
