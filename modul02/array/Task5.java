package by.jonline.modul02.array;

import java.util.Arrays;
import java.util.Random;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task5 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(20);
		}
		System.out.println(Arrays.toString(arr));

		int i = 10;

		for (int x : arr) {
			if (x > i)
				System.out.print(x + " ");
		}
	}
}