package by.jonline.modul04.agregation.Task5;

import java.util.Comparator;
import java.util.List;

public class TouristPackegeLogic {

	public static void sortByPrice(List<TouristPackage> list) {
		list.sort(Comparator.comparing(TouristPackage::getPrice));
	}

	public static void sortByNumberOfDays(List<TouristPackage> list) {
		list.sort(Comparator.comparing(TouristPackage::getNumberOfDay));
	}



}
