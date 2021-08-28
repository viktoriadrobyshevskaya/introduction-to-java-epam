package by.jonline.modul02.array2;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1  2   3  ... n
n n-1 n-2 ... 1
1  2   3  ... n
n n-1 n-2 ... 1
...............
n n-1 n-2 ... 1
 */
public class Task4 {

	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = j + 1;
				}
			} else {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = n - j;
				}
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
