package by.jonline.modul03.string_as_array;

// В строке найти количество цифр.

public class Task3 {

	public static void main(String[] args) {
		String str = "саша 4545 маша 7874 катя 577";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println("В строке " + count + " цифр.");
	}

}
