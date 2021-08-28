package by.jonline.modul02.decomp;

import java.util.Scanner;

//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
//Сколько таких действий нужно, чтобы получить 0? Использовать декомпозицию.

public class Task17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число X: ");
		int x = sc.nextInt();

		System.out.println("Нужно совершить " + count(x) + " вычитаний суммы цифр от числа " + x + ", пока не получится ноль.");
	}

	public static int sum(int x) {
		int sum = 0;
		while (x != 0) {
			sum = sum + (x % 10);
			x = x / 10;
		}
		return sum;
	}

	public static int calculate(int x) {
		return x - sum(x);
	}

	public static int count(int x) {
		int count = 0;
		while (x != 0) {
			x = calculate(x);
			count++;
		}
		return count;
	}
}
