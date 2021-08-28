package by.jonline.modul02.array2;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {
	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int) (Math.random() * 100 - 50);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int biggestElement = arr[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] > biggestElement) {
					biggestElement = arr[i][j];
				}
			}
		}

		System.out.println("-------------");
		int currentElement = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (currentElement % 2 != 0) {
					arr[i][j] = biggestElement;
				}
				System.out.print(arr[i][j] + " ");
				currentElement++;
			}
			System.out.println();
		}

	}
}