package by.jonline.modul02.array2;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {

	public static void main(String[] args) {
		int n = 4;
		int[][] arr = { { -5, 7, -3, 17 }, { -7, 8, 1, -12 }, { -8, -1, 2, 3 }, { 8, 1, -2, -3 } };

		print(arr);

		System.out.println("Положительные элементы главной диагонали: ");
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (i == j) {
					if (arr[i][j] > 0) {
						System.out.println(arr[i][j]);
					}
				}
			}
		}

	}

	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
