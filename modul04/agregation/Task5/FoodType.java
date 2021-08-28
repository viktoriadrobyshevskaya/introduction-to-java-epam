package by.jonline.modul04.agregation.Task5;

public enum FoodType {
	NOT_INCLUDET("Не включено"),
	BREAKFAST_ONLY("Только завтрак"),
	ALL_INCLUSIVE("Всё включено");
	
	private String type;

	private FoodType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
}
