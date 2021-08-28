package by.jonline.modul04.agregation.Task2;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
//менять колесо, вывести на консоль марку автомобиля

public class Automobile {
	private String model;
	private Engine engine;
	private Wheel[] wheels;

	public Automobile() {
		super();
		this.model = "Lada";
		this.engine = new Engine(true, 100);
		this.wheels = Wheel.getWeels();
	}

	public Automobile(String model, Engine engine, Wheel[] wheels) {
		super();
		this.model = model;
		this.engine = engine;
		this.wheels = wheels;
	}

	public void getModel() {
		System.out.println("Марка автомобиля - " + model);
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void fillUp(int fuelLevel) {
		if (fuelLevel == 0) {
			fuelLevel = 100;
		}
	}

	public void go() {
		if (engine.isStarted() && engine.getFuelLevel() > 0 && Wheel.checkWheels(wheels) < 0) {
			System.out.println("Поехали!");
		} else {
			System.out.println("Упс. Что-то не так!");
		}
		if (engine.getFuelLevel() <= 0) {
			fillUp(100);
			System.out.println("Бак заправлен. Можем ехать!");
		}
		if (Wheel.checkWheels(wheels) >= 0) {
			Wheel.changeWheels(wheels);
			System.out.println("Колеса в порядке. Можем ехать!");
		}

		if (!engine.isStarted()) {
			engine.startEngine();
			System.out.println("Двигатель запущен. Можем ехать!");
		}

	}

}