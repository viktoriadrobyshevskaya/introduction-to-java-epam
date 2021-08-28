package by.jonline.modul02.array;

import java.util.Arrays;
import java.util.Random;

//Дана последовательность целых чисел a1,a2,...,an. 
//Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,...,an).

public class Task8 {

	public static void main(String[] args) {
		int[] array = new int[10];

		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(5);
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i< array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		int count = 0;
		for(int x : array) {
			if(x == min) {
				count++;
			}
		}
		
		int [] array2 = new int[array.length-count];
		int y = 0;
		for(int i = 0; i< array.length; i++) {
			if(array[i] != min) {
				array2[y] = array[i];
				y++;
			} 
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
	}
}
