package by.jonline.modul03.string_as_object;

//С помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт".

public class Task4 {

	public static void main(String[] args) {
		String str = "информатика";
		String str2 = "";

		str2 = str2 + str.charAt(7) + str.charAt(3) + str.charAt(4) + str.charAt(7);

		System.out.println(str2);
	}
}
