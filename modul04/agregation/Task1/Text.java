package by.jonline.modul04.agregation.Task1;

//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
//консоль текст, заголовок текста. 

public class Text {
	private String text;
	private String titleText;

	public Text() {
		super();
		this.text = "";
		this.titleText = "";
	}

	public Text(String text, String titleText) {
		super();
		this.text = text;
		this.titleText = titleText;
	}

	public void createTitleText(Sentence sentence) {
		titleText = sentence.getSentence();
	}

	public String getTitleText() {
		return titleText;
	}

	public void createText(Sentence sentence) {
		text = text + sentence.getSentence();
	}

	public String getText() {
		return text;
	}

	public String getTitleAndText() {
		return titleText + "\n" + text;
	}
}
