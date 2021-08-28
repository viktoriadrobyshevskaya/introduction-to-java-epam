package by.jonline.modul01.cycle;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
//Общий член ряда имеет вид: a(n) = 1/Math.pow(2, n) + 1/ Math.pow(3, n)

public class Task5 {

	public static void main(String[] args) {
		double e = -2;
		
		double sum = 0;
		int n = 15;
		double a;

		for (int i = 1; i < n; i++) {
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
		
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}

		System.out.println("Сумма членов ряда, модуль которых >= " + e + " равна " + sum);
	}
}
