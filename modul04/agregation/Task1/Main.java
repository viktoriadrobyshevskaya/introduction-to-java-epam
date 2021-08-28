package by.jonline.modul04.agregation.Task1;

// Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
// консоль текст, заголовок текста. 

public class Main {

	public static void main(String[] args) {

		Word word = new Word("Это заголовок");
		Word word2 = new Word("Какой-то интересный текст.");

		Sentence sentence = new Sentence();
		sentence.createSentence(word);

		Sentence sentence2 = new Sentence();
		sentence2.createSentence(word2);

		Text text = new Text();
		text.createTitleText(sentence);
		text.createText(sentence2);

		System.out.println(text.getTitleText());
		System.out.println(text.getText());

		// дополним текст
		System.out.println("______________________________");

		Word word3 = new Word("Что-то добавляется в текст.");
		sentence2.createSentence(word3);
		text.createText(sentence2);

		System.out.println(text.getTitleAndText());
	}
}
