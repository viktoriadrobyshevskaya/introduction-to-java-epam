package by.jonline.modul02.decomp;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 
public class Task7 {

	public static void main(String[] args) {

		System.out.println("Сумма факториалов нечетных чисел = " + sumFactorial());
	}

	public static int sumFactorial() {
		int sum = 0;
		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0) {
				sum = sum + factorial(i);
			}
		}
		return sum;
	}

	public static int factorial(int i) {
		int f = 1;
		for (int x = 1; x <= i; x++) {
			f = f * x;
		}
		return f;
	}
}
