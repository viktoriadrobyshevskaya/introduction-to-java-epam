package by.jonline.modul04.agregation.Task3;

//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
//столицу, количество областей, площадь, областные центры.

public class City {
	private String cityName;
	private double citySquare;

	public City(String cityName, double citySquare) {
		super();
		this.cityName = cityName;
		this.citySquare = citySquare;
	}

	public City() {
		super();
	}

	public boolean isCapital() {
		return true;
	}

	public String getCityName() {
		return cityName;
	}

	public double getCitySquare() {
		return citySquare;
	}

	public void setCitySquare(double citySquare) {
		this.citySquare = citySquare;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
