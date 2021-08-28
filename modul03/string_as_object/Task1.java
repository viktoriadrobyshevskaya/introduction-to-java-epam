package by.jonline.modul03.string_as_object;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {

	public static void main(String[] args) {
		String str = " папа мама   сестра брат      дядя тетя ";
		int count = 0;
		int max = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (Character.isWhitespace(str.charAt(i)) && Character.isWhitespace(str.charAt(i + 1))) {
				count++;
			} else if (Character.isWhitespace(str.charAt(i)) && !Character.isWhitespace(str.charAt(i + 1))) {
				count++;
				if (count > max) {
					max = count;

				}
				count = 0;
			}
		}

		System.out.println("Наибольшее количество подряд идущих пробелов: " + max);
	}
}