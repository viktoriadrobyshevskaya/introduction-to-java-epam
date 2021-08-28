package by.jonline.modul01.branch;

import java.util.Scanner;

// Найти max{min(a, b), min(c, d)}. 

public class Task2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int min;
		int min2;
		int max;
		if (a > b) {
			min = b;
		} else
			min = a;

		if (c > d) {
			min2 = d;
		} else
			min2 = c;

		if (min > min2) {
			max = min;
		} else
			max = min2;

		System.out.println(max);
	}
}
