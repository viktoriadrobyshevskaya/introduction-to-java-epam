package by.jonline.modul03.string_as_object;

//Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {

	public static void main(String[] args) {
		String str = "it's just random text that doesn't mean anything.";
		String str2 = "";

		for (int i = 0; i < str.length(); i++) {
			str2 = str2 + str.charAt(i) + str.charAt(i);
		}
		System.out.println(str2);
	}
}
