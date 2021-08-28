package by.jonline.module05.Task05.bean;

public enum Color {
	GREEN("Зеленый"), RED("Красный"), BLUE("Синий");

	private final String value;

	private Color(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
