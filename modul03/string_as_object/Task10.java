package by.jonline.modul03.string_as_object;

//Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
//Определить количество предложений в строке X.

public class Task10 {

	public static void main(String[] args) {
		String strX = "Я люблю собак. Они очень милые. А вот котов не люблю! А ты кого больше?";
		int count = 0;

		for (int i = 0; i < strX.length(); i++) {
			char x = strX.charAt(i);
			if (x == '.' || x == '?' || x == '!') {
				count++;
			}
		}
		System.out.println("В строке " + count + " предложения(ий).");
	}
}
