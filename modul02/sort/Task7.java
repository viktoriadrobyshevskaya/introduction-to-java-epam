package by.jonline.modul02.sort;

import java.util.Arrays;
import java.util.Random;

/* Пусть даны две неубывающие последовательности действительных чисел  а1 <= a2 <= ...<= an и b1 <= b2 <= ...<= bn.
Требуется указать те места, на которые нужно вставлять элемент последовательности b1 <= b2 <= ...<= bn в первую последовательность так, 
чтобы новая последовательность оставалась возрастающей.
*/

public class Task7 {

	public static void main(String[] args) {
		int[] arr = new int[8];
		int[] arr2 = new int[3];

		fill(arr);
		fill(arr2);
		System.out.println("Даны две последовательности чисел: ");
		print(arr);
		System.out.println();
		print(arr2);
		arr = join(arr, arr2);
		sort(arr);
		System.out.println("\nОбъединенная последовательность: ");
		print(arr);
		index(arr, arr2);
	}

	public static void fill(int[] arr) {
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100);
		}
		Arrays.sort(arr);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] join(int[] arr, int[] arr2) {
		arr = Arrays.copyOf(arr, arr.length + arr2.length);
		for (int i = arr.length - arr2.length, j = 0; i < arr.length; i++, j++) {
			arr[i] = arr2[j];
		}
		return arr;
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				j++;
			}
		}
	}

	public static void index(int[] arr, int[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr2[i] == arr[j]) {
					System.out.println("\nЭлемент " + arr2[i] + " стал на место под индексом " + j);
				}
			}
		}

	}
}
