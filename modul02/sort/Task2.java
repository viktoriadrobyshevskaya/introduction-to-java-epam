package by.jonline.modul02.sort;

import java.util.Arrays;
import java.util.Random;

//Даны две последовательности а1 <= a2 <= ...<= an, и b1<=b2<=...<=bn. Образовать из них новую последовательность чисел так, 
//чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

public class Task2 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int[] arr2 = new int[5];

		fill(arr);
		fill(arr2);

		System.out.println("Первый массив: " + Arrays.toString(arr));
		System.out.println("Второй массив: " + Arrays.toString(arr2));

		join(arr, arr2);

	}

	public static void fill(int[] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(50);
		}
		Arrays.sort(arr);
	}

	public static void join(int[] arr, int[] arr2) {
		arr = Arrays.copyOf(arr, arr.length + arr2.length);

		for (int i = arr.length - arr2.length, j = 0; i < arr.length; i++, j++) {
			arr[i] = arr2[j];
		}

		Arrays.sort(arr);
		System.out.println("Объединенный массив: " + Arrays.toString(arr));

	}
}
