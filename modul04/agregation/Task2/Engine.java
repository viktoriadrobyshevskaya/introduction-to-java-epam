package by.jonline.modul04.agregation.Task2;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
//менять колесо, вывести на консоль марку автомобиля

public class Engine {

	private boolean isStarted;
	private int fuelLevel;

	public Engine() {
		super();
		this.isStarted = false;
		this.fuelLevel = 0;
	}

	public Engine(boolean isStarted, int fuelLevel) {
		super();
		this.isStarted = isStarted;
		this.fuelLevel = fuelLevel;
	}

	public void startEngine() {
		if (this.fuelLevel > 0) {
			this.isStarted = true;
		}
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		if (fuelLevel < 0) {
			System.out.println("Уровень топлива не может быть меньше нуля.");
		} else {
			this.fuelLevel = fuelLevel;
		}

	}

	public boolean isStarted() {
		return isStarted;
	}
}