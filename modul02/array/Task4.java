package by.jonline.modul02.array;

import java.util.Arrays;
import java.util.Random;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы. 

public class Task4 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(50);
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int indexMin = 0;
		int indexMax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				indexMin = i;
			}
			if (arr[i] > max) {
				max = arr[i];
				indexMax = i;
			}
		}

		System.out.println(Arrays.toString(arr));

		int temp = arr[indexMax];
		arr[indexMax] = arr[indexMin];
		arr[indexMin] = temp;

		System.out.println(Arrays.toString(arr));

	}
}
