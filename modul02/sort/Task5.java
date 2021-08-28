package by.jonline.modul02.sort;

import java.util.Random;

/* Сортировка вставками. Дана последовательность чисел а1, a2, ..., an. Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть а1,а2,...,аn - упорядоченная последовательность, т. е.
а1 <= а2 <= ...<= аn. Берется следующее число аi+1 и вставляется в последовательность так, чтобы новая последовательность 
была тоже возрастающей. Процесс производится до тех пор, пока все элементы oт i+1 до n не будут перебраны. Примечание.
Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска. 
Двоичный поиск оформить в виде отдельной функции.
*/

public class Task5 {

	public static void main(String[] args) {
		int[] arr = new int[8];

		fill(arr);
		System.out.println("Дана последовательность чисел: ");
		print(arr);
		sort(arr);
		System.out.println("\nСортировка вставками (по возрастанию): ");
		print(arr);

	}

	public static void fill(int[] arr) {
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100);
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > current) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = current;
		}
	}
}
