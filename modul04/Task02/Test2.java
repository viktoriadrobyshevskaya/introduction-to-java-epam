package by.jonline.modul04.Task02;

//Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор, 
//инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {
	private int x;
	private String word;

	public Test2(int x, String word) {
		this.x = x;
		this.word = word;
	}

	public Test2() {
		x = 0;
		word = "";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
