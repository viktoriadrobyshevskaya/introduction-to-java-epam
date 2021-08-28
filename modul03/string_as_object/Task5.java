package by.jonline.modul03.string_as_object;

//Подсчитать, сколько раз среди символов заданной строки встречается буква "а".

public class Task5 {

	public static void main(String[] args) {
		String str = "it's just random text that doesn't mean anything.";
		int count = 0;

		int i = 0;
		while (i < str.length()) {
			if (str.charAt(i) == 'a') {
				count++;
			}
			i++;
		}
		System.out.println("В строке " + count + " раз(а) встречается буква а");
	}
}
