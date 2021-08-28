package by.jonline.module05.Task05.bean;

public enum PackingType {
	PACKET("Пакет"),
	BOX("Коробка");

	private final String type;

	private PackingType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
