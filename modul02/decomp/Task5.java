package by.jonline.modul02.decomp;

import java.util.Arrays;

/*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
*/
	
public class Task5 {

	public static void main(String[] args) {
		int n = 5;
		int[] a = new int[n];
		int max2 = 0;

		fill(a);

		max2 = max2(a);
		System.out.println("В массиве: " + Arrays.toString(a));
		System.out.println("Второе максимальное число: " + max2);
	}

	public static int[] fill(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round((Math.random() * 100) - 50);
		}
		return arr;
	}

	public static int max2(int[] arr) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] != max && arr[i] > max2) {
				max2 = arr[i];
			}
		}
		return max2;
	}
}