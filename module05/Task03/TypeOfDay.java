package by.jonline.module05.Task03;

public enum TypeOfDay {
	HOLIDAY("Праздник"), WEEKEND("Выходной"), WEEKDAY("Будний");

	private String type;

	private TypeOfDay(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
