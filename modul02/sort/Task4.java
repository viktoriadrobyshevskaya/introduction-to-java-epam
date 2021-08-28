package by.jonline.modul02.sort;

import java.util.Arrays;
import java.util.Random;

/* Сортировка  обменами. Дана последовательность  чисел а1 <= а2 <= ...<= аn. Требуется переставить  числа  в порядке  возрастания.
Для   этого  сравниваются  два  соседних   числа   ai и ai+1. Если   ai > ai+1, то делается перестановка. Тaк продолжаемся до тex пор,
пока все элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/

public class Task4 {

	public static void main(String[] args) {
		int[] arr = new int[8];

		fill(arr);

		System.out.println("Дана последовательность: " + Arrays.toString(arr));

		sort(arr);

	}

	public static void fill(int[] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(50);
		}
	}

	public static void sort(int[] arr) {
		int i = 0;
		int count = 0;

		while (i < arr.length) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
					count++;
				} else {
					continue;
				}
			}
			i++;
		}
		System.out.println("Отсортирована по возрастанию: " + Arrays.toString(arr));
		System.out.println("Количество перестановок - " + count);
	}
}
