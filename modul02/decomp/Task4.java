package by.jonline.modul02.decomp;

/*
На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек
самое большое расстояние. Указание. Координаты точек занести в массив.
*/

public class Task4 {

	public static void main(String[] args) {
		int n = 4;
		int[] x = new int[n];
		int[] y = new int[n];

		fill(x, y);
		System.out.println("Задаем точки::");

		for (int i = 0; i < x.length; i++) {
			System.out.println(String.format("(%d,%d)", x[i], y[i]));
		}

		System.out.println();
		int[] points = maxDistance(x, y);
		System.out.println(String.format("Самое большое расстояние между точек: (%d, %d) и (%d, %d)", x[points[0]],
				y[points[0]], x[points[1]], y[points[1]]));

	}

	public static void fill(int[] arr, int[] arr2) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round((Math.random() * 20) - 15);
			arr2[i] = (int) Math.round((Math.random() * 20) - 15);
		}
	}

	public static double distance(int x1, int x2, int y1, int y2) {
		double distance = 0;
		distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return distance;
	}

	public static int[] maxDistance(int[] arr, int[] arr2) {
		double maxDistance = 0;
		double d = 0;
		int[] points = new int[2];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				d = distance(arr[i], arr[j], arr2[i], arr2[j]);
				System.out.println(
						String.format("Дистанция между (%d,%d) (%d,%d) = %f", arr[i], arr2[i], arr[j], arr2[j], d));
				if (d > maxDistance) {
					maxDistance = d;
					points[0] = i;
					points[1] = j;
				}
			}
		}
		return points;
	}
}
