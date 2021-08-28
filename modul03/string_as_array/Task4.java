package by.jonline.modul03.string_as_array;

// В строке найти количество чисел.

public class Task4 {

	public static void main(String[] args) {
		String str = "саша 25. маша 321. катя 145. петя 2.";
		int count = 0;
		boolean isCounted = false;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (!isCounted) {
					count++;
					isCounted = true;
				}
			} else {
				isCounted = false;
			}
		}

		System.out.println("В строке " + count + " чисел.");
	}
}
