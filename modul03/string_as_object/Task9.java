package by.jonline.modul03.string_as_object;

//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
//Учитывать только английские буквы.

public class Task9 {

	public static void main(String[] args) {
		String str = "That morning my wife and I said our usual GOODBYES.";

		int countUpCase = 0;
		int countLowCase = 0;

		int i = 0;
		while (i < str.length()) {
			if (Character.isAlphabetic(str.charAt(i))) {
				if (Character.isUpperCase(str.charAt(i))) {
					countUpCase++;
				} else if (Character.isLowerCase(str.charAt(i))) {
					countLowCase++;
				}
			}
			i++;
		}
		System.out.println("Строчный букв - " + countLowCase);
		System.out.println("Прописных букв - " + countUpCase);
	}
}