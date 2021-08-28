package by.jonline.modul04.agregation.Task5;

public class TouristPackage {

	private Country country;
	private PackageType packageType;
	private TransportType transportType;
	private FoodType foodType;
	private int numberOfDay;
	private double price;

	public TouristPackage() {
	}

	public TouristPackage(Country country, PackageType packageType, TransportType transportType, FoodType foodType,
			int numberOfDay, double price) {
		super();
		this.country = country;
		this.packageType = packageType;
		this.transportType = transportType;
		this.foodType = foodType;
		this.numberOfDay = numberOfDay;
		this.price = price;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public PackageType getPackageType() {
		return packageType;
	}

	public void setPackageType(PackageType packageType) {
		this.packageType = packageType;
	}

	public TransportType getTransportType() {
		return transportType;
	}

	public void setTransportType(TransportType transportType) {
		this.transportType = transportType;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public int getNumberOfDay() {
		return numberOfDay;
	}

	public void setNumberOfDay(int numberOfDay) {
		this.numberOfDay = numberOfDay;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
		result = prime * result + numberOfDay;
		result = prime * result + ((packageType == null) ? 0 : packageType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transportType == null) ? 0 : transportType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TouristPackage other = (TouristPackage) obj;
		if (country != other.country)
			return false;
		if (foodType != other.foodType)
			return false;
		if (numberOfDay != other.numberOfDay)
			return false;
		if (packageType != other.packageType)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (transportType != other.transportType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Туристическая путевка: [страна: " + country.getType() + ", вид отдыха: " + packageType.getType() + ", вид транспорта: "
				+ transportType.getType() + ", питание: " + foodType.getType() + ", количество дней: " + numberOfDay + ", цена: " + price + "]";
	}

}
