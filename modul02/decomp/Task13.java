package by.jonline.modul02.decomp;

import java.util.Scanner;

//Два простых числа называются "близнецами", если они отличаются друг от друга на 2(напр, 41 и 43).
//Найти и напечатать все пары "близнецов" из отрезка [n, 2n], где n - заданное натуральное число больше 2.
//Для решения задачи использовать декомпозицию.

public class Task13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число N: ");
		int n = sc.nextInt();

		int[] arr = new int[n + 1];

		fill(arr, n);

		System.out.println("На отрезке [" + n + ", " + n * 2 + "] близнецами являются: ");

		twins(arr);
	}

	public static void fill(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++, n++) {
			arr[i] = n;
		}
	}

	public static void twins(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			if (isSimple(arr[i]) && isSimple(arr[i + 2])) {
				System.out.println(arr[i] + " � " + arr[i + 2]);
			}
		}
	}

	public static boolean isSimple(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
