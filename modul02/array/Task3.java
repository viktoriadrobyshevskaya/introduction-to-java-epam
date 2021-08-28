package by.jonline.modul02.array;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов. 

public class Task3 {

	public static void main(String[] args) {
		int n = 10;
		int[] arr = new int[n];

		int s = -5;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s;
			s++;
		}

		int pos = 0;		// положительные
		int neg = 0;        // отрицательные
		int zero = 0;       // нулевые

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				neg++;
			} else if (arr[i] > 0) {
				pos++;
			} else if (arr[i] == 0) {
				zero++;
			}
		}

		System.out.println("pos: " + pos + " neg: " + neg + " zero: " + zero);
	}
}
