package by.jonline.module05.Task04.bean;

public enum TreasureType {
	MONEY("Деньги"), GYM("Драгоценный камень"), JEWELLERY("Ювелирное изделие");

	private final String name;

	private TreasureType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static TreasureType findByName(String name) {
		for (TreasureType type : values()) {
			if (type.name.equals(name)) {
				return type;
			}
		}
		throw new IllegalArgumentException("Данное сокровище " + name + " не найдено");
	}
}
