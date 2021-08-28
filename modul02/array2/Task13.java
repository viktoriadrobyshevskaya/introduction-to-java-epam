package by.jonline.modul02.array2;

//Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.

public class Task13 {

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

		for (int k = 0; k < n; k++) {
			for (int j = k; j < n; j++) {
				for (int i = 0; i < n - 1; i++) {
					if (arr[i][k] > arr[i + 1][k]) {
						int temp = arr[i][k];
						arr[i][k] = arr[i + 1][k];
						arr[i + 1][k] = temp;
					}
				}
			}
		}

		System.out.println("------cтолбцы по возрастанию------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

		for (int k = 0; k < n; k++) {
			for (int j = k; j < n; j++) {
				for (int i = 0; i < n - 1; i++) {
					if (arr[i][k] < arr[i + 1][k]) {
						int temp = arr[i][k];
						arr[i][k] = arr[i + 1][k];
						arr[i + 1][k] = temp;
					}
				}
			}
		}

		System.out.println("-------столбцы по убыванию-------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
	}
}
