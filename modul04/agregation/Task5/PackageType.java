package by.jonline.modul04.agregation.Task5;

public enum PackageType {
	SHOPING("Шопинг"),
	EXCURSION("Экскурсия"),
	CRUISE("Круиз"),
	TREATMENT("Лечение"),
	REST("Отдых");
	
	private String type;

	private PackageType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
