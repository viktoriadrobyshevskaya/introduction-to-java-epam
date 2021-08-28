package by.jonline.modul04.Task06;

import java.util.Scanner;

/* Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.
*/

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		if (hours >= 0 && hours < 24) {
			return hours;
		} else {
			return 0;
		}
	}

	public void setHours(int hours) {
		if (hours >= 0 && hours < 24) {
			this.hours = hours;
		} else {
			this.hours = hours % 24;
		}
	}

	public int getMinutes() {
		if (minutes >= 0 && minutes < 60) {
			return minutes;
		} else {
			return 0;
		}
	}

	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes < 60) {
			this.minutes = minutes;
		} else {
			this.minutes = minutes % 60;
			this.hours++;
		}

	}

	public int getSeconds() {
		if (seconds >= 0 && seconds < 60) {
			return seconds;
		} else {
			return 0;
		}
	}

	public void setSeconds(int seconds) {
		if (seconds >= 0 && seconds < 60) {
			this.seconds = seconds;
		} else {
			this.seconds = seconds % 60;
			this.minutes++;
			if (this.minutes > 59) {
				this.hours++;
			}
		}
	}

	public void printTime() {
		System.out.println(getHours() + ":" + getMinutes() + ":" + getSeconds());
	}

	public void changeHours() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество часов, которое нужно добавить: ");
		int newHours = this.hours + sc.nextInt();
		setHours(newHours);
	}

	public void changeMinutes() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество минут, которое нужно добавить: ");
		int newMinutes = this.minutes + sc.nextInt();
		setMinutes(newMinutes);
	}

	public void changeSeconds() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество секунд, которое нужно добавить: ");
		int newSeconds = this.seconds + sc.nextInt();
		setSeconds(newSeconds);
	}
}
