package by.jonline.modul04.agregation.Task5;

import java.util.ArrayList;
import java.util.List;

public class PackageList {

	private List<TouristPackage> touristPackages;

	{
		touristPackages = new ArrayList<>();
	}

	public PackageList() {
		super();
		List<TouristPackage> touristPackages = new ArrayList<>();
		touristPackages.add(new TouristPackage(Country.ITALY, PackageType.SHOPING, TransportType.PLANE,
				FoodType.NOT_INCLUDET, 7, 500));
		touristPackages.add(new TouristPackage(Country.CYPRUS, PackageType.REST, TransportType.SHIP,
				FoodType.ALL_INCLUSIVE, 14, 1500));
		touristPackages.add(new TouristPackage(Country.GERMANY, PackageType.TREATMENT, TransportType.TRAIN,
				FoodType.ALL_INCLUSIVE, 20, 3800));
		touristPackages.add(new TouristPackage(Country.TURKEY, PackageType.EXCURSION, TransportType.BUS,
				FoodType.BREAKFAST_ONLY, 10, 3000));

		this.touristPackages = touristPackages;
	}

	public PackageList(List<TouristPackage> touristPackage) {
		super();
		this.touristPackages = touristPackage;
	}

	public void addNewTouristPackage(TouristPackage newTouristPackage) {
		touristPackages.add(newTouristPackage);
	}

	public void removeTouristPackage(TouristPackage newTouristPackage) {
		touristPackages.add(newTouristPackage);
	}

	public List<TouristPackage> getTouristPackages() {
		return touristPackages;
	}

	public void setTouristPackages(List<TouristPackage> touristPackages) {
		this.touristPackages = touristPackages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((touristPackages == null) ? 0 : touristPackages.hashCode());
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
		PackageList other = (PackageList) obj;
		if (touristPackages == null) {
			if (other.touristPackages != null)
				return false;
		} else if (!touristPackages.equals(other.touristPackages))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PackageList [touristPackages=" + touristPackages + "]";
	}

}
