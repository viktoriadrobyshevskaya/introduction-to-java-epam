package by.jonline.modul02.array2;

/* Сформировать квадратную матрицу порядка n по правилу: a[i, j] = sin((i^2 - j^2)/n)
   и подсчитать количество положительных элементов в ней.
*/

public class Task7 {

	public static void main(String[] args) {
		int n = 6;
		int count = 0;
		double[][] arr = new double[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				double d = Math.pow(i, 2) - Math.pow(j, 2);
				arr[i][j] = Math.sin(d / n);
				if (arr[i][j] > 0) {
					count++;
				}
			}
		}
		System.out.println("Количество положительных элементов матрицы: " + count);
	}
}
