package by.jonline.modul02.array;

import java.util.Arrays;
import java.util.Random;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент 
//(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать. 

public class Task10 {

	public static void main(String[] args) {
		int n = 20;
		int[] a = new int[n];
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				a[i] = 0;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
