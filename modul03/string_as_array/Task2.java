package by.jonline.modul03.string_as_array;

// Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {

	public static void main(String[] args) {
		String str = "My first English word is CAT. Second word - dog.";
		String word = "word";
		String letter = "letter";

		String newStr = str.replace(word, letter);
		System.out.println(newStr);

		// the second version

		String str2 = "My first English word is CAT. Second word - dog.";
		String word2 = "word";
		String letter2 = "letter";

		String[] arr = str2.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(word2)) {
				arr[i] = letter2;
			}
		}
		String newStr2 = "";
		for (int i = 0; i < arr.length; i++) {
			newStr2 = newStr2 + arr[i] + " ";
		}
		System.out.println(newStr2);

	}

}
