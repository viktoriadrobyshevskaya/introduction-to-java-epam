package by.jonline.modul04.agregation.Task5;

public enum Country {
	ITALY("Италия"),
	CYPRUS("Кипр"),
	TURKEY("Турция"), 
	GERMANY("Германия");

	private String type;

	private Country(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
