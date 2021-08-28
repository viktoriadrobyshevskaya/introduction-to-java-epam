package by.jonline.modul02.array;

import java.util.Random;

//Дана последовательность действительных чисел а1 ,а2 ,..., аn. 
//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен. 

public class Task2 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(20);
		}

		int z = 12;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				count++;
			}
		}

		System.out.println(count);
	}
}
