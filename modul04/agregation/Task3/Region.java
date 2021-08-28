package by.jonline.modul04.agregation.Task3;

//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
//столицу, количество областей, площадь, областные центры.

public class Region {
	private String regionName;
	private String regionalCenter;
	private int numberRegion;
	private String[] regions;

	public Region() {
		super();
		this.regionName = regionalCenter + " region";
		this.regionalCenter = new City().getCityName();
		this.numberRegion = 0;
		this.regions = new String[numberRegion];
	}

	public String[] getRegions() {
		for (int i = 0; i < this.regions.length; i++) {
			this.regions[i] = new City().getCityName();
		}
		return this.regions;
	}

	public Region(String regionName, String regionalCenter, int numberRegion, String[] regions) {
		super();
		this.regionName = regionName;
		this.regionalCenter = regionalCenter;
		this.numberRegion = numberRegion;
		this.regions = regions;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionalCenter() {
		return regionalCenter;
	}

	public void setRegionalCenter(String regionalCenter) {
		this.regionalCenter = regionalCenter;
	}

	public int getNumberRegion() {
		return numberRegion;
	}

	public void setNumberRegion(int numberRegion) {
		this.numberRegion = numberRegion;
	}

	public void setRegions(String[] regions) {
		this.regions = regions;
	}
	
	

}
