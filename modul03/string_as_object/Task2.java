package by.jonline.modul03.string_as_object;

//В строке вставить после каждого символа а символ Ь.

public class Task2 {

	public static void main(String[] args) {
		String str = "It's just random text that doesn't mean anything.";

		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				str2 = str2 + str.charAt(i) + 'b';
			} else {
				str2 = str2 + str.charAt(i);
			}
		}

		System.out.println(str2);
	}
}
