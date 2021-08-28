package by.jonline.modul04.agregation.Task3;

//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
//столицу, количество областей, площадь, областные центры.

public class State {
	private String stateName;
	private String capital;
	private int numberRegion;
	private String[] regions;
	private double stateSquare;

	public State(String stateName, String capital, int numberRegion, String[] regions, double stateSquare) {
		super();
		this.stateName = stateName;
		this.capital = capital;
		this.numberRegion = numberRegion;
		this.regions = regions;
		this.stateSquare = stateSquare;
	}

	public State() {
		super();
		this.stateName = "";
		this.capital = new City().getCityName();
		this.numberRegion = new Region().getNumberRegion();
		this.regions = new Region().getRegions();
		this.stateSquare = 0;
	}

	public String getStateName() {
		System.out.print("Название государства: ");
		return stateName;
	}

	public String getCapital() {
		System.out.print("Столица государства: ");
		return capital;
	}

	public int getNumberRegion() {
		System.out.print("Количество областей: ");
		return numberRegion;
	}

	public String[] getRegions() {
		System.out.print("Областные пункты: ");
		return regions;
	}

	public double getStateSquare() {
		System.out.print("Площадь государства: ");
		return stateSquare;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setNumberRegion(int numberRegion) {
		this.numberRegion = numberRegion;
	}

	public void setRegions(String[] regions) {
		this.regions = regions;
	}

	public void setStateSquare(double stateSquare) {
		this.stateSquare = stateSquare;
	}

}
