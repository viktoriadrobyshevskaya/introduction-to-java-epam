package by.jonline.modul04.agregation.Task5;

public enum TransportType {
	BUS("Автобус"),
	SHIP("Корабль"),
	PLANE("Самолет"),
	TRAIN("Поезд");

	private String type;

	private TransportType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
