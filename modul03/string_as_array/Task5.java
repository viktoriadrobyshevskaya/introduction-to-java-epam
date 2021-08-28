package by.jonline.modul03.string_as_array;

//  Удалить в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить на  одиночные  пробелы. 
//  Крайние пробелы в строке удалить.

public class Task5 {

	public static void main(String[] args) {
		String str = " My  first English   word is \"CAT\".  ";
		String str2 = "";

		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		char[] arr2 = new char[str.length()];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (!Character.isWhitespace(arr[i])) {
				arr2[j] = arr[i];
				j++;
			} else if (Character.isWhitespace(arr[i]) && !Character.isWhitespace(arr[i + 1])) {
				arr2[j] = arr[i];
				j++;
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			str2 = str2 + arr2[i];
		}
		str2 = str2.trim();

		System.out.println("\"" + str + "\"");
		System.out.println("\"" + str2 + "\"");
	}
}
