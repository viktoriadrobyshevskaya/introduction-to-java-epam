package by.jonline.modul02.array;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами. 

public class Task6 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}

		for (int i = 0; i < arr.length; i++) {
			BigInteger b = BigInteger.valueOf(i);
			boolean isTrue = b.isProbablePrime((int) Math.log(i));
			if (isTrue && i > 1) {
				sum = sum + arr[i];
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	}
}
