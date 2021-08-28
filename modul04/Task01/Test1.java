package by.jonline.modul04.Task01;
// Создайте класс Test1 c двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
public class Test1 {

	public static int a = 4;
	public static int b = 5;

	public static void main(String[] args) {
		print(a);
		print(b);
		change(a);
		change(b);
		sum(a, b);
		max(a, b);
	}

	public static void print(int a) {
		System.out.println("Переменная: " + a);
	}

	public static void change(int a) {
		System.out.println("Изменение переменной: " + (a * 3));

	}

	public static void sum(int a, int b) {
		System.out.println("Сумма а + b = " + (a + b));

	}

	public static void max(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		System.out.println("Наибольшее значение: " + max);
	}

}
