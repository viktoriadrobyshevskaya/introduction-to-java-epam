package by.jonline.modul02.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* Заданы два одномерных массива с различным количеством элементов и натуральное число к. 
   Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого, при этом не используя дополнительный массив.
*/
public class Task1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] arr2 = new int[8];

		fill(arr);
		fill(arr2);

		int k = enter(arr);

		System.out.println("Первый массив: " + Arrays.toString(arr));
		System.out.println("Второй массив: " + Arrays.toString(arr2));

		join(arr, arr2, k);

	}

	public static int enter(int[] arr) {
		int k;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Введите k: ");
			k = sc.nextInt();
			if (k >= arr.length) {
				System.out.println("Введенное число больше длинны массива.");
			} else {
				return k;
			}
		}
	}

	public static void fill(int[] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(20);
		}
	}

	public static void join(int[] arr, int[] arr2, int k) {
		arr = Arrays.copyOf(arr, arr.length + arr2.length);

		for (int i = k, j = 0; i < arr2.length + k; i++, j++) {
			if (arr[i] != 0) {
				arr[arr2.length + i] = arr[i];
				arr[i] = arr2[j];
			} else {
				arr[i] = arr2[j];
			}
		}
		System.out.println("Объединенный массив: " + Arrays.toString(arr));
	}
}
