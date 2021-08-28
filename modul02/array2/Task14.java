package by.jonline.modul02.array2;

import java.util.ArrayList;

// Сформировать случайную матрицу mxn, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

public class Task14 {
	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}

		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arrayList.add(arr[j][i]);
			}

			for (int j = 0; j < n; j++) {
				arr[j][i] = arrayList.get(j);
			}
			arrayList.clear();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}