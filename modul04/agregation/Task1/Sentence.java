package by.jonline.modul04.agregation.Task1;

//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
//консоль текст, заголовок текста. 

public class Sentence {
	private String sentence;

	public Sentence(String sentence) {
		super();
		this.sentence = sentence;
	}

	public Sentence() {
		super();
		this.sentence = "";
	}

	public void createSentence(Word word) {
		sentence = word.getWord() + " ";
	}

	public String getSentence() {
		return sentence;
	}

}
