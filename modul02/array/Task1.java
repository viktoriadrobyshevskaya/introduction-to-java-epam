package by.jonline.modul02.array;

import java.util.Random;
import java.util.Arrays;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {

	public static void main(String[] args) {

		int[] a = new int[20];
		int k = 3;
		int sum = 0;
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum = sum + a[i];
			}
		}
		
		System.out.println(sum);
	}
}