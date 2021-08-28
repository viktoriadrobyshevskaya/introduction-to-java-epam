package by.jonline.modul03.string_as_array;

//  Дан массив названий переменных в camelCase. Преобразовать названия в snake_case

public class Task1 {

	public static void main(String[] args) {
		int randomNum = 7;
		String[] titles = new String[randomNum];

		fillArray(titles);
		toSnakeCase(titles);
		printArray(titles);
	}

	public static void fillArray(String[] arr) {
		arr[0] = "lastName";
		arr[1] = "idCustomer";
		arr[2] = "typeAirline";
		arr[3] = "homeAdress";
		arr[4] = "countNumber";
		arr[5] = "tmpName";
		arr[6] = "scannerName";
	}

	public static void toSnakeCase(String[] arr) {
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			while (k < arr[i].length()) {

				if (Character.isUpperCase(arr[i].charAt(k))) {
					s = s + "_" + arr[i].charAt(k);
					s = s.toLowerCase();
				} else {
					s = s + arr[i].charAt(k);
				}
				k++;
			}
			arr[i] = s;
			s = "";
		}
	}

	public static void printArray(String[] arr) {
		for (String x : arr) {
			System.out.println(x);
		}
	}
}
