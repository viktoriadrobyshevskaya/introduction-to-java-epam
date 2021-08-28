package by.jonline.modul04.agregation.Task2;

//  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
//  менять колесо, вывести на консоль марку автомобиля

public class Main {

	public static void main(String[] args) {
		Engine engine = new Engine();
		Wheel[] wheels = Wheel.getWeels();
		Automobile ford = new Automobile("Ford", engine, wheels);

		ford.getModel(); // вывести марку автомобиля

		engine.setFuelLevel(100); // заправляем машину
		engine.startEngine(); // включаем двигатель

		ford.go(); // едем

	}

}