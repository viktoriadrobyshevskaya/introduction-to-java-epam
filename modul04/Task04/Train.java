package by.jonline.modul04.Task04;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте данные в массив
из пяти злементов типа Train, добавьте возможность сортировки злементов массива по номерам поездов. Добавьте возможность вывода
информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения, причем
поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
*/

public class Train {
	private String cityName;
	private int numberTrain;
	private double time;

	public Train() {

	}

	public Train(String cityName, int numberTrain, double time) {
		super();
		this.cityName = cityName;
		this.numberTrain = numberTrain;
		this.time = time;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

}
