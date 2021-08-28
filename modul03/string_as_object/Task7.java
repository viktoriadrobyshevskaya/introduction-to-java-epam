package by.jonline.modul03.string_as_object;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, 
//если было введено "abc cde def", то должно быть выведено 'abcdef'

public class Task7 {

	public static void main(String[] args) {
		String str = "abc cde def";
		StringBuilder builder = new StringBuilder(str);

		for (int i = 0; i < builder.length(); i++) {
			if (Character.isWhitespace(builder.charAt(i))) {
				builder.deleteCharAt(i);
			}
			int k = i + 1;
			while (k < builder.length()) {
				if (builder.charAt(i) == builder.charAt(k)) {
					builder.deleteCharAt(k);
				}
				k++;
			}

		}
		System.out.println(builder.toString());
	}
}
