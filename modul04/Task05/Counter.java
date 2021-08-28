package by.jonline.modul04.Task05;

import java.util.Scanner;

/* Опишите класс, реализующий десятичный счётчик, который может увеличивать или уменьшать своё значение на единицу в заданном
диапазоне. Предусмотрите инициализацию счётчика значениями по умолчанию и произвольными значениями. Счётчик имеет методы 
увеличения и уменьшения состояния, и метод, позволяющий получить его текущее состояние. Написать код, демонстрирующий
все возможности класса. 
*/

public class Counter {
	private int x;
	private int maxValue;
	private int minValue;

	public Counter() {
		this.maxValue = 50;
		this.minValue = 2;
	}

	public Counter(int x) {
		super();
		this.x = x;
		this.maxValue = 50;
		this.minValue = 2;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public int getMinValue() {
		return minValue;
	}

	public void increase() {
		if (x < maxValue && x > minValue) {
			x++;
		}
	}

	public void decrease() {
		if (x > minValue && x < maxValue) {
			x--;
		}
	}

	public static int enterX() {
		Counter c = new Counter();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Диапазон: [" + c.minValue + ", " + c.maxValue + "]");
		System.out.println("Введите число х: ");
		i = sc.nextInt();
		if (i > c.getMaxValue() || i < c.getMinValue()) {
			System.out.println("Число вне заданного диапазона");
		}

		return i;
	}
}
