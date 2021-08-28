package by.jonline.modul02.array;

import java.util.Arrays;
import java.util.Random;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
//Если таких чисел несколько, то определить наименьшее из них. 

public class Task9 {

	public static void main(String[] args) {
		int n = 10;
		int[] arr = new int[n];

		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(20);
		}

		int currentCounter = 0; // текущее число повторений
		int biggestCounter = 0; // наибольшее число повторений
		int frequentEl = 0; // наиболее часто встречающийся элемент

		for (int i = 0; i < arr.length; i++) {
			for (int y = 0; y < arr.length; y++) {
				if (arr[i] == arr[y]) {
					currentCounter++;
				}
			}
			if (currentCounter > biggestCounter && arr[i] != frequentEl) {
				biggestCounter = currentCounter;
				frequentEl = arr[i];
			}
			if (currentCounter == biggestCounter && arr[i] != frequentEl) {
				if (arr[i] < frequentEl) {
					frequentEl = arr[i];
				}
			}
			currentCounter = 0;
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(String.format("Число %d является наименьшим из наиболее повторяющихся чисел", frequentEl));
	}
}