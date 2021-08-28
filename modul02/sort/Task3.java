package by.jonline.modul02.sort;

import java.util.Arrays;
import java.util.Random;

/* Сортировка выбором. Дана последовательность чисел а1 <= a2 <= ...<= an. Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
*/

public class Task3 {

	public static void main(String[] args) {
		int[] arr = new int[9];

		fill(arr);

		System.out.println("Последовательность возрастающая: " + Arrays.toString(arr));

		sort(arr);

	}

	public static void fill(int[] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(50);
		}
		Arrays.sort(arr);
	}

	public static void sort(int[] arr) {
		int tmp;
		for (int i = 0; i < arr.length / 2; i++) {
			tmp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = tmp;
		}
		System.out.println("Последовательность убывающая: " + Arrays.toString(arr));
	}
}
