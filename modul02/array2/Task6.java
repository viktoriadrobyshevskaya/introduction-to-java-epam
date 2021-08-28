package by.jonline.modul02.array2;

/*  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1 1 1 ... 1 1 1
0 1 1 ... 1 1 0
0 0 1 ... 1 0 0
...............
0 1 1 ... 1 1 0
1 1 1 ... 1 1 1
*/

public class Task6 {

	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];

		for (int i = 0; i < n/2 + 1; i++) {
			for (int j = i; j < n - i; j++) {
				arr[i][j] = 1;
			}
		}
		for (int i = n/2; i < n; i++) {
			for (int j = n-i-1; j < i+1; j++) {
				arr[i][j] = 1;
			}
		}

		print(arr);
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
