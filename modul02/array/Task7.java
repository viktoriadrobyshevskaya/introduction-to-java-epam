package by.jonline.modul02.array;

import java.util.Arrays;
import java.util.Random;

//Даны действительные числа a1, a2, ..., an. Найти max(a+a2n, a2+a2n-1, ..., an+an+1).

public class Task7 {

	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		int sum = 0;
		int[] array = new int[10];

		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(20);
		}
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			sum = array[i] + array[array.length - 1 - i];
			if (sum > max) {
				max = sum;
			}
		}
		System.out.println(max);

	}
}
