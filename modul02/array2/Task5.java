package by.jonline.modul02.array2;

/*  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1 1 1 ... 1 1 1
 2 2 2 ... 2 2 0
 3 3 3 ... 3 0 0
 ...............
 n-1 n-1 ..0 0 0
 n 0 0 ... 0 0 0
*/
public class Task5 {

	public static void main(String[] args) {
		int n = 6;
		int m = n;
		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = i + 1;
			}
			m--;
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
