package by.jonline.modul04.agregation.Task2;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
//менять колесо, вывести на консоль марку автомобиля

public class Wheel {
	private boolean isPumppedUp;

	public Wheel(boolean isPumppedUp) {
		super();
		this.isPumppedUp = isPumppedUp;
	}

	public Wheel() {
		super();
		this.isPumppedUp = false;
	}

	public boolean isPumppedUp() {
		return isPumppedUp;
	}

	public static Wheel[] getWeels() {
		Wheel[] wheels = new Wheel[4];
		wheels[0] = new Wheel(true);
		wheels[1] = new Wheel(true);
		wheels[2] = new Wheel(true);
		wheels[3] = new Wheel(true);

		return wheels;
	}

	public static int checkWheels(Wheel[] wheels) {
		int number = -1;

		for (int i = 0; i < wheels.length; i++) {
			if (!wheels[i].isPumppedUp()) {
				number = i;
			}
		}

		if (number >= 0) {
			return number;
		} else {
			return -1;
		}
	}

	public static void changeWheels(Wheel[] wheels) {
		int blownWheel = checkWheels(wheels);
		if (blownWheel >= 0) {
			wheels[blownWheel] = new Wheel(true);
		}
	}

}
