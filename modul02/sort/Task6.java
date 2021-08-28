package by.jonline.modul02.sort;

import java.util.Random;

/* Сортировка  Шелла. Дан  массив n действительных  чисел. Требуется упорядочить его по возрастанию. Делается это следующим образом:
сравниваются два соседних элемента аi и аi+1. Если ai <= ai+1, то продвигаются на один элемент вперед. Если  аi > аi+1, то производится
перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
*/

public class Task6 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		fill(arr);
		System.out.println("Дана последовательность чисел: ");
		print(arr);
		sort(arr);
		System.out.println("\nСортировка Шелла (по возрастанию): ");
		print(arr);
	}

	public static void fill(int[] arr) {
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100);
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
				j++;
			}

		}
	}
}
