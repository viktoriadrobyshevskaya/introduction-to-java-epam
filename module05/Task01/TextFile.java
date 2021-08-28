package by.jonline.module05.Task01;

//Создать объект Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

public class TextFile extends File {

	private String text;

	public TextFile() {
	}

	public TextFile(String name) {
		super(name);
	}

	public TextFile(String name, String text) {
		super(name);
		this.text = text;
	}

	public void rename(String newName) {
		super.setName(newName);
	}

	public void addText(String str) {
		this.text += " " + str;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ". TextFile text: " + text;
	}

}
