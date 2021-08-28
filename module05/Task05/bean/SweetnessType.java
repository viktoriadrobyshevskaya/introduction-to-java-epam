package by.jonline.module05.Task05.bean;

public enum SweetnessType {
	CANDIES("Конфеты"),
	BISCUITS("Пирожные"),
	COOKIES("Печенье");

	private final String type;

	private SweetnessType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
