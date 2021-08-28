package by.jonline.modul04.agregation.Task5;

import java.util.List;

/* Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок. 
 */

public class Main {

	public static void main(String[] args) {
		PackageList package1 = new PackageList();

		List<TouristPackage> pack = package1.getTouristPackages();
		Menu.printMenu(pack);

	}

}
